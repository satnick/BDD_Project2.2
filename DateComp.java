package udf_proj;

import org.apache.pig.EvalFunc;

import java.io.IOException;

import org.apache.pig.data.Tuple;

public class DateComp extends EvalFunc<String> {
	
	public String exec(Tuple input) throws IOException
	{
		
		if(input == null || input.size() == 0)
		{
			return null;
		}
		try{
			
			String date1 = (String)input.get(0);
			String date2 = (String)input.get(1);
			
			if(date1.equalsIgnoreCase(date2))
				return "Same Day";
			return "Not Same Day";
		}
		catch(Exception e)
		{
			throw new IOException("Caught exception processing input row",e);
		}
	}

}
