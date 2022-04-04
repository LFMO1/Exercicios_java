package Teste;
import java.util.Scanner;
import Lista.Lista1;

public class teste2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Lista1 positivo=new Lista1();
		Lista1 negativo=new Lista1();
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
	