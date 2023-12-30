import java.util.LinkedList;
import java.util.Queue;

class Item {
    private final int weight;

    public Item(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Warehouse {
    private final Queue<Item> items = new LinkedList<>();

    public synchronized void addItem(Item item) {
        items.add(item);
        notify();
    }

    public synchronized Item takeItem() {
        return items.poll();
    }

    public synchronized boolean hasItems() {
        return !items.isEmpty();
    }
}

class Loader extends Thread {
    private final Warehouse warehouse;
    private static final int MAX_WEIGHT = 150;
    private int currentWeight = 0;
    private static int totalWeight = 0;

    public Loader(Warehouse warehouse, String name) {
        super(name);
        this.warehouse = warehouse;
    }


    private static synchronized void increaseTotalWeight(int weight) {
        totalWeight += weight;
    }


    public static int getTotalWeight() {
        return totalWeight;
    }

    @Override
    public void run() {
        try {
            while (totalWeight < MAX_WEIGHT) {
                synchronized (warehouse) {
                    while (!warehouse.hasItems()) {
                        warehouse.wait();
                    }
                    Item item = warehouse.takeItem();
                    if (item != null && currentWeight + item.getWeight() <= MAX_WEIGHT && totalWeight + item.getWeight() <= MAX_WEIGHT) {
                        currentWeight += item.getWeight();
                        increaseTotalWeight(item.getWeight());
                        System.out.println(getName() + " взял товар весом " + item.getWeight() + " kg. Текущий общий вес: " + getTotalWeight() + " kg.");
                    } else {
                        if (item != null) {
                            warehouse.addItem(item);
                        }
                        break;
                    }
                }
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " отправляется на другой склад с товарами на " + currentWeight + " kg.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();


        Loader loader1 = new Loader(warehouse, "Loader 1");
        Loader loader2 = new Loader(warehouse, "Loader 2");
        Loader loader3 = new Loader(warehouse, "Loader 3");

        loader1.start();
        loader2.start();
        loader3.start();


        for (int i = 1; i <= 10; i++) {
            warehouse.addItem(new Item(i * 10));
            Thread.sleep(50);
        }

        loader1.join();
        loader2.join();
        loader3.join();

        System.out.println("Все товары перенесены на другой склад. Общий весt: " + Loader.getTotalWeight() + " kg.");
    }
}
