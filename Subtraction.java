import java.util.Scanner;
public class Subtraction{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1=3,c1=4;
		int sub;
		int C[][] = new int[100][100];
		int D[][] = new int[100][100];
		int E[][] = new int[100][100];
		int A[][] = new int[100][100];
		int B[][] = new int[100][100];
		System.out.println("Enter matrix1 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix2 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				B[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				C[i][j]=A[i][j]-B[i][j];

			}

		}
		System.out.println("Image1 - Image2");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(C[i][j]+" ");

			}
			System.out.println();
			
		}
		System.out.println("Enter matrix1 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				D[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a constant to be subracted.");
		sub = sc.nextInt();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				E[i][j] = D[i][j]-sub;

			}
			
		}
		System.out.println("Image - constant");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(E[i][j]+" ");

			}
			System.out.println();
			
		}

	}

}