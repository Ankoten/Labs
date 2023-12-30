public class Dishwasher extends Appliances {
    private String model;
    private int consumption;

    private String  model2;
    
    public Dishwasher(String mark, String name, int year, String model, int consumption) {
        super(mark, name, year);
        this.model = model;
        this.consumption = consumption;
    }

    public Dishwasher(String mark, String name, int year, String model,String model2 ,int consumption) {
        super(mark, name, year);
        this.model = model;
        this.consumption = consumption;
        this.model2 = model2;
    }
    @Override
    public void printInfo() {
        System.out.println("Dishwasher: " + getMark() + " - " + getName() + ", Year: " + getYear() + ", Model: " + getModel() + ", Model2: " + getModel2() +  ", Consumption: " + getConsumption() + "  ");
    }
    
    @Override
    public void read() {
        System.out.println(" Buy now " + getMark() + " - " + getName() + " for 4999$");
    
    }  
    public String getModel() {return model;
    }
    
    public int getConsumption() {
        return consumption;
    }

    public String getModel2() {
        return model2;
    }
}