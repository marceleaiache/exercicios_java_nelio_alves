import java.util.Locale;
import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num_func;
		double horas_trab, valor_hora, salario;
		
		num_func = sc.nextInt();
		horas_trab = sc.nextDouble();
		valor_hora = sc.nextDouble();
		
		salario = horas_trab * valor_hora;
		
		System.out.println("NUMBER = " + num_func);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		

	}

}
