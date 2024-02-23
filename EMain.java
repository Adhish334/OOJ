import java.util.Scanner;

// Custom exception class
class WrongAge extends Exception {
    public WrongAge() {
        super("Invalid age!");
    }
}

// Base class
class Father {
    private int age;

    // Constructor with age paramete
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge();
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// Derived class
class Son extends Father {
    private int sonAge;

    // Constructor with both father's and son's age
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Invoke base class constructor

        if (sonAge >= fatherAge) {
            throw new WrongAge();
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

// Main class
public class EMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fatherAge = scanner.nextInt();

            System.out.print("Enter son's age: ");
            int sonAge = scanner.nextInt();

            Father father = new Father(fatherAge);
            System.out.println("Father's age: " + father.getAge());

            Son son = new Son(fatherAge, sonAge);
            System.out.println("Son's age: " + son.getSonAge());
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
