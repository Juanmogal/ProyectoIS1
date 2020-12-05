package ordenador;

public interface IComision {

    public void crearLineaComision( String puesto);
    
    public void borrarMiembro(Miembro m);
    
    public void reunionNueva(Reunion r);
    
    public Reunion obtenerReunionAnual(String titulo, int anyo);
    
    public Reunion obtenerReunion(String titulo); 
}
