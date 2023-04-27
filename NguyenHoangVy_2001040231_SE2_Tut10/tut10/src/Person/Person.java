package Person;

public class Person {

    private String name;

    private String address;
    private int age;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int age, String address) {
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Address: %s, Age: %d", this.getName(), this.getAddress(), this.getAge()));
        return sb.toString();
    }
}
