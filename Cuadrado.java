package modelo;

import java.util.Scanner;

public class Cuadrado {
	public static float area(float lado, int cual) {
		if (cual==1) {
			return lado*lado*lado;
		}
		if (cual==2) {
			return (float) Math.pow(lado, 2);
		}
		return cual;
		
	}
	public static float perimetro(float lado, int cual) {
		if (cual==1) {
			return 12*lado;
		}
		if (cual==2) {
			return 4*lado;
		}
		return cual;
		
	}
	public static void menuCuadrado(float lado, int cual) {
		int opcion;
		do {
			System.out.println("Tu valor es: "+lado+"\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Menu \n1.-Calcular Area \n2.-Calcular Perimetro\n3.-regresar al menu anterior \nIngresa la opcion: ");
		opcion =  entrada.nextInt();
		switch (opcion) {
		case 1:
				System.out.println("RESULTADO ES: "+area(lado, cual)+" m²");
			break;
		case 2:
			System.out.println("RESULTADO ES: "+perimetro(lado, cual)+" m²");
			break;
		/*case 3:
			System.out.println("Ingresa la medida de un lado: ");
			lado = entrada.nextFloat();
			break;*/
		default:
			break;
		}
		}while(opcion!=3);
	}
}