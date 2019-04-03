
import util.java.scanner;

public class Masking{


	public void lpf(int p1[][], int p2[][], Dimension dim, int maskSize){

	Scanner sc=new Scanner(System.in);
	
	int w = dim.width;
	int h = dim.height;
	int max = 0, i=0, j=0;
	int start = maskSize/2;
	int size = maskSize*maskSize;
	int sum;

	try{
		for(i = start; i < h-start; i++)
		{
			for(j = start; j < w-start; j++){
				sum=0;
				for(int k = -1*start; k < (start+1); k++)
				{
					for(int l = -1*start; l < (start+1); l++)
					{
						System.out.println("k = " + k + " l= " + l);
						sum += p1[i+k][j+l];
					}
				}
					p2[i][j] = sum/size;
			}
		}
		
		for(i = 0; i < h; i++)
			for(j = 0; j < w; j++)

		if(i==0||j==0||i==h-1||j==w-1)
			p2[i][j] = p1[i][j];

	}catch(Exception e)
		{
			System.out.println("E i = " + i + " j = " +j);
		}
}