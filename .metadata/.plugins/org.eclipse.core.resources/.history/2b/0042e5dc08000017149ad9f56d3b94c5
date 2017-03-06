package label_derivation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadProgram {
	
	public String findTarget(String statement)
	{
		String expression[]=statement.split("\\=");
		return expression[0];
	}
	
	public String[] findOperands(String statement)
	{
		String expression[]=statement.split("\\=");
		//String operands[]=expression[1].split("[%*/+-;]",-1); //[%*/+-^|;()\b]
		String temp=expression[1].replaceAll("[^0-9,a-z,A-Z]", " ");
		String operands[]=temp.split(" ");
		return operands;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Label> static_labels =new ArrayList<Label>();
		try{
			FileInputStream fstream=new FileInputStream(args[1]);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String line;
			while((line=br.readLine())!=null)
			{
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
}
