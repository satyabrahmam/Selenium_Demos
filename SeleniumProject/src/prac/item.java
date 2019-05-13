package prac;

class rec{
	double width;
	double height;
	rec()
	{
		width = 10;
		height = 10;
		
	}
	double area()
	{
		return width*height;
	}
}
class item{
	static void  m1(int i)
	{
		i+= 4;
	}
	public static void main(String args[])
	{
		rec ob = new rec();
		double area ;
		area = ob.area();
		System.out.println(area);
		//int j = 12;
		//m1(j);
		//System.out.println(j);
	}
}