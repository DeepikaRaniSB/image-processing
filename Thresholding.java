import java.util.Scanner;
class Thresholding{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A[][]=new int[100][100];
		//int B[][]=new int[100][100];
		int threshold_value;
		int r1=4,c1=3;
		System.out.println("Enter the elements of a "+r1+" * "+c1+" matrix in the range 0-255");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the threshold value");
		threshold_value = sc.nextInt();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				if(A[i][j]<threshold_value)
				{
					A[i][j]=0;
				}
				else
				{
					A[i][j]=1;
				}
			}
		}
		System.out.println("Output after thresholding: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}

	}

}