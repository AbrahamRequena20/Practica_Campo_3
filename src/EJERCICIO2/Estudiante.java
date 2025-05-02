
package EJERCICIO2;


public class Estudiante {
    
    private String alumno;
    private double t1;
    private double t2;
    private double t3;
    private double ef;  
    private String situacion;
    private double promF;   

    public Estudiante(String alumno, double t1, double t2, double t3, double ef) {
        this.alumno = alumno;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.ef = ef;
    }
 
    
      
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double getT3() {
        return t3;
    }

    public void setT3(double t3) {
        this.t3 = t3;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public double getPromF() {
        return promF;
    }

    public void setPromF(double promF) {
        this.promF = promF;
    }
    
    public double CalcularT1(){
        return t1*0.10;
    }
    public double CalcularT2(){
        return t2*0.20;
    }
    public double CalcularT3(){
        return t3*0.30;
    }
    public double CalcularEF(){
        return ef*0.40;
    }
    public double CalcularPromF(){
        return CalcularT1()+CalcularT2()+CalcularT3()+CalcularEF();
    }
    
    public String Mostrar(){
        
        if(CalcularPromF()>=12){
            return "Aprobado";
        }
        else { return "Desaprobado";
        }
        
    }
    
    

    

    
    
    
}
