import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String n;
	Double sf, tv, t;
	
	n = sc.next();
	sf = sc.nextDouble();
	tv = sc.nextDouble();
	t = sf + (tv * 0.15);
	
	System.out.printf("TOTAL = R$ %.2f%n", t);
	
	sc.close();
	
	
	
	
	}

}
