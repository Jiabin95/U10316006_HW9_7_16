import java.util.Scanner;
public class Array{
	//Main methods
	public static void sort(int m[][]){
		//For loops to do array
		for (int i =0;i<m.length;i++)
		{
			for (int j =0;j<m.length-1;j++)
			{
				if (m[j][0] >m[j+1][0])
				{
					int temp = m[j][0];
					int temp1 = m[j][1];
					m[j][0]= m[j+1][0];
					m[j][1]= m[j+1][1];
					m[j+1][0] = temp;
					m[j+1][1] = temp1;
				}
      
					if (m[j][0] == m[j+1][0])
					{
						if(m[j][1] >m[j+1][1])
						{
							int temp3 = m[j][1];
							m[j][1] = m[j+1][1];
							m[j+1][1] = temp3;
						}
					}

			}
		}
    
  }
  //Just a test
	public static void main (String[] args)
	{
		int[][] m = { {4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sort(m);
		System.out.println("{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}");
		//Print the answer
		System.out.println("The answer:");
		for (int i =0;i<m.length;i++)
		{
			System.out.print("{" + m[i][0] + "," + m[i][1]+ "}"+" ");  
		}		
	}
}
