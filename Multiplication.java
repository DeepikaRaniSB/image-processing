import java.util.Scanner;
public class Multiplication{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1=2,r2=3;
		int c1=3,c2=3;
		int mul;
		//int[100][100]=new C int[][];
		int C[][]=new int[100][100];
		int D[][]=new int[100][100];
		int E[][]=new int[100][100];
		int F[][]=new int[100][100];
		int G[][]=new int[100][100];
	
		System.out.println("Enter matrix1 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				E[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter matrix2 of size "+r2+" * "+c2);
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				F[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    G[i][j] += E[i][k] * F[k][j];
                }
            }
        }
		System.out.println("Image Product: Image1 * Image2");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(G[i][j]+" ");

			}
			System.out.println();
			
		}
		System.out.println("Enter matrix1 of size "+r1+" * "+c1);
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				C[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a constant to be multiplied.");
		mul = sc.nextInt();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				D[i][j] = C[i][j]*mul;

			}
			
		}
		System.out.println("Image * constant");
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