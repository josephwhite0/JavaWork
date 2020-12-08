
public class test {

	public static void main(String[] args) {
		String x = "something";
		
		char[] y = new char[x.length()];
		int[] freq = new int[x.length()];
		int k, j;
		char string[] = x.toCharArray();

		for(k = 0; k < x.length(); k++)
		{
			freq[k] = 1;
			for (j = k + 1; j < x.length();j++)
			{
				
				if(string[k] == string[j])
				{
					freq[k]++;
					string[j] = y[k];
					
				}
				System.out.println(freq[k] + " " + string[j]);
			}
			
		}


	}

}
