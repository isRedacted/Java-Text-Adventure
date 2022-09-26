package javaProject.src.javaGamePackage;

//Each item (Toaster, bookshelf, flaming death sword, etc) will be given its own object
public class Item {
    String name;
    String description;

    //Constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
