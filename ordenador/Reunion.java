/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Reunion implements IReunion{
    
    private String titulo;
    private Date fecha;
    private Date fecha_convocatoria;
    private Date horaInicio;
    private Date horaFin;
    private String lugar;

    public Reunion(String titulo, Date fecha, Date horaInicio, Date horaFin, String lugar) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
    }

    @Override
    public void puntoOrdenDia(PuntoOrdenDia pod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechaConvocatoria(Date fecha_convocatoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiaDatosHoraFin(Date horaFin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerPuntoOrdenDia(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
