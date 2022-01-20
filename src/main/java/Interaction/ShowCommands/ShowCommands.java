package Interaction.ShowCommands;

public class ShowCommands {
    public ShowCommands(){
        getWelcome();
        getHelp();
    }

    public void getHelp(){
        System.out.println("""

                commands:
                **< in order to use the db you must create a collection >**
                here are the commands:
                
                Collection commands:
                {1} create <name>
                {2} show <name or empty>
                {3} delete <name>

                Docs commands:
                {1} <colName>.insert.({<field>:<indexName>, <field>:<value>, .....})
                {2} <colName>.update.({<field>:<indexName>}, {<field>:<value>})
                {3} <colName>.remove.(<name>)
                {4} <colName>.find.(<K or empty>)""");
    }
    public void getWelcome(){
        System.out.println("\nWelcome to WhiskyDb!");
        System.out.println("** when you get stuck just write help **");
    }
}
