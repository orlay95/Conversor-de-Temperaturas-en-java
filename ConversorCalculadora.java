import java.util.Scanner;

/**
 * 
 * @author Orlay.molina
 * @version 1.0 
 * 
 * Calculadora de conversion de unidades de temperatura
 * Conversor Calculadora:  funcion main que se encarga de invocar todas la funciones del programa 
 */

public class ConversorCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		double tempInicial, resultado;
		
		while (opcion != 7) {

			if (opcion == 1) { 
				System.out.print("Digite la temperatura en Kelvin: ");
				tempInicial = teclado.nextDouble();
				resultado = convertirKelvinACelsius(tempInicial);
				System.out.println("La temperatura en Celsius es: " + resultado + "\n");
			}
			if (opcion == 2) {
				System.out.print("Digite la temperatura en Kelvin: ");
				tempInicial = teclado.nextDouble();
				resultado = convertirKelvinAFahrenheit(tempInicial);
				System.out.println("La temperatura en Fahrenheit es: " + resultado + "\n");
			}
			if (opcion == 3) {
				System.out.print("Digite la temperatura en Celsius: ");
				tempInicial = teclado.nextDouble();
				resultado = convertirCelsiusAKelvin(tempInicial);
				System.out.println("La temperatura en Kelvin es: " + resultado + "\n");				
			}
			if (opcion == 4) { 
				System.out.print("Digite la temperatura en Fahrenheit");
				tempInicial = teclado.nextDouble();
				resultado = convertirFahrenheitAKelvin(tempInicial);
				System.out.println("La temperatura en Kelvin es: " + resultado + "\n");	
				System.out.println(" ");
			}
			if (opcion == 5) { 
				System.out.print("Digite la temperatura en Fahrenheit");
				tempInicial = teclado.nextDouble();
				resultado = convertirFahrenheitACelsius(tempInicial);
				System.out.println("La temperatura en Celsius es: " + resultado + "\n");	
				System.out.println(" ");
			}
			if (opcion == 6) { 
				System.out.print("Digite la temperatura en Clesius");
				tempInicial = teclado.nextDouble();
				resultado = convertirCelsiusAFahrenheit(tempInicial);
				System.out.println("La temperatura en Fahrenheit es: " + resultado + "\n");	
				System.out.println(" ");
			}
			opcion = mostrarMenu(teclado);
		} // fin while
		
	}
	/**
	 * Mostrar Menu 
	 * 
	 * Muestra el menu de conversion de unidades de temperatura
	 * @return int opcion seleccionada por el usuario
	 */
	
	public static int mostrarMenu(Scanner teclado) {
		
		int opcion;
		System.out.println("  ---- MENU ----  " + "\n");
		System.out.println("1. Convertir Kelvin a Celsius");
		System.out.println("2. Convertir Kelvin a Fahrenheit");
		System.out.println("3. Convertir Celsius a Kelvin");
		System.out.println("4. Convertir Fahrenheit a Kelvin");
		System.out.println("5. Convertir Fahrenheit a Celsius");
		System.out.println("6. Convertir Celsius a Fahrenheit");
		System.out.println("7. Salir");
		opcion = teclado.nextInt();
		if (opcion == 7) {
			System.out.println ("--- Programa Terminado ---");
		}
		return opcion;
	}
		
	/**
	 * ConversorKelvinACelsius: Funcion que recibe una temperatura en Kelvin y
	 * la convierte a Celsius
	 * @param kelvin: temperatura en grados Kelvin
	 * @return celsius resultado de la operacion C = K -273,15
	 */
	public static double convertirKelvinACelsius(double kelvin) {
		
		double celsius;
		celsius = kelvin - 273.15;
		return celsius;
	}
	
	/**
	 * ConversorKelvinAFaherenheit: Funcion que recibe una temperatura en kelvin y
	 * la convierte a Fahrenheit
	 * @param kelvin: temperarura en Kelvin
	 * @return Fahrenheit resultado de la operacion ((9 * (K - 273,15)) / 5) + 32
	 */
	public static double convertirKelvinAFahrenheit(double kelvin) {
		
		double fahrenheit;
		fahrenheit = ((9 * (kelvin - 273.15)) / 5)  + 32;
		return fahrenheit;
	}
	
	/**
	 * ConversorCelsiusAkelvin: Funcion que recibe una temperatura en Celsius y
	 * la convierte a Kelvin
	 * @param celsius: temperatura en Celsius
	 * @return Kelvin resultado de la operacion C + 273,15
	 */
	public static double convertirCelsiusAKelvin(double celsius) {
	
		double kelvin;
		kelvin = celsius + 273.15;
		return kelvin;
	}
	
	/**
	 * ConvertirFahrenheitAkelvin: Funcion que recibe temperatura en Fahrenheit y
	 * la convierte a Kelvin
	 * @param fahrenheit: temperatura en Fahrenheit
	 * @return kelvin resultado de la operacion (5 * (fahrenheit - 32) / 9 ) + 273,15
	 */
	public static double convertirFahrenheitAKelvin(double fahrenheit) {

		double kelvin;
		kelvin = (5 * (fahrenheit - 32) / 9 ) + 273.15;
		return kelvin;
	}
	
	/**
	 * ConvertirFahrenheitACelsius: Funcion que recibe una temperatura en Fahrenheit y
	 * la convierte a Celsius
	 * @param fahrenheit: temperatura en grados fahrenheit
	 * @return celsius resultado de la operacion (5 * (fahrenheit - 32)) / 9
	 */
	public static double convertirFahrenheitACelsius(double fahrenheit) {
		
		double celsius;
		celsius =  (5 * (fahrenheit - 32)) / 9;
		return celsius;
	}
	
	/**
	 * ConversirCelsiusAFahrenheit: Funcion que recibe una temperatura en Celsius y
	 * la convierte a Fahrenheit
	 * @param celsius: temperatura en grados celsius
	 * @return fahrenheit resultado de la operacion ((9 * celsius)/ 5) + 32
	 */
	public static double convertirCelsiusAFahrenheit(double celsius) {
		
		double fahrenheit;
		fahrenheit =  ((9 * celsius)/ 5) + 32;
		return fahrenheit;
	}

}
