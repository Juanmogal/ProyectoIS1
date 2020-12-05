/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

/**
 *
 * @author Juan
 */
public class PuntoOrdenDia implements IPuntoOrdenDia{
    
    private String url;
    private String titulo;
    private String descripcion;
    private String resolucion;

    public PuntoOrdenDia(String url, String titulo, String descripcion) {
        this.url = url;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    @Override
    public void puntoOrdenDia(String url, String titulo, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiaDatosResolucion(String resolucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
