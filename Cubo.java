package modelo;

import java.awt.Menu;
import java.util.Scanner;

public class Cubo extends Cuadrado {
	public static Cubo cubo = new Cubo();
	public static Cuadrado cuadrado = new Cuadrado();
	public static void main(String[] args) {
		int opcion=0;
		float lado=0, res=0;
		Scanner calculo = new Scanner(System.in);		
		do {
			System.out.println("Ingresa la medida de un lado: ");
			try {
				lado = calculo.nextFloat();
			} catch (Exception e) {
				System.out.println("Ingrese un numero y que sea mayor que 0");
				calculo = new Scanner(System.in);
			}
		} while (lado==0);
		do {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Menu \n1.-Calculos de Cubo \n2.-Calculos de Cuadrado \n3.-Cancelar \n4.-salir \nIngresa la opcion: ");	
		try {
			opcion =  entrada.nextInt();
		} catch (Exception e) {
			System.out.println("Ingresa un numero");
		}
		switch (opcion) {
		case 1:
			cubo.menuCubo(lado, opcion);
			System.out.println("Ingresa la medida de un lado: ");
			lado = calculo.nextFloat();
			break;
		case 2:
			cuadrado.menuCuadrado(lado, opcion);
			System.out.println("Ingresa la medida de un lado: ");
			lado = calculo.nextFloat();
			break;
		case 3:
			System.out.println("Ingresa la medida de un lado: ");
			lado = calculo.nextFloat();
			break;
		default:
			break;
		}
		}while(opcion!=4);
		
	}
	public static void menuCubo(float lado, int cual) {
		int opcion;
		do {
		System.out.println("Tu valor es: "+lado+"\n");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Menu \n1.-Calcular volumen \n2.-Calcular Perimetro\n3.-regresar al menu anterior \nIngresa la opcion: ");
		opcion =  entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("RESULTADO ES: "+area(lado, cual)+" m³");
			break;
		case 2:
			System.out.println("RESULTADO ES: "+cubo.perimetro(lado, cual)+" m²");
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