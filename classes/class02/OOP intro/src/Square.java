
public class Square extends Shape {
	
	Square(double d){
		d1 = d;
		d2 = d;
	}
	
	double getArea(){
		return d1*d2;
	}
	public String getColor(){
		return "Зелено";
	}
	
	public void print(){
		System.out.println("АЗ СЪМ КВАДРАТ");
	}
}
