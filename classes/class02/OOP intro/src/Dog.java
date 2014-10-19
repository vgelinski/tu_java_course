
public class Dog extends Animal{


	static int population = 0;
	
	Dog(){
		this("Шаро");
	}
	
	Dog(String name){
		super();
		this.name = name;
		Dog.population++;
	}
	
	public int age;
	
	
	void bark(int param){
		System.out.println("Бау " + param);
	}
	
	static void rename(Dog d, String newName){
		d.name = newName;
	}
	
	void breath(){
		super.breath();
		System.out.println("Дишам и издишам");
	}
	

}
