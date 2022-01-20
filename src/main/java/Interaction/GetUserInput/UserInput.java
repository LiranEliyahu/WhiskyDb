package Interaction.GetUserInput;

import java.util.Scanner;

public class UserInput {
    private final Scanner sc = new Scanner(System.in);

    public Scanner getScanner() {
        return sc;
    }

    public String getInput(){
        System.out.print("> ");
        return getScanner().nextLine();
    }

    public String[] formatDoc(String s){
        return s.split("\\.");
    }

    public String[] formatCol(String s){
        return s.split(" ");
    }
}
