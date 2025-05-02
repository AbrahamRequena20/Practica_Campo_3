
package EJERCICIO1;

/**
 *
 * @author UPN
 */
public class Doctor {
    private String nombre;
    private String especialidad;
    private int edad;
    private String hospitalAsignado;

    //Metodo Constructor

    public Doctor(String nombre, String especialidad, int edad, String hospitalAsignado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.hospitalAsignado = hospitalAsignado;
    }
    //Get and Set
    
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

    //Atrivutos encapsulados
    public void setHospitalAsignado(String hospitalAsignado) {
        this.hospitalAsignado = hospitalAsignado;
    }

   
    
}
