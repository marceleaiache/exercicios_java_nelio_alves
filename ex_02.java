import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio,area, pi;
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		area = Math.pow(raio, 2) * pi;
		
		System.out.printf("A= %.4f%n", area);

	}

}
