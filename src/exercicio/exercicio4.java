package exercicio;

 import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		String variavel01;
		String variavel02;
		String auxiliar;
				
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		variavel01 = leitura.nextLine();
		System.out.print("Informe o valor do segundo valor: ");
		variavel02 = leitura.nextLine();
		
		leitura.close();
		
		auxiliar = variavel01;
		variavel01 = variavel02;
		variavel02 = auxiliar;
		
		System.out.println("O valor de a será: " + variavel01 + "\nO valor de b será: " + variavel02);
	}
	

}
