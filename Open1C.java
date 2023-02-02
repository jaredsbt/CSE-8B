class DPS {
    String name;
    int health;
    int damage;

    DPS (String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    String isAlive(int health) {
        if(health <= 0) {
            return "dead";
        } else {
            return "alive";
        }
    }

    Boolean alive(int health) {
        if(health <= 0) {
            return false;
        } else {
            return true;
        }
    }

}

class Open1C {
    DPS Reaper = new DPS("Reaper", 250, 100);
    String outcome = Reaper.isAlive(0);
    Boolean test2 = Reaper.alive(75);

}
