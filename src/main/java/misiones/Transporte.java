package misiones;

import drones.Dron;

public class Transporte implements Mision{

    private static Transporte  instance = new Transporte();
    private Transporte () {}

    public static Mision getInstance() {
        return instance;
    }

    public Integer extraEficienciaOperativa() {
        return 100;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
       return dron.getAutonomia() > 50;
    }

    

}
