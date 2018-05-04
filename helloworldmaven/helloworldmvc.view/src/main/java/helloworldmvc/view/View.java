package helloworldmvc.view;
import helloworldmvc.Contract.*;

public class View implements IView
{
	public void displayMessage(String message)
	{
		System.out.println(message);
	}
}
