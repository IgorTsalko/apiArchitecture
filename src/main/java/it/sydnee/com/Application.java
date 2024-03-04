package it.sydnee.com;

import it.sydnee.com.view.ConsoleController;
import it.sydnee.com.view.ConsoleControllerImpl;

//this is standard practise to call main class as "Application" - it should only start the app
public class Application {

    public static void main(String[] args) {
        ConsoleController consoleController = new ConsoleControllerImpl();
        consoleController.saveClient();
    }
}