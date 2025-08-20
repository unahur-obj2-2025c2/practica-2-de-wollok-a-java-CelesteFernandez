package drones;

import misiones.Mision;

public class Comercial extends Dron{

    //constructor
    public Comercial(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected Boolean esAvanzadoSegunTipo() {
        return false;  
    }

    @Override
    public Integer eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }
    
}
