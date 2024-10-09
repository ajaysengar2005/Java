class Shape{
	double Area(){
		return 0;
		
	}
}

class Rectangle extends Shape{
	double length;
	double bredth;
	Rectangle(double l, double b){
		this.length = l;
		this.bredth = b;
		
	}
	double Area() {
		return length*bredth;
	}
}

class Tringle extends Shape{
	double base;
	double height;
	Tringle(double b, double h){
		this.base = b;
		this.height = h;
		
	}
	double Area() {
		return 0.5*(base*height);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Shape s = new Shape();
		double area = s.Area();
		System.out.println("Area : "+area);
		Rectangle r = new Rectangle(10,49);
		double arear = r.Area();
		System.out.println("Area : "+arear);
		Tringle t = new Tringle(6.7,49);
		double areat = t.Area();
		System.out.println("Area : "+areat);
	}

}
