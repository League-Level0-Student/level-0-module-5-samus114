package extra;

public class fibonnaci {
public static void main(String[] args) {
	int num1 = 0;
	int num2 = 1;
	int sum = num1 + num2;
	System.out.print("0, 1, ");
	for (int i = 0; i < 14; i++) { 
		System.out.print(sum+", ");
		num1 = num2;
		num2 = sum;
		sum = num1 + num2;
			
	}
}
}