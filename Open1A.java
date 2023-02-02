class Tank {
    String name;
    int health;
    int damage;
    int armor;

    Tank(String name, int health, int damage, int armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor; 
    }
    
}

class DPS {
    String name;
    int health;
    int damage;

    DPS(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
}


class Open1A {
    Tank Reinhardt = new Tank("Reinhardt", 350, 75, 150);
    DPS McCree = new DPS("McCree", 200, 75);
}