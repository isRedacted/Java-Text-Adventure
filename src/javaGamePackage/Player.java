package javaProject.src.javaGamePackage;

import java.util.ArrayList;

public class Player {
    private int health;
    private String name;
    //The map index of where the player is currently
    private int playerLocation;
    private ArrayList<Item> inventory = new ArrayList<>();

    // Constructor
    public Player(int initHealth) {
        health = initHealth;
    }

    //Setters and getters ↓

    // Player name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Player health
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
    public void changeHealth(int newHealth) {
        this.health += newHealth;
    }
    public int getHealth() {
        return health;
    }

    // Player location
    public int getPlayerLocation() {
        return playerLocation;
    }
    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    // Player inventory
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public void addToInventory(Item item) {
        inventory.add(item);
    }
    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }
}