package calculator;

import java.io.BufferedReader;
import java.io.FileReader;

public class RunScript {
	public static void main(String[] args) {
		System.out.println("-----Execution Started--->");
		
		
		RunScript run= new RunScript();
		run.getTestScript();
		run.getResult();
		
	}
	public void getTestScript()
	{
		final String SEPERATOR=",";
		BufferedReader br=null;
		try
		{
			String line="";
			br= new BufferedReader(new FileReader("ExcelSheet.xlsx"));
			while(line= br.readLine()!=null)
			{
				String[] testLines= line.split(SEPERATOR);
				if(testLines[4].equalsIgnoreCase("yes"));
				// System.out.println(testLine[2]));
				TestScriptParameters testParam= new TestScriptParameters(testLines[1],testLines[2], testLines[3]);
				ececuteTest(testParam);
				testParam.CloseDriver();
			}
	}
		catch(Exception e) {
		e.printStackTrace();
	}
		finally {
			if(br!= null)
			{
				try {
					
				}
			}
		}

}
