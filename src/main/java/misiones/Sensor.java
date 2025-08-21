public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean mejorasTecnologicas;
    
    //constructor
    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer eficienciaOperativa() { //expresion ternaria
        return mejorasTecnologicas ? capacidad*2 : capacidad;
    }

    public Boolean esDuradero() {
        return durabilidad > 2*capacidad;
    }


}
