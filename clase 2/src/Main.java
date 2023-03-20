import java.time.format.SignStyle;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Problema 1");
        String nombre = "maria antonienta de las nieves";
        int contar_letra_a = 0;

        for (int i = 0; i < nombre.length(); i++)
        {
            if(nombre.charAt(i)  == 'a' ) {
                contar_letra_a++;
            }

        }

        System.out.println("El string \"maria antonienta de las nieves\" contiene " + contar_letra_a + " letras A\n");

        System.out.println("Problema 2");

        int numero1 = 50;
        int numero2 = 215;
        int numero3 = 15;

        int[] mi_arreglo_ascendete = {numero3, numero1, numero2};

        for (int j : mi_arreglo_ascendete) {
            //utilizo la iteracion del for each, para acceder a cada elemento del array.
            System.out.println(j);
        }

        System.out.println("\nProblema 3");

        //dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado

        int[] mi_vector = {5, 80, 10 , 6, 52, 10};
        int numeroMAX = 15;
        int suma_de_numeros = 0;
        for (int i: mi_vector)
        {

            if (i > numeroMAX)
            {
                suma_de_numeros += i;
            }
        }

        System.out.println("El total de los numeros sumados es:" + suma_de_numeros + "\n");

        System.out.println("Problema 4");

        String ABC = "abcdefghijklmnopqrstuvwxyz ";
        String texto_a_cifrar = "zombies sin cerebro y corazon";
        String texto_cifrado = "";
        int salto_de_caracter = 2;
        for (int i = 0; i < texto_a_cifrar.length() ; i++)
        {
            for (int j = 0; j < ABC.length(); j++)
            {
                if (texto_a_cifrar.charAt(i) == ABC.charAt(j))
                {
                    if (j + salto_de_caracter > (ABC.length() -1))
                    {
                        int pos = j + salto_de_caracter - ABC.length();
                        texto_cifrado += ABC.charAt(pos);
                    }
                    else
                    {
                        texto_cifrado += ABC.charAt(j + salto_de_caracter);
                    }

                    break;
                }
            }
        }

        System.out.println(texto_cifrado);

    }
}