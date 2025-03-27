public class Person
{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) // Copy constructor
    {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Person originalPerson = new Person("Muneesh Khurana", 21);
        System.out.println("First Person:");
        originalPerson.displayPerson();
        System.out.println();
        // Creating a new object using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("Second Copy Person:");
        clonedPerson.displayPerson();
    }
}
