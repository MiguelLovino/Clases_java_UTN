abstract class Descuento {

    public Descuento(){}
    private String tipo;
    private double fijo;
    private double porcentual;
    protected void setTipo(String tipo_s)
    {
        tipo = tipo_s;
    }
    protected String getTipo()
    {
        return tipo;
    }
    protected void set_d_fijo(double num)
    {
        this.fijo = num;
    }
    protected double getFijo()
    {
        return fijo;
    }
    protected void set_d_porcentaje(float num)
    {
        this.porcentual = num;
    }
    protected double getPorcentual()
    {
        return this.porcentual;
    }
}
