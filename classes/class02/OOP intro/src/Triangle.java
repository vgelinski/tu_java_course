
public class Triangle extends Shape {
	
	Triangle(double a, double h){
		d1 = a;
		d2 = h;
	}
	@Override
	public String getColor() {
		return "Червен";
	}

	@Override
	public void print() {
		System.out.println("Аз съм триъгълник");
	}



		@Override
	double getArea() {
		return d1*d2/2;
	}

}
