public class Student {
    private String firstname;
    private int age;
    private String lastname;
    private int averagescore;

    public Student(String firstname, String lastname, int age, int averagescore) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.averagescore = averagescore;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAveragescore() {
        return averagescore;
    }

    public void setAveragescore(int averagescore) {
        this.averagescore = averagescore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                ", averagescore=" + averagescore +
                '}';
    }
}
