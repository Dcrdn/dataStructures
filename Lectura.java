import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Lectura {
	
	private int lineas;
	
	public void leer(){
		
		try{
			BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\diego\\Desktop\\lectura.csv"));
		    String strLine = "";
		    StringTokenizer st = null;
		  
		    //lee cada liinea
		    while( (strLine = br.readLine()) != null)
		    {
		    		st = new StringTokenizer(strLine, ",");
		           //ve si hay más caracteres
		            while(st.hasMoreTokens())
		            {
		                    System.out.println(st.nextToken());
		            }   
		    }
		}
		
		catch(Exception e)
		{
			System.out.println("Exception while reading csv file: " + e);                  
		}		
	}
	
	public static void main(String[] args) {
		Lectura ejemplo=new Lectura();
		
		ejemplo.leer();
	}
}