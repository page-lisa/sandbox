package sandbox;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lisapage
 *
 */

public class Adventure1 {

    //create objects
    
    public static Scenarios[] listOfScenarios = new Scenarios[7];
    
    //declare instance variables
    String welcome = "\"Welcome to the Choose Your own Adventure Game. The object of the game is to arrive"
            + " at work successfully. You will encounter"
            + " obstacles along the way that must\\nbe overcome to complete the game. To select an "
            + "action, type the number assigned to the desired option and hit\\nenter. Proceed forward "
            + "until the game ends in disaster, or you arrive at work and win the game.";

    public static void main(String args[]) {

        Adventure1 adventure = new Adventure1();
        adventure.createScenarios(Adventure1.listOfScenarios);
        
        
        
    }
    
    private void createScenarios(Scenarios[] scenariosList) {
        Scenarios home = new Scenarios();
        home.instructions = "Welcome to my home";
        home.option1Description = "Take a ride";
        home.option2Description = "Take a walk";
        home.option1ScenarioIndex = 2;
        home.option1ScenarioIndex = 4;
        Adventure1.listOfScenarios[0] = home;
        
        ....
        
        
        Scenarios drive = new Scenarios();
        home.instructions = "Going for a drive";
        home.option1Description = "Take a freeeay";
        home.option2Description = "Take a shortcut";
        home.option1ScenarioIndex = 3;
        home.option1ScenarioIndex = 5;
        Adventure1.listOfScenarios[2] = drive;
        
        
    }
}
