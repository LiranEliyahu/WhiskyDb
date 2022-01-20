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
                {1} <colName>.insert.name@<field>:<indexName>,<field>:<value>,.....
                {2} <colName>.update.{<field>:<indexName>}, {<field>:<value>})
                {3} <colName>.remove.<name>
                {4} <colName>.find.name@<value>
                {5} <colName>.find.key@<filename>,<key>
                
                in order to quit write: q!""");
    }
    public void getWelcome(){
        System.out.println("\nWelcome to WhiskyDb!");
        System.out.println("[made by D1vine]");
        System.out.println("** when you get stuck just write help **");
    }
}
