public abstract class Appliances {
    protected String mark;
    protected String name;
    protected int year;
    public static int kol = 0;
    public Appliances(String mark, String name, int year) {
        this.mark = mark;
        this.name = name;
        this.year = year;
        kol += 1;
    }
    
    public abstract void printInfo();
    
    public abstract void read();
    
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getKol() {
        return kol;
    }
}