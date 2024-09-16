/*Crear un programa que permita registrar cinco sueldos de empleados, Determinar el total de sueldos y el sueldo promedio.
     Datos de Prueba:
     Sueldo 1:3500
     Sueldo 2:2800
     Sueldo 3:4500
     Sueldo 4:5000
     Sueldo 5:1025
Total de Sueldo:16,2825
Promedio de sueldo:3,365 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sueldo 1: s/ ");
        int sueldo1 = scan.nextInt();
        System.out.print("Sueldo 2: s/ ");
        int sueldo2 = scan.nextInt();
        System.out.print("Sueldo 3: s/ ");
        int sueldo3 = scan.nextInt();
        System.out.print("Sueldo 4: s/ ");
        int sueldo4 = scan.nextInt();
        System.out.print("Sueldo 5: s/ ");
        int sueldo5 = scan.nextInt();

        double total = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        double promedio = total/5;

        System.out.println("Total de sueldo: s/ "+total);
        System.out.println("Promedio de sueldo: s/ "+promedio);
        }
    }
