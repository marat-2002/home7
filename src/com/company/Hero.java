package com.company;

public abstract class Hero implements HavingSuperAbility {
     int health;
     int damage;
     String typeOfAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfAbility() {
        return typeOfAbility;
    }

    public void setTypeOfAbility(String typeOfAbility) {
        this.typeOfAbility = typeOfAbility;
    }
}
