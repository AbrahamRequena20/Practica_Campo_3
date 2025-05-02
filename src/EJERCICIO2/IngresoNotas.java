
package EJERCICIO2;

import java.util.ArrayList;
public class IngresoNotas {
    
    private ArrayList<Estudiante> listaEstudiante;
    
    public IngresoNotas (){
        listaEstudiante=new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante e){
        listaEstudiante.add(e);
    }
    public ArrayList<Estudiante> obtenerEstudiante(){
        return listaEstudiante;
    }
    
}
