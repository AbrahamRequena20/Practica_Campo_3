
package EJERCICIO1;

public class Doctor {
    private String nombre;
    private String especialidad;
    private int edad;
    private String hospitalAsignado;

    //Método Principal
    public Doctor(String nombre, String especialidad, int edad, String hospitalAsignado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.hospitalAsignado = hospitalAsignado;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getHospitalAsignado() {
        return hospitalAsignado;
    }

    //Atributos Encapsulados
    public void setHospitalAsignado(String hospitalAsignado) {
        this.hospitalAsignado = hospitalAsignado;
    }

   
    
}
