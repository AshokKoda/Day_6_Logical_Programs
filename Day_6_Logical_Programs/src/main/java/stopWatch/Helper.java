package stopWatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
	
	BufferedReader br;
	
	public Helper(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int inputInteger(){
		try{
			try{	
				return Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());	
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

}
