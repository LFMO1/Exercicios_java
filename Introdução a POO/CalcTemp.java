import java.util.Scanner;


public class CalcTemp {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcTemp temp = new CalcTemp();
		
		
		System.out.print("digite a temperatura: ");
		temp.temperatura(sc.nextInt());
		
		
}
	
	public int temperatura(int temp) {
		
		int C = (temp * 9/5) +32;
		System.out.print("a temperatura é de: "+ C);
		
		return C;
	}

}
