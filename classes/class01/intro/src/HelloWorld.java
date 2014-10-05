import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		
		int[] arr = new int[20];
		String[] words = {"Нещо", "Друго нещо", "", "Нищо"};
		
		for(String word : words){
			System.out.println(word);
		}
		
		int[] array = {1, 2, 3, 4, 5};
		for(int a : array){
			a = 10;
		}
		
		for(int a : array){
			System.out.println(a);
		}
		
		outer:
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(i == 3 && j == 7){
					break outer;
				}
			}
		}
		
		FileOutputStream fos = new FileOutputStream("test.txt");
		PrintWriter out = new PrintWriter(fos);
		out.println("test");
		out.flush();
		
		FileInputStream fis = new FileInputStream("test.txt");
		Scanner sc = new Scanner(fis);
		
		System.out.println(sc.nextLine());
		
		out.close();
		sc.close();
	}

}
