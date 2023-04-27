package Mankind;

public class Worker extends Human{
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private double weekSalary;
    private int hoursPerDay;
    private double salaryPerHour;

    public Worker(String firstName, String lastName, double weekSalary, int hoursPerDay, double salaryPerHour) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.hoursPerDay = hoursPerDay;
        this.salaryPerHour = salaryPerHour;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: workHoursPerDay");
        }

        this.hoursPerDay = hoursPerDay;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
