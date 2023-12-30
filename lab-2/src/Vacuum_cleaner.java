public class Vacuum_cleaner extends Appliances {
    private String color;
    private int price;
    
    public Vacuum_cleaner() {
        super("Mi", "pulse", 1980);
    }
    
    @Override
    public void printInfo() {
        System.out.println("  Cvacuumceanerleaner: " + getMark() + " - " + getName() + ", Year: " + getYear() + ", Чёорный: " + getColor()+ ", Price: " + getPrice() + " $ ");
    }
    
    @Override
    public void read() {
        System.out.println(" Товар  " + getMark() + " - " + getName() + " Закончился");
    }

    public String getColor() {
        return color;
    }
    
    public int getPrice() {
        return price;
    }

}