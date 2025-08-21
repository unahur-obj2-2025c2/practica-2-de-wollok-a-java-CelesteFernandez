package misiones;

import java.util.ArrayList;
import java.util.List;

import drones.Dron;

public class Vigilancia implements Mision {

    private List<Sensor> sensores = new ArrayList<>();

    
    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public Integer extraEficienciaOperativa() {
        return sensores.stream().mapToInt(s -> s.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        ;
    }


}
