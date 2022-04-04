package Teste;
import java.util.Scanner;

import PIlha.Pilha1;


public class teste3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Pilha1 pilha = new Pilha1();
		
		for(int i=0;i<10;i++) {
			System.out.print("digite um numero na pilha: ");
			pilha.adicionar(sc.nextInt());
		}
		System.out.println(pilha);
		
	}	
}
