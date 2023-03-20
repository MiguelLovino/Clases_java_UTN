import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //ordeno en siguiente string con una funcion reutilizable
        String[] STRorden = new String[] {"1","1","2","A"};
        ordenar_por_p(STRorden);

        //uso otra funcion reutilizable para ordenar lo siguiente

        int[] Numeros = new int[]{59,94,53};
        char Ascendente = 'A';
        char Descendente = 'D';
        ordenar_p2(Numeros, Descendente);

    }

    private static void  ordenar_por_p (String[] args)
    {
        int[] numeros = new int[3];
        numeros[0] = Integer.parseInt(args[0]);
        numeros[1] = Integer.parseInt(args[1]);
        numeros[2] = Integer.parseInt(args[2]);

        char letra = args[3].charAt(0);

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

    private static void ordenar_p2(int[] num,char letr){

        int[] arreglo = new int[num.length];

        for (int i = 0; i < num.length; i++)
        {
            arreglo[i] = num[i];
        }

        if (letr == 'A')
        {
            Arrays.sort(arreglo);
            System.out.println("se ordenan los numeros de forma ascendete.");
            for (int j : arreglo) {
                System.out.println(j);
            }
        }
        if (letr == 'D')
        {
            Arrays.sort(arreglo);
            System.out.println("se ordenan los numeros de forma descendete.");
            for (int i = arreglo.length-1; i >= 0; i--)
            {
                System.out.println(arreglo[i]);
            }
        }
    }

}