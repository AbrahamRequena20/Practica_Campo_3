
package EJERCICIO1;

import java.util.ArrayList;

public class MantenimientoDoctor {
    
    private ArrayList<Doctor> listaDoctor; //Declaracion de variable
    
    public MantenimientoDoctor(){
        listaDoctor= new ArrayList<>(); //Instancia como Objeto pq necesito metodos de esa clase "Doctor"
        
    }
    //Metodos:
    //Metodo para agregar metodos a la array: add()-> permite añadir elementos 
    public void agregarDoctor(Doctor d){
        
        listaDoctor.add(d);
    }
    //Metodo para obtener todo el arrayList y luego poder mostrarlo
    public ArrayList<Doctor> obtenerDoctor(){
        return listaDoctor;
    }
    
    
}
