import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class Lector_de_archivos {
    public static void main (String[] args) throws IOException {
        String direccion = "archivo/sumaomulti.txt";
        String direccion02 = "archivo/sumaomulti02.txt";
        String suma = "s";
        String multiplicacion = "m";
        System.out.println(Operacion_c_Archivo(direccion, multiplicacion));
        System.out.println(Operacion_c_Archivo(direccion02, suma));
    }
    public static int Operacion_c_Archivo (String direc, String operacion) throws IOException {
        Path directorio2 = Paths.get(direc); //creo una variable path y le asigno la direccion con un getter
        int resultado = 0;
        if (operacion == "s")
        {
            for (String suma : Files.readAllLines(directorio2))
            {
                resultado += Integer.parseInt(suma);
            }

        }
        if (operacion == "m")
        {
            resultado = 1; //para poder multiplicarlo
            for (String suma : Files.readAllLines(directorio2))
            {
                resultado *= Integer.parseInt(suma);
            }
        }

        return resultado;
    }
}

