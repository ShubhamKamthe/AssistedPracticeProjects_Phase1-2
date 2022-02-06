package Oops;

public class Sum {

		// Overloaded sum().
		public int sum(int x, int y)
		{
			return (x + y);
		}

		public int sum(int x, int y, int z)
		{
			return (x + y + z);
		}
		
		public double sum(double x, double y)
		{
			return (x + y);
		}

		public static void main(String args[])
		{
			Sum s = new Sum();
			System.out.println(s.sum(40, 205));
			System.out.println(s.sum(40, 250, 430));
			System.out.println(s.sum(40.5, 40.5));
		}
	}
