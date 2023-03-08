public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona();


        miguel.Carrito_de_compra.producto[0].set_Precio(40.f);
        miguel.Carrito_de_compra.producto[1].set_Nombre("esponja");
        miguel.Carrito_de_compra.producto[1].set_Precio(10.f);
        miguel.Carrito_de_compra.producto[2].set_Nombre("chocolates");
        miguel.Carrito_de_compra.producto[2].set_Precio(100.f);
        System.out.println(miguel.Carrito_de_compra.precio_total());


    }
}