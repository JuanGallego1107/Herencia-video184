package org.agallego.pooherencia;

public class Profesor extends Persona{
    private String Asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
       this.Asignatura = asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }
}
