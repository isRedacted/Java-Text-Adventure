package javaProject.src.javaGamePackage;

public class Parser {

    public String parseInput(String input[], String commands[]) {
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
}