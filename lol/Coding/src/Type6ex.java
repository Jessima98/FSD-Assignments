
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Type6ex
{
    public static void main(String[] args) 
    {
        BufferedReader bufferedReader = null;
        try 
        {
            bufferedReader = new BufferedReader(new FileReader("D:\\data.txt"));
            String st;
            while((st = bufferedReader.readLine())!=null) {
            	System.out.println(st);	
            }
        }
            
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            if(bufferedReader!=null)
            {
                try 
                {
                    bufferedReader.close();
                } catch (IOException e) 
                
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
