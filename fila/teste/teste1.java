package teste;
import Fila.Fila1;
import java.util.Scanner;


public class teste1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fila1 fila = new Fila1();
		
		for(int i=0;i<10;i++) {
			System.out.println("digite um numero da fila: ");
			fila.adicionar(sc.nextInt());
			System.out.println(fila);
		}
		
		
		while (!fila.vazia()) {
			fila.remover();
			System.out.println(fila);
		}

	}

}
