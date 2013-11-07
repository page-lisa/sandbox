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
    /*String welcome = "\"Welcome to the Choose Your own Adventure Game. The object of the game is to arrive"
            + " at work successfully. You will encounter"
            + " obstacles along the way that must\\nbe overcome to complete the game. To select an "
            + "action, type the number assigned to the desired option and hit\\nenter. Proceed forward "
            + "until the game ends in disaster, or you arrive at work and win the game.";*/

    public static void main(String args[]) {

        Adventure1 adventure = new Adventure1();
        adventure.createScenarios(Adventure1.listOfScenarios);
        
        
       
    }
                                             //is this "listOfScenarios" incorrect?
    private void createScenarios(Scenarios[] listOfScenarios) {
        Scenarios home = new Scenarios();
        home.instructions = "Welcome to my home";
        home.option1Description = "Take a ride";
        home.option2Description = "Take a walk";
        home.option1ScenarioIndex = 1;
        home.option2ScenarioIndex = 2;
        home.currentIndex=0;
        Adventure1.listOfScenarios[0] = home;
       
        
        
        ExtendedScenarios drive = new ExtendedScenarios();
        drive.instructions = "Going for a drive";//Get Gas Price Game needs to fit somehow
        drive.option1Description = "Take a freeeay";
        drive.option2Description = "Take a backroad";
        drive.option1ScenarioIndex = 3;
        drive.option2ScenarioIndex = 4;
        drive.currentIndex = 1;
        Adventure1.listOfScenarios[1] = drive;
        
        Scenarios walk = new Scenarios();
        walk.instructions = "walk";
        walk.option1Description = "nature preserve";
        walk.option2Description = "bagel shop";
        walk.option1ScenarioIndex = 6;
        walk.option2ScenarioIndex = 5;
        walk.currentIndex = 2;
        Adventure1.listOfScenarios[2] = walk;
        
        Scenarios freeway = new Scenarios();
        freeway.instructions = "freeway inst";
        freeway.option1Description = "leads to lose";//need to display string explaining loss, function within the freeway object in the subclass to get loss marker
        freeway.option2Description = "leads to win";//same for win return endgame -999
        freeway.option1ScenarioIndex = 6;//this index value needs to change
        freeway.option2ScenarioIndex = 5;//this index value needs to change
        freeway.currentIndex = 3;
        Adventure1.listOfScenarios[3] = freeway;
        
        Scenarios backroad = new Scenarios();
        backroad.instructions = "backroad";
        backroad.option1Description = "leads to loss";
        backroad.option2Description = "leads to win";
        backroad.option1ScenarioIndex = 6;//this index value needs to change
        backroad.option2ScenarioIndex = 5;//this index value needs to change
        backroad.currentIndex = 4;
        Adventure1.listOfScenarios[4] = backroad;
        
        ExtendedScenarios bagelShop = new ExtendedScenarios();
        bagelShop.instructions = "bagelShop";
        bagelShop.option1Description = "leads to loss";
        bagelShop.option2Description = "leads to bagelMenu minigame, then to win";
        bagelShop.option1ScenarioIndex = 6;//this index value needs to change
        bagelShop.option2ScenarioIndex = 5;//this index value needs to change
        bagelShop.currentIndex = 5;
        Adventure1.listOfScenarios[5] = bagelShop;
        
        ExtendedScenarios naturePreserve = new ExtendedScenarios();
        naturePreserve.instructions = "nature preserve";
        naturePreserve.option1Description = "feed badger and win";
        naturePreserve.option2Description = "fight badger. 1 guess badger's weight, 2. healthpoints game, 3. end with loss or win";
        naturePreserve.option1ScenarioIndex = 6;//this index value needs to change
        naturePreserve.option2ScenarioIndex = 5;//this index value needs to change
        naturePreserve.currentIndex = 6;
        Adventure1.listOfScenarios[6] = naturePreserve;
        
        
        
        
    }
}
