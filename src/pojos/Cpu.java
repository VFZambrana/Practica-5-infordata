package pojos;

import Inteface.InterfaceReset;

import java.util.Date;

public class Cpu extends Tecnologico implements InterfaceReset {

    protected int memoria;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricanteint,int memoria) {
        super(codigo, modelo, paisOrigen,fechaFabricacion,fabricanteint);

        this.setMemoria(memoria);
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "memoria=" + memoria +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    @Override
    public void reset() {
        System.out.println("\nRestableciendo aestado de fabrica...");
    }
    @Override
    public void estado() {
        System.out.println("años de vida : "  + 12 + "\n");
    }
}
