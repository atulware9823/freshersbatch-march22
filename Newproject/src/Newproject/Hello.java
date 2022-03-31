package Newproject;

public class Hello {
	public static void main(String[] args)
	{
		System.out.println("This is Hello Word program");
		second s = new second();
		s.second();
	}
}
class second
{
	void second()
	{
		System.out.println("Second class");
	}
}