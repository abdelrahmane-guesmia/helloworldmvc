package helloworldmvc.model;
import helloworldmvc.Contract.*;
import java.io.*;

public class Model implements IModel
{
	public Model()
	{
		this.Message = "";
	}
	//Attribut
	public String Message;
	//Ouverture d'un fichier
	File f = new File("HelloWorld.txt");
	FileReader fileReader;
	public String getHelloWorld()
	{
		try
		{
			fileReader = new FileReader(f);
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("Le fichier n'a pas été trouvé");
		}
		//Lecture
		try
		{
			int c = 0;
			while  ((c = fileReader.read()) != -1)
			{
				Message += (char)c;
			}
		}
		catch (IOException exception)
		{
			System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		}
		return Message;
	}
}
