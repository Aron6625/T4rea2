public class Notas
{
    private int [] notasEstudiantes;
    int siguientePosLibre;
    int cantAprobados;
    int cantReprobados;
    int notaMasAlta;
    public Notas(int cant){
        siguientePosLibre=0;
        cantAprobados=0;
        cantReprobados=0;
        notaMasAlta=0;
        notasEstudiantes = new int[cant];
        for(int i = 0; i<cant; i++){
            notasEstudiantes[i]=0;
        }
        
    }
    
    public void aniadirNotas(int nota){
        if(siguientePosLibre < notasEstudiantes.length){
            notasEstudiantes[siguientePosLibre]= nota;
            siguientePosLibre++;
        }
    }
    
    public void mostrarArreglo(){
        for(int i = 0; i<notasEstudiantes.length; i++){
            System.out.println(i+": "+notasEstudiantes[i]);
        }
    }
    
    public void promedioNotas(){
        int suma=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            suma = suma + notasEstudiantes[i];
        }
        System.out.println("El promedio es: "+suma/notasEstudiantes.length);
    }
    
    public void promedioNotasAprobadas(){
        int suma=0;
        int contador=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>51){
               suma = suma + notasEstudiantes[i]; 
               contador++;
            }
        }
        System.out.println("El promedio de notas aprobadas es: "+suma/contador);
    }
    
    public void cantNotasAprobadas(){
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>=51){
                cantAprobados++;
            }
        }
        System.out.println("Número aprobados: "+cantAprobados);
    }
    
    public void cantNotasReprobados(){
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]<51){
                cantReprobados++;
            }
        }
        System.out.println("Número reprobados: "+cantReprobados);
    }
    
    public void notaMasAlta(){
        int notaMasAlta=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>notaMasAlta){
                notaMasAlta = notasEstudiantes[i];
            }
        }
        System.out.println("Nota más alta: "+notaMasAlta);
    }
}
