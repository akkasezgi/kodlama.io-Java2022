package week01;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : gectiniz");
			break;
		case 'C':
			System.out.println("Iyı : gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil : gectiniz");
			break;
		case 'F':
			System.out.println(" Malesef kaldiniz ");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}

	}

}
