package javaProject.src.javaGamePackage;

import java.util.ArrayList;

public class Level {
    private String name, description;
    //Which direction is adjacent to which room
    private int n, s, e, w;
    //The items in the room
    private ArrayList<Item> items = new ArrayList<>();

    // Constructor
    public Level(String name, String description, int n, int s, int e, int w) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.s = s;
        this.e = e;
        this.w = w;
    }

    //Setters and getters ↓

    // Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    //Adjacent levels
    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setS(int s) {
        this.s = s;
    }
    public int getS() {
        return s;
    }
    public void setE(int e) {
        this.e = e;
    }
    public int getE() {
        return e;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getW() {
        return w;
    }

    // Items
    public String printItems() {
        return items.toString();
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void addItems(Item item) {
        items.add(item);
    }
    public void removeItems(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }
}
