package Reutilizacion;
import java.util.Scanner;

public class Entradas {

    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    public static long leerLong(String mensaje) {
        System.out.print(mensaje);
        long valor = sc.nextLong();
        sc.nextLine();
        return valor;
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static String leerPalabra(String mensaje) {
        System.out.print(mensaje);
        String valor = sc.next();
        sc.nextLine();
        return valor;
    }

    public static boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        boolean valor = sc.nextBoolean();
        sc.nextLine();
        return valor;
    }

    public static char leerCaracter(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().charAt(0);
    }
}
