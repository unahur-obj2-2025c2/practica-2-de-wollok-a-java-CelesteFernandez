package drones;

import misiones.Mision;

public abstract class Dron {
    private Integer autonomia;
    protected final Integer procesamiento;
    private Mision mision;

    //constructor
    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    //getters and setters
    public Integer getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }
    public Mision getMision() {
        return mision;
    }
    public void setMision(Mision mision) {
        this.mision = mision;
    }

    //metodos
    public Integer eficienciaOperativa() {
        return (autonomia * 10 + mision.extraEficienciaOperativa());
    }

    public Boolean esAvanzado() {
        return this.esAvanzadoSegunTipo() || mision.esAvanzadoSegunMision(this);
    }

    protected abstract Boolean esAvanzadoSegunTipo();

    public void disminuiAutonomia() { //metodo de indicacion, no devuelve nada
        autonomia -= 2; 
    }


}
