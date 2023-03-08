public class Carrito {
    public Carrito()
    {
        //inicializo cada objeto del array
        for (int i = 0; i < 3; i++)
        {
            producto[i] = new Producto();
        }
    }
   Producto[] producto = new Producto[3];

    public float precio_total()
    {
        int suma = 0;
        for (int i = 0; i < this.producto.length; i++ )
        {
            suma += this.producto[i].get_Precio();
        }
        return suma;
    }

}
