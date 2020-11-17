package pojos;

import Inteface.InterfaceReset;

import java.util.Date;

public class DiscoSolido extends Tecnologico implements InterfaceReset {
    private int capacidad;

    public DiscoSolido(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int capacidad){
        super(codigo,modelo,paisOrigen,fechaFabricacion,fabricante);

        this.setCapacidad(capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("\nFormateando Disco Solido");
    }

    @Override
    public void estado() {
        System.out.println("numerp de formateos : " + 5 +"\n");
    }
}
