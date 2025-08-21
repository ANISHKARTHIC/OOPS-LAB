import java.util.Scanner;

// Base class
class Character {
    String name;
    
    // Constructor
    Character(String name) {
        this.name = name;
    }
    
    void walk() {
        System.out.println(name + " is walking.");
    }
}

// Single inheritance
class Warrior extends Character {
    Warrior(String name) {
        super(name);  // calling base class constructor
    }
    
    void attack() {
        System.out.println(name + " attacks with a jutsu.");
    }
}

// Multilevel inheritance
class EliteWarrior extends Warrior {
    EliteWarrior(String name) {
        super(name);
    }
    
    void specialAttack() {
        System.out.println(name + " performs a special attack!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input dynamically
        System.out.print("Enter character name: ");
        String cname = sc.nextLine();

        EliteWarrior ew = new EliteWarrior(cname);

        // Calling inherited methods
        ew.walk();
        ew.attack();
        ew.specialAttack();
    }
}
