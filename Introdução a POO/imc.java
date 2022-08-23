import java.util.Scanner;

public class imc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imc oimc = new imc();
		
		double peso, altura;
		
		System.out.print("digite seu peso: ");
		peso=sc.nextInt();
		
		System.out.print("digite sua altura: ");
		altura=sc.nextInt();
		
		oimc.CalcImc(peso, altura);
		
	}
	
	public double CalcImc(double peso, double altura) {
		double imc=peso/(Math.pow(altura,2));
		System.out.println(imc);
		return imc;
	}

}
