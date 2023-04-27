package Person;

import Person.Child;
import Person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.valueOf(scanner.nextLine());
        String address = scanner.nextLine();
        try {
            Child child = new Child(name, age, address);
            System.out.println(child.toString());
            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}