package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer,Empleado> empleados;
    
    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /**
     * Ingresar el empleado donde la clave sea el id del empleado
     * @param empleado a ingresar al mapa
     * @return False si no ingreso porque ya existe
     *         True si ingreso correctamente
     */
    public boolean addEmpleado(Empleado empleado) {
        if (!empleados.containsKey(empleado.getId())) {
            empleados.put(empleado.getId(),empleado);
            return true;
        }
        return false;
    }

    /** 
     * Buscar un empleado por su ID
     * @param int id del empleado a buscar
     * @return Empleado segun su di
     */
    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }
    public void displayEmpleado(){
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getValue()+"- " +entry.getValue());
        }
    }

    public void displayEmpleadoSoloNombres(){
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
    }

    // Sin usar entrySet
    public void displayLlaves(){
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }

    // Imprimir todas las llaves y todo los empleados sin entrySet
    public void displayTodos(){        
        for (Integer key : empleados.keySet()) {
            System.out.println("ID: " + key + " - Empleado: " + empleados.get(key));
        }
    }

    public void displayEmpleadoValues(){
        for (Empleado value : empleados.values()) {
            System.out.println(value);
        }
    }

}