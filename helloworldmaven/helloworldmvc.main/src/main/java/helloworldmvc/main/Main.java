package helloworldmvc.main;
import helloworldmvc.model.*;
import helloworldmvc.view.*;
import helloworldmvc.controller.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Model MODEL = new Model();
		View VIEW = new View();
		Controller CONTROLLER = new Controller(VIEW, MODEL);
		CONTROLLER.run();
	}

}
