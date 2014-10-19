
public class Rectangle extends Shape {

	Rectangle(double a, double b){
		d1 = a;
		d2 = b;
	}
	
	double getArea(){
		return d1 * d2;
	}

	@Override
	public String getColor() {
		
		return "Зелен";
	}

	@Override
	public void print() {
		System.out.println("Аз съм правоъгълник");
		
	}
}
