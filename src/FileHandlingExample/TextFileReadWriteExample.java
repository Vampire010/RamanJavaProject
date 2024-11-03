package FileHandlingExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReadWriteExample 
{

    // Method to write data to a file
	public static void writeToFile(String filePath , String data) 
	{
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
		{
			writer.write(data);		

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Method to read data from a file
    public static void readFromFile(String filePath) 
    {
    	try(BufferedReader  reader  = new BufferedReader (new FileReader(filePath)))
		{
			String line;
            System.out.println("Reading from file:");
            while((line=reader.readLine()) != null)
            {
            	System.out.println(line);                
            }

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    	
    }
	
	public static void main(String[] args) throws IOException
	{
		String filePath = "C:\\Users\\Rocky\\eclipse-workspace\\Firstbasicproject\\src\\FileHandlingExample\\exampleTextFile.txt";
        String dataToWrite = "It’s National Joke Day, and your cheesy, mostly funny Assistant has a few jokes up its sleeve. Here are a couple of our favorites:\r\n"
        		+ "\r\n"
        		+ "You: “Ok Google, tell me a joke.”\r\n"
        		+ "Google Assistant: “One joke, coming up! What is a sea monster’s favorite snack? Ships and dip.” 🛳\r\n"
        		+ "Not your speed? What about…\r\n"
        		+ "\r\n"
        		+ "You: “Ok Google, tell me a joke.”\r\n"
        		+ "Google Assistant: “This might make you laugh. How do robots eat guacamole? With computer chips.”\r\n"
        		+ "So head outside—“Ok Google, comedy shows nearby”—or take a seat—“Ok Google, tell me a joke”—and cue the laugh track";
        
		writeToFile(filePath,dataToWrite);
		readFromFile(filePath);

	}

}
