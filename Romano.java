package modelo;

import java.util.Scanner;

public class Romano {
	private static String fin="";
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa los numeros: \n");
		numero =  entrada.nextInt();
		if (numero<=1000) {
			evaluar(numero);
			System.out.println(fin);
		} else {
			System.err.println("ingresa un numero menor o igual que 1000 mil");
		}
		
	}
	public static void evaluar(int numero) {
		String cadena="";
		int opcion, l=0;
		do {
			cadena="";
			cadena += numero;
			opcion=cadena.length();
			char [] a= cadena.toCharArray();
			switch (opcion) {

			case 4:
				fin+="M";
				numero=numero-1000;
				break;
			case 3:
				for (int i = 0; i < a.length; i++) {
					if (a[i]=='9') {
						fin+="CM";
						l=9*100;
						numero=numero-l;
					}
					if (a[i]=='8') {
						fin+="DCCC";
						l=8*100;
						numero=numero-l;
					}
					if (a[i]=='7') {
						fin+="DCC";
						l=7*100;
						numero=numero-l;
					}
					if (a[i]=='6') {
						fin+="DC";
						l=6*100;
						numero=numero-l;
					}
					if (a[i]=='5') {
						fin+="D";
						l=5*100;
						numero=numero-l;
					}
					if (a[i]=='4') {
						fin+="CD";
						l=4*100;
						numero=numero-l;
					}
					if (a[i]=='3') {
						fin+="CCC";
						l=3*100;
						numero=numero-l;
					}
					if (a[i]=='2') {
						fin+="CC";
						l=2*100;
						numero=numero-l;
					}
					if (a[i]=='1') {
						fin+="C";
						l=1*100;
						numero=numero-l;
					}
					break;
				}
				break;
			case 2:
				for (int i = 0; i < a.length; i++) {
					if (a[i]=='9') {
						fin+="XC";
						l=9*10;
						numero=numero-l;
					}
					if (a[i]=='8') {
						fin+="LXXX";
						l=8*10;
						numero=numero-l;
					}
					if (a[i]=='7') {
						fin+="LXX";
						l=7*10;
						numero=numero-l;
					}
					if (a[i]=='6') {
						fin+="LX";
						l=6*10;
						numero=numero-l;
					}
					if (a[i]=='5') {
						fin+="L";
						l=5*10;
						numero=numero-l;
					}
					if (a[i]=='4') {
						fin+="XL";
						l=4*10;
						numero=numero-l;
					}
					if (a[i]=='3') {
						fin+="XXX";
						l=3*10;
						numero=numero-l;
					}
					if (a[i]=='2') {
						fin+="XX";
						l=2*10;
						numero=numero-l;
					}
					if (a[i]=='1') {
						fin+="X";
						l=1*10;
						numero=numero-l;
					}
					break;
				}
				break;
			case 1:
				for (int i = 0; i < a.length; i++) {
					if (a[i]=='9') {
						fin+="IX";
						l=9;
						numero=numero-l;
					}
					if (a[i]=='8') {
						fin+="VIII";
						l=8;
						numero=numero-l;
					}
					if (a[i]=='7') {
						fin+="VII";
						l=7;
						numero=numero-l;
					}
					if (a[i]=='6') {
						fin+="VI";
						l=6;
						numero=numero-l;
					}
					if (a[i]=='5') {
						fin+="V";
						l=5;
						numero=numero-l;
					}
					if (a[i]=='4') {
						fin+="IV";
						l=4;
						numero=numero-l;
					}
					if (a[i]=='3') {
						fin+="III";
						l=3;
						numero=numero-l;
					}
					if (a[i]=='2') {
						fin+="II";
						l=2;
						numero=numero-l;
					}
					if (a[i]=='1') {
						System.out.println("aqui");
						fin+="I";
						l=1;
						numero=numero-l;
					}
					break;
				}
				break;
			default:
				break;
			}
		} while (numero>0);
	}
}