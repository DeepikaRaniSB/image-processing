import java.util.Scanner;

class ContrastStretching{

	Scanner sc=new Scanner(System.in);
	private int row;
	private int col;
	private float max=0,min=0;
	private float A[][]=new float[100][100];
	private float B[][]=new float[100][100];


	public void getInput()
	{
		System.out.println("Enter the dimension of the matric, rows & column:");
		row=sc.nextInt();
		col=sc.nextInt();
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				A[i][j]=sc.nextFloat();
			}
		}
	}

	public void findMinMax()
	{
		float max_val = A[0][0];
		float min_val = A[0][0];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(A[i][j]>max_val)
				{
					max_val=A[i][j];
				}
				if(A[i][j]<min_val)
				{
					min_val=A[i][j];      
				}
			}
		}
		max=max_val;
		min=min_val;
        
	}
	public void contrastStretch()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				B[i][j] = (A[i][j]-min)/(max-min);
			}
		}
	}
	public void display()
	{	
		System.out.println("Contrast Stretched image: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}

	}

}
