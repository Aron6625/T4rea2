public class Curso
{
    int siguientePosLibre;
    int cantAprobados;
    int cantReprobados;
    int notaMasAlta;
    Estudiante [] estudiantes;
    public Curso(int cant){
        siguientePosLibre=0;
        cantAprobados=0;
        cantReprobados=0;
        notaMasAlta=0;       
        
        estudiantes = new Estudiante[cant];
        for(int i=0; i<cant;i++){
            estudiantes[i] = new Estudiante();
        }
    }
    
    public void aniadirNotas(String nombre, int nota){
        if(siguientePosLibre < estudiantes.length){
            estudiantes[siguientePosLibre].setNomnbre(nombre);
            estudiantes[siguientePosLibre].setNota(nota);
            siguientePosLibre++;
        }
    }
    
    public void mostrarArreglo(){
        for(int i = 0; i<estudiantes.length; i++){
            System.out.println(i+".- Nombre: "+estudiantes[i].getNomnbre()+" - Nota:"+estudiantes[i].getNota());
        }
    }

}
