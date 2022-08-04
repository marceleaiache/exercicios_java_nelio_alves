import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod_01, cod_02, qnt_01,qnt_02;
		double valor_01, valor_02, total;
		
		cod_01 = sc.nextInt();
		qnt_01 = sc.nextInt();
		valor_01 = sc.nextDouble();
		
		cod_02 = sc.nextInt();
		qnt_02 = sc.nextInt();
		valor_02 = sc.nextDouble();
		
		total = (qnt_01 * valor_01) + (qnt_02 * valor_02);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n" , total);

	}

}
