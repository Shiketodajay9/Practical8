package assignment8;

public class circle {//Data member
    double pi=3.14;
	int r;
	double area;
	//Constructor
	public circle(int r) 
	{
		super();
		this.r = r;
	}
	//Area method
	public double Area()
	{
		return area=pi*r*r;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
   circle c1=new circle(4);//first object creation
   System.out.println("Area Of First Circle:- "+c1.Area());//calling method
   circle c2=new circle(20);//second object creation
   System.out.println("Area Of Second Circle:- "+c2.Area());//calling method

}}
