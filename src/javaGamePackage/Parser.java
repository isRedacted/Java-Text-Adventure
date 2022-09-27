package javaProject.src.javaGamePackage;

import java.util.ArrayList;

public class Parser {

    public String parseVerb(String input[], String commands[]) {
        //Set the verb counter
        int verbsFound = 0;
        //Initilize the parsed verb
        String verb = "";

        //Compare the user's input array with the list of commands/verbs
        for (int i = 0; i < input.length; i++ ) {
            for (int foo = 0; foo < commands.length; foo++) {
                if (input[i] == commands[foo]) {
                    //If a match is found, add one to the verb counter and set verb to the command detected
                    verbsFound += 1;
                    verb = commands[foo];
                }
            }
        }
        //If there are too many or not enough verbs, return an empty value
        if (verbsFound != 1) {
            return("");
        }
        else {
            return verb;
        }
    }

    public ArrayList<String> parseObjects(String[] inputList, Player player, Level currentLevel) {
        ArrayList<String> parsedObjects = new ArrayList<>();
        for (int i = 0; i < inputList.length; i++) {
            if (inputList[i] = player.getInventory().get(i)) {
                parsedObjects.add(player.getInventory().get(i));
            }
            else if (inputList[i] = currentLevel.getItems().get(i)) {
                parsedObjects.add(currentLevel.getItems().get(i))
            }
        }
        return parsedObjects;

    }

    public String inputCommand(String parsedVerb, ArrayList<String> parsedObjects) {
    }
}