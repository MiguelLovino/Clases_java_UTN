public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona();
        miguel.Carrito_de_compra.producto[0].set_Precio(40.f);
        miguel.Carrito_de_compra.producto[1].set_Nombre("esponja");
        miguel.Carrito_de_compra.producto[1].set_Precio(10.f);
        miguel.Carrito_de_compra.producto[2].set_Nombre("chocolates");
        miguel.Carrito_de_compra.producto[2].set_Precio(100.f);
        //agrego descuento fijo
        miguel.Carrito_de_compra.set_d_fijo(25);
        //agrego descuento porcentual
        miguel.Carrito_de_compra.set_d_porcentaje(50);
        //fijo = "fijo"
        System.out.println("descuento fijo" + " de " + miguel.Carrito_de_compra.getFijo());
        System.out.println(miguel.Carrito_de_compra.precio_total("fijo"));
        //porcentual = "%"
        System.out.println("descuento porcentual"+ " del " + miguel.Carrito_de_compra.getPorcentual() + " %");
        System.out.println(miguel.Carrito_de_compra.precio_total("%"));
        //porcentualcontope = "%tope"
        miguel.Carrito_de_compra.set_d_porcentaje(80);
        System.out.println("descuento con restriccion");
        System.out.println(miguel.Carrito_de_compra.precio_total("%tope"));
        System.out.println("no se puede exeder el descuento de mas de " + miguel.Carrito_de_compra.getPorcentual() + " %");


    }
}