package operadores1;

import java.util.Scanner;

public class operadoresAritméticos1 {

	public static void main(String[] args) {
		
		
				/* Suma de tres notas */
	
		Scanner entrada = new Scanner(System.in);
		float calificacion1, calificacion2, calificacion3, suma;
		
		System.out.print("Digita 3 calificaciones: ");
		
		calificacion1 = entrada.nextFloat();
		calificacion2 = entrada.nextFloat();
		calificacion3 = entrada.nextFloat();
		
		
		
		
		suma = calificacion1 + calificacion2 + calificacion3;
		
		System.out.println("\n La suma de las calificaciones es: " + suma);
		
		
				/* Salario semanal de un empleado por horas trabajadas */
		
		
		int horasSemanales;
		float salarioHora, salarioTotal;
		System.out.println("Digite las horas semanales: ");
		
		horasSemanales = entrada.nextInt();
		
		System.out.println("Digita el salario por hora");
		salarioHora = entrada.nextFloat();
		
		salarioTotal = horasSemanales * salarioHora;
		
		System.out.println("\n El salario total es: " + salarioTotal);
		
		
		
		/* Guillermo, Luis y Juan */
		
		
		float Guillermo, Luis, Juan, sumar;
		
		System.out.println("Digita los dólares que tiene Guillermo");
		Guillermo = entrada.nextFloat();
		
		Luis = Guillermo/2;
		Juan = (Guillermo + Luis)/2;
		
		sumar= Guillermo + Luis + Juan;
		
		System.out.println("Lo que tiene Guillermo es: " + Guillermo);
		System.out.println("Lo que tiene Luis es: " + Luis);
		System.out.println("Lo que tiene Juan es: " + Juan);
		System.out.println("La suma de los tres es: " + sumar);
		
	}

}
