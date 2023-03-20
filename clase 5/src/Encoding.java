import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Encoding {
    public static void main (String[] args) throws IOException {
        String decoding = "decoding";
        String encoding = "encoding";
        String entrada = "archivo/entrada.txt";
        String salida = "archivo/salida.txt";
        En_De_coding(encoding,entrada,salida,2);
    }

    public static  void En_De_coding(String coding, String entrada, String salida, int salto_c) throws IOException {
        String ABC = "abcdefghijklmnñopqrstuvwxyz ";
        String texto_a_cifrar = Files.readAllLines(Paths.get(entrada)).toString();
        String texto_cifrado = "";
        //primero cifro el string
        for (int i = 0; i < texto_a_cifrar.length(); i++)
        {
            for (int j = 0; j < ABC.length(); j++)
            {
                if (texto_a_cifrar.charAt(i) == ABC.charAt(j))
                {
                    if (j + salto_c > (ABC.length() -1))
                    {
                        int pos = j + salto_c - ABC.length();
                        texto_cifrado += ABC.charAt(pos);
                    }
                    else
                    {
                        texto_cifrado += ABC.charAt(j + salto_c);
                    }

                    break;
                }
            }
        }
        //segundo, encodeo o decodeo segun lo solicitado
        if (coding.equals("encoding"))
        {
           Files.writeString(Paths.get(salida), texto_cifrado);

        }

        System.out.println("Operacion realizada con exito");
    }

}
