package Teste;
import java.util.Scanner;
import PIlha.Pilha1;


public class teste2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Pilha1 positivo = new Pilha1();
		Pilha1 negativo = new Pilha1();
		int num;
		
		do {
			System.out.print("digite um numero: ");
			num=sc.nextInt();
			
			if(num>0) {
				positivo.adicionar(num);
				System.out.println(positivo);
			}
			if(num<0) {
				negativo.adicionar(num);
				System.out.println(negativo);
			}
		}while(num!=0 && positivo.comprimento()<10 && negativo.comprimento()<10);
	}	
}
