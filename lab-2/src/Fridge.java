public class Fridge extends Appliances {
    private int weight;
    private int volume;
    private String condition;
    
    public Fridge(String mark, String name, int year, int weight, int volume, String condition) {
        super(mark, name, year);
        this.weight = weight;
        this.volume = volume;
        this.condition = condition;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Fridge: " + getMark() + " - " + getName() + ", Year: " + getYear() + ", Weight: " + getWeight() + "kg" + ", Volume:"
                + getVolume() + " liters" + ", Condition: " + getCondition() );
    }
    
    @Override
    public void read() {
        System.out.println("Sale " + getMark() + " 15%");
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }

    public String getCondition() {return condition;}
}
