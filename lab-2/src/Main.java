public class Main {
    public static void main(String[] args) {

        Fridge fridge1 = new Fridge("Ice100", "MX-1099", 2018 , 35 , 45, "Новый");
        Fridge fridge2 = new Fridge("GoodFood", "FT-108", 2014 , 40 ,25, "Б/у");
        fridge1.printInfo();
        fridge1.read();

        System.out.println();

        fridge2.printInfo();
        fridge2.read();

        System.out.println();
        
        Dishwasher dishwasher = new Dishwasher("WaterLand", "Wash-99", 2011, "rew.1", 220);
        dishwasher.printInfo();
        dishwasher.read();

        Dishwasher dishwasher2 = new Dishwasher("WaterLand", "Wash-99", 2011, "rew.1","rew.3", 220);
        dishwasher2.printInfo();
        dishwasher2.read();
        System.out.println();
        
        Vacuum_cleaner vacuumceanerleaner = new Vacuum_cleaner();
        vacuumceanerleaner.printInfo();
        vacuumceanerleaner.read();

        System.out.println(Appliances.getKol());
    }

}