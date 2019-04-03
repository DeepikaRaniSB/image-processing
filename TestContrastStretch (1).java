class TestContrastStretch{

	public static void main(String args[])
	{
		ContrastStretching ob = new ContrastStretching();
		ob.getInput();
		ob.findMinMax();
		ob.contrastStretch();
		ob.display();
	}
}