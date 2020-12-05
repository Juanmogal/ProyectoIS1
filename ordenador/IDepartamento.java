package ordenador;


public interface IDepartamento {
    
    public Miembro miembroNuevo(Miembro m);
    
    public void obtenerMiembro(String dni);
    
    public void eliminarMiembro(Miembro m);
    
    public void comisionNueva(Comision c);
    
    public Comision obtenerComision(String nombre);
    
    public List<Comision> obtenerListaComision();

}