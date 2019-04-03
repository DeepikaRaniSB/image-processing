import java.util.Scanner;
public class Division{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1=2,c1=3;
		int div;
		//int[100][100]=new C int[][];
		double C[][]=new double[100][100];
		double D[][]=new double[100][100];

		System.out.println("Enter matrix1 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				C[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a constant (divisor).");
		div = sc.nextInt();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				D[i][j] = C[i][j]/div;

			}
			
		}
		System.out.println("Image / constant");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(D[i][j]+" ");

			}
			System.out.println();
			
		}



	}

}