
public class Triangle_number {
	
	public static void main(String args[])
	{
		double start = System.nanoTime();
		System.out.println("Triangle Number");
		int limit=10;
		int tnum[]=new int[1000];
		for(int j=1; j<=limit;j++)
		{
			tnum[j]=tnum[j-1]+j;			
			System.out.println(j+":"+tnum[j]);
		}
		double end = System.nanoTime();
		System.out.println("Time Elapsed is: " + String.valueOf((end - start))
				+ "ns");
	}
}
