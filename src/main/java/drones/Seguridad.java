package drones;

public class Seguridad extends Dron{
    
    //constructor
    public Seguridad(Integer autonomia, Integer procesamiento, misiones.Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return procesamiento > 50;
    }

}
