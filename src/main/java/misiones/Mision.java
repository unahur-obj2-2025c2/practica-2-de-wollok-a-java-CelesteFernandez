package misiones;

import drones.Dron;

public interface Mision { //no tiene atributos, entonces es interface

    Integer extraEficienciaOperativa();
    Boolean esAvanzadoSegunMision(Dron dron);

}
