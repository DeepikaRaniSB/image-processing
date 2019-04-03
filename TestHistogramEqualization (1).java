import java.util.Scanner;
class HistogramEqualization{
	Scanner sc=new Scanner(System.in);
	private int row;
	private int col;
	private float max=0,min=0;
	private float Input[][]=new float[100][100];
	private float Output[][]=new float[100][100];
	private float Count[]=new float[256];
	private float Pr[]=new float[256];
	private float Sum[]=new float[256];

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
				Input[i][j]=sc.nextFloat();
			}
		}
	}
	public void getCount()
	{
		for(int k=0;k<Count.length;k++)
		{ 
			int count=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(k==Input[i][j])
					{
						count=count+1;
					}
				}
			}
			Count[k]=count;
		}

	}
	public void getProbability()
	{
		for(int k=0;k<Pr.length;k++)
		{
			Pr[k] = Count[k]/(row*col);
		}

	}
	public void getSum()
	{
		for(int i=0;i<Sum.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				Sum[i] = Sum[i]+Pr[j];	
			}
			//System.out.print(Sum[i]+" ");
			//System.out.println();
		}

	}
	
	public void equalize()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				int x=(int)Input[i][j];
				Output[i][j] = Sum[x]*10;
				//System.out.print(x+" ");
			}
		}
	}
	public void display()
	{	
		System.out.println("After Histogram Equalization: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print((int)Output[i][j]+" ");
			}
			System.out.println();
		}

	}
	

}
class TestHistogramEqualization{
	public static void main(String args[])
	{
		HistogramEqualization ob = new HistogramEqualization();
		ob.getInput();
		ob.getCount();
		ob.getProbability();
		ob.getSum();
		ob.equalize();
		ob.display();
	}

}