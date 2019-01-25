/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosprueba;

/**
 *
 * @author ALEX
 */
public class TipoProductos {

   private String nombre, codigo, producto;
   tipo x;

    public TipoProductos(String nombre, String codigo, String producto, tipo x) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.producto = producto;
        this.x = x;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public tipo getX() {
        return x;
    }

    public void setX(tipo x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "TipoProductos{" + "nombre=" + nombre + ", codigo=" + codigo + ", producto=" + producto + ", x=" + x + '}';
    }

    void getProducto(String dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}