package teste2;
import java.util.Scanner;
import Fila.Fila1;

public class teste2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fila1 positivo = new Fila1(5);
		Fila1 negativo = new Fila1(5);
		int num, i=0;
		
		do {
			System.out.print("digite um numero da fila: ");
			num=sc.nextInt();
			if(num>0){
				positivo.adicionar(num);
				System.out.println(positivo);
				i++;
			}
			if(num<0) {
				negativo.adicionar(num);
				System.out.println(negativo);
				i++;
			}
			
		}while(num!=0 && positivo.comprimento()<5 && negativo.comprimento()<5);
	
		System.out.println(positivo);
		System.out.println(negativo);
	

	}}
