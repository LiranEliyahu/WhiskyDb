import Interaction.GetUserInput.UserInput;
import Interaction.ShowCommands.ShowCommands;
import MemoryInteraction.Directory.DeleteDir;
import MemoryInteraction.Directory.DirContent;
import MemoryInteraction.Directory.NewDir;
import Wrapper.CheckType.Collection.CollectionProcessor;
import Wrapper.CheckType.Document.DocumentProcessor;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ShowCommands s = new ShowCommands();
        UserInput ui = new UserInput();
        CollectionProcessor cp = new CollectionProcessor();
        DocumentProcessor dp = new DocumentProcessor();

        String input = "";

        while(!input.equals("q!")){
            input = ui.getInput();
            if(Objects.equals(input, "help")){
                s.getHelp();
            }
            else if(input.contains(".")){
                dp.getDocCommand(ui.formatDoc(input));
                System.out.println(Arrays.toString(ui.formatDoc(input)));

            }
            else {
                cp.getCollCommand(ui.formatCol(input));
                System.out.println(Arrays.toString(ui.formatCol(input)));
            }
        }
    }
}
