import java.util.Scanner;
class Blending{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r1=3,c1=3;
		int A[][] = new int[100][100];
		int B[][] = new int[100][100];
		double C[][] = new double[100][100];
		float x;
		System.out.println("Enter matrix1");

		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix2");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				B[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the blending ratio");
		x=sc.nextFloat();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				C[i][j] = x*A[i][j]+(1-x)*B[i][j];
			}
		}
		System.out.println("Output: Image1 blended with image2 in the ratio "+x);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(C[i][j]);
			}
			System.out.println();
		}



	}
}