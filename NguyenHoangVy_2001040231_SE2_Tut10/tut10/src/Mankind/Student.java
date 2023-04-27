package Mankind;

public class Student extends Human {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private int facultyNumber;

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        if (facultyNumber < 10000 || facultyNumber > 999999999)
            throw new IllegalArgumentException("Invalid faculty number!");
        this.facultyNumber = facultyNumber;
    }

    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ")
                .append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator())
                .append("Faculty Number: ").append(this.getFacultyNumber());
    }
}
