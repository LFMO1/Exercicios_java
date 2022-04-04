package Teste;
import java.util.Scanner;
import Lista.Lista1;

public class teste1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Lista1 lista=new Lista1();
		
		for(int i=0;i<lista.capacidade();i++) {
			System.out.println("digite um nome: ");
			lista.adicionar(sc.next());
			System.out.println(lista);
		}
	}

}
