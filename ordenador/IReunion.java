
package ordenador;

import java.util.Date;

public interface IReunion {
    
    public void puntoOrdenDia(PuntoOrdenDia pod);
    
    public void setFechaConvocatoria(Date fecha_convocatoria);
    
    public void cambiaDatosHoraFin(Date horaFin);
    
    public void obtenerPuntoOrdenDia(String url);
}
