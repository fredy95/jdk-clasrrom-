trinagulo 

import java.util.Scanner;
public class triangulo {
     public static void triangulo(String[] args) {
        Scanner entrada = new Scanner(System.in);
        flost base;
	flost altura;
	flost area;
        System.out.println("Ingresa base");
        base = entrada.nextflost();
        System.out.println("Ingresa altura");
        altura = entrada.nextflost();
        
        area = (base * altura)/2;
       System.out.println("area del triangulo");
     }
}