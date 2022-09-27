package javaProject.src.javaGamePackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        //Declare all game variables
        //Defines whether the game's still running
        boolean gameState = true;
        //Create the user input object
        Scanner userInput = new Scanner(System.in);
        //Create the player
        Player player = new Player(5);
        //Create the verb/command parser
        Parser parser = new Parser();
        //Defines how to split up the user input
        String delims = " ";
        //The list of commands to compare with the user input in parseInput()
        String[] commands = {"look", "pick", "grab", "north", "n", "south", "s", "east", "e", "west", "w"};    
        //Create a map array of all the rooms
        ArrayList<Level> map = new ArrayList<Level>();
        //A sample room entry using this format:
        //Name, Description, Teleporters for: N, S, E, W
        map.add(new Level("Top", "description", -1, -1, -1, 1));
        map.add(new Level("Bottom", "description", -1, -1, 0, -1));

        map.get(0).addItems(new Item("Pointy sword", "Ouch"));

        // Main game loop
        do {
            //User input
            String input = userInput.nextLine();
            //Formatting
            input = input.trim().toLowerCase();
            //Split the user input into a string array
            String[] inputList = input.split(delims);
            //Get the verb/command from the user, check if there is one or if there's too many/none
            String parsedVerb = parser.parseVerb(inputList, commands);
            ArrayList<String> parsedObjects = parser.parseObjects(inputList, player, map.get(player.getPlayerLocation()));
            parser.inputCommand(parsedVerb, parsedObjects);

            //Interpret commands
            if (parsedInput != "") {
                parser.inputCommand(parsedInput);
            }
        }
            while(gameState == true);

        //Did this because vscode was nagging me about it :/
        userInput.close();
    }
}
