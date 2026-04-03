class Character {
    void attack() {}
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior attacks with sword");
    }
}

class Archer extends Character {
    void attack() {
        System.out.println("Archer attacks with bow");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage attacks with magic");
    }
}

public class Game {
    public static void main(String[] args) {
        Character c;

        c = new Warrior();
        c.attack();

        c = new Archer();
        c.attack();

        c = new Mage();
        c.attack();
    }
}