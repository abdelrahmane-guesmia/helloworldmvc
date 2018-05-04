package helloworldmvc.main;
import helloworldmvc.model.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Model LECTURE = new Model();
		System.out.println("DEBUT LECTURE");
		System.out.println(LECTURE.getHelloWorld());
		System.out.println("FIN LECTURE");
	}

}
