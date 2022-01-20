import Interaction.GetUserInput.UserInput;
import Interaction.ShowCommands.ShowCommands;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ShowCommands s = new ShowCommands();
        UserInput ui = new UserInput();
        String input;

        while(true){
            input = ui.getInput();
            if(Objects.equals(input, "help")){
                s.getHelp();
            }
            else if(input.contains(".")){
                System.out.println(Arrays.toString(ui.formatDoc(input)));

            }
            else {
                System.out.println(Arrays.toString(ui.formatCol(input)));
            }
        }
    }
}
