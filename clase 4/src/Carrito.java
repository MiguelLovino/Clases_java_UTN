public class Carrito extends Descuento implements DescuentoPorcentajeConTope {
    public Carrito()
    {
        //inicializo cada objeto del array
        for (int i = 0; i < 3; i++)
        {
            producto[i] = new Producto();
        }
    }
   Producto[] producto = new Producto[3];

    public float precio_total(String desc_tipo)
    {
        this.setTipo(desc_tipo);
        float suma = 0;
        for (int i = 0; i < this.producto.length; i++ )
        {
            suma += this.producto[i].get_Precio();
        }
        if (this.getTipo().equals("fijo"))
        {
            //aplico del descuento fijo
            suma -= this.getFijo();
        }
        if (this.getTipo().equals("%"))
        {
            //aplico del descuento porcentual
            suma -= suma * (float)this.getPorcentual() / 100;
        }
        if (this.getTipo().equals("%tope"))
        {
            //aplico el descuento
            this.tope_descuento();
            suma -= suma * (float)this.getPorcentual() / 100;
        }


        return suma;
    }

    @Override
    public void tope_descuento() {
        if(this.getPorcentual() > 35)
        {
            //no se puede obtener un tope mayor al 35% de descuento
            this.set_d_porcentaje(35);
        }
    }
}
