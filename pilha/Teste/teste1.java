package Teste;
import PIlha.Pilha1;
import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Pilha1 pilha = new Pilha1();

		
		for (int i = 0; i < 10; i++) {
			System.out.print("digite um numero: ");
			pilha.adicionar(sc.nextInt());
			System.out.println(pilha);
			
		}
		

	}

}



