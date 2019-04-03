import util.java.scanner;

public class MaskMain
{
	public static void main(String[] args) 
	{

		int[][] image=new int[100][100];
		int[][] mask_image=new int[100][100];
		Scanner sc=new Scanner(System.in);


		Masking mask = new Masking();

		System.out.println("Enter the first matrix");
		System.out.println("Rows:");
		int m=sc.nextInt();
		System.out.println("Columns:");
		int n=sc.nextInt();
		System.out.println("Enter the elements in first matrix");

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int pixels=sc.nextInt();
				image[i][j]=pixels;
			}
		}

		Dimension d1 =new Dimension(m.n);


		System.out.println("Enter the Second matrix");
		System.out.println("Rows:");
		int a=sc.nextInt();
		System.out.println("Columns:");
		int b=sc.nextInt();

		for(i=0;i<a;i++)
		{
			for( j=0;j<b;j++)
			{
				pixels=sc.nextInt();
				mask_image[i][j]=pixels;
			}
		}
		Dimension d2 =new Dimension(a,b);

		mask.lpf(image,mask_image,d1,d2);


	}
}