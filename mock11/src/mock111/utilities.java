package mock111;

public class utilities {
	
	public static void main(String[] args) {
	
		int n = 10;

		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k = 2; k <= i; k++)
			{
				System.out.print("*");
			}
			for(int l = 2; l <= i; l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
}

}