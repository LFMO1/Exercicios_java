package Teste;
import java.util.Scanner;
import PIlha.Pilha2;


public class teste4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pilha2 pilha =new Pilha2();
		Pilha2 extra =new Pilha2();
		int num=0;
		
		
		for(int i=0;i<pilha.capacidade();i++) {
			System.out.print("digite um numero para a pilha: ");
			num =sc.nextInt();
			if(num%3==0) {
				extra.adicionar(num);
			} 
			pilha.adicionar(num);
			if(num%2==0) {
				pilha.remover();
			
		}
		
		}
		System.out.println("pilha normal sem multiplos de dois: "+pilha);
		System.out.println("pilha multiplos de tres: "+extra);
	}
	

}
