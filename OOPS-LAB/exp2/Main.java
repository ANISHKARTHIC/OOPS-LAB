class Character {
    String name;
    
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
        super(name);
    }
    
    void attack() {
        System.out.println(name + " attacks with a jutsu.");
    }
}

// Multi-level inheritance
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
        EliteWarrior ew = new EliteWarrior("GOJO");
        ew.walk();
        ew.attack();
        ew.specialAttack();
    }
}