package calculadoraEnConsola_package;
import java.util.Scanner;

public class CalculadoraEnConsola_Class {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        double num1 = 0;
        double num2 = 0;
        String entrada;

        do {
        	System.out.print("Introduce el primer número: ");
        	entrada = scanner.nextLine();
        	if(!esNumero(entrada)) {
        		System.out.println("Lo ingresado es incorrecto.");
        	}
        }while(!esNumero(entrada));
        num1 = Double.valueOf(entrada);
        
        do {
        	System.out.print("Introduce el segundo número: ");
        	entrada = scanner.nextLine();
        	if(!esNumero(entrada)) {
        		System.out.println("Lo ingresado es incorrecto.");
        	}
        }while(!esNumero(entrada));
        num2 = Double.valueOf(entrada);
        
        System.out.print("Introduce el operador (+, -, *, /): ");
    	entrada = scanner.nextLine();
        
    	calcular(num1, num2, entrada.charAt(0));

	}
	
	private static boolean esNumero(String entrada) {
		try {
			
			double d = Double.parseDouble(entrada);
			
		}catch( Exception e){
			return false;
		}
		return true;
	}
	
	private static void calcular(double num1, double num2, char operador) {
		double resultado;
		
		switch (operador) {
        case '+':
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
            break;
        case '-':
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
            break;
        case '*':
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
            break;
        case '/':
            if (num2 == 0) {
                System.out.println("No se puede dividir por cero");
                return;
            }
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
            break;
        default:
            System.out.println("Operador no válido");
            return;
    }
	}
	


}
