import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ordenar_por_consola {
    public static void  main (String[] arg)
    {
        int[] numeros = new int[3];
        System.out.println("Ingrese 3 numeros");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("ingrese el " + (i+1) + " numero");
            numeros[i] = scn.nextInt();
        }

        System.out.println("ingrese una letra (Respetar mayusculas) \nA: Ordena de forma ascendente \nD: Ordena de forma descendente");
        char letra = scn.next().charAt(0);

        if (letra == 'A')
        {
            System.out.println("se ordenan los numeros de forma ascendete.");
            Arrays.sort(numeros);
            System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
        }
        if (letra == 'D')
        {
            System.out.println("se ordenan los numeros de forma descendete.");
            Arrays.sort(numeros);
            System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);
        }
    }
}
