class Person
{
    protected String name;
    protected int id;

    public Person(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface Worker
interface Worker
{
    void performDuties();
}

// Subclass Chef inheriting from Person and implementing Worker
class Chef extends Person implements Worker
{
    private String specialty;

    public Chef(String name, int id, String specialty)
    {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties()
    {
        System.out.println(name + " (Chef) is preparing " + specialty + " dishes.");
    }
}

// Subclass Waiter inheriting from Person and implementing Worker
class Waiter extends Person implements Worker
{
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned)
    {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " is serving " + tablesAssigned + " tables.");
    }
}

// Main class
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Tom", 117, "Italian");
        Chef chef2 = new Chef("Harris", 121, "Middle-Eastern");
        Chef chef3 = new Chef("Mohan", 123, "Indian");

        Waiter waiter1 = new Waiter("Tim", 212, 3);
        Waiter waiter2 = new Waiter("Tam", 213, 5);

        System.out.println("Restaurant Chef Details:");
        chef1.displayInfo();
        chef1.performDuties();
        chef2.displayInfo();
        chef2.performDuties();
        chef3.displayInfo();
        chef3.performDuties();
        System.out.println("---------------------------------\n");
        System.out.println("Restaurant Waiter Details");
        waiter1.displayInfo();
        waiter1.performDuties();
        waiter2.displayInfo();
        waiter2.performDuties();
    }
}
