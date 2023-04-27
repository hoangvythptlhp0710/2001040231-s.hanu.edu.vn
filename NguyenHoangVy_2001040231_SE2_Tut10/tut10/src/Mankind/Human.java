package Mankind;

public class Human {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.charAt(0) >= 'a' && firstName.charAt(0) <= 'z') {
            throw new IllegalArgumentException("Expected upper case letter! Argument: firstName");
        }
        else if (firstName.length() <= 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.charAt(0) >= 'a' && lastName.charAt(0) <= 'z') {
            throw new IllegalArgumentException("Expected upper case letter! Argument: lastName");
        }
        else if (lastName.length() <= 3) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: lastName");
        }
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name" + this.getFirstName() + "\n" + "Last Name: " + this.getLastName() + "\n";
    }
}
