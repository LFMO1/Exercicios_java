import java.util.Scanner;

public class AreaDoRetangulo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AreaDoRetangulo ret =new AreaDoRetangulo();
		
		int base, altura;
		
		System.out.print("digite a base: ");
		base=sc.nextInt();
		
		System.out.print("digite a altura: ");
		altura=sc.nextInt();
		
		ret.CalcRet(base, altura);
		
		
		
		
	}
	
	
	public int CalcRet(int base, int altura) {
		int resultado= base*altura;
		System.out.println("a área do retangulo é de: "+resultado);
		
		return resultado;
	}

}
