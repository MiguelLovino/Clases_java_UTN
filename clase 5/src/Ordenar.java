import java.util.Arrays;
public class Ordenar {
    public static void main (String[] args) {

       System.out.println("Ingrese 3 numeros y 1 letra, si la letra es A, se ordenan los numeros de forma ascendente, con la D, descendente.");

       int num1 = Integer.parseInt(args[0]);
       int num2 = Integer.parseInt(args[1]);
       int num3 = Integer.parseInt(args[2]);
       char letra = args[3].charAt(0);

        System.out.println("los numeros ingresados por parametro son " + num1 + " " + num2 + " " + num3);
        System.out.println("le letra ingresada es " + letra);

        if (letra == 'A')
        {
            System.out.println("se ordenan los numeros de forma ascendete.");
            Arrays.sort(args);
            System.out.println(args[0] + " " + args[1] + " " + args[2]);
        }
        else if (letra == 'D')
        {
            System.out.println("se ordenan los numeros de forma descendente.");
            Arrays.sort(args);
            System.out.println(args[2] + " " + args[1] + " " + args[0]);
        }
    }
}
