package Main;

public class Vitaliy {
    private String firstName;
    private String lastName;
    private int age;
    private int iq;

    public Vitaliy(String firstName, String lastName, int age, int iq) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.iq = iq;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Vitaliy{" +
                "firs='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                '}';
    }
}
