/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author lisapage
 */
public class ScenarioView {
    Scenarios scenario;
    
    public ScenarioView(Scenario scenario) {
        this.scenario = scenario;
        
    }
    
    public void displayMenu() {
        this.scenario.displayInstructions();
        
        // display option 1 menu item
        // display option 2 menu item
        
        
    }
    
    public void getInput() {
        
        do {
            this.displayMenu();
            
            // scan and get input
            
            // check for invalid input then display error and continue
            // add if statement to check to see if the input refers to one of the extended scenarios, 
            //then run all methods etc for minigames, if false it continue through this loop
            // if option 1 then
                // get next scenario from listOfScenarios in option1ScenarioIndex position
                int nextScenarioIndex = this.scenario.option1ScenarioIndex;
                Scenarios nextScenario = Adventure1.listOfScenarios[nextScenarioIndex];
            
            // else
                // get next scenario from listOfScenarios in option2ScenarioIndex position
            
            // if end of game (last scenario) then
                // break
            ScenarioView nextScenarioView = new ScenarioView(nextScenario);
            nextScenarioView.getInput();
            
        } while (notEndOfGame);
        
        // print end of game stuff
        
    }
    
}
