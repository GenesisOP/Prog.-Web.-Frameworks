import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class a {
    public static void main(String args[]) {
      
      Scanner entrada = new Scanner (System.in);
      
      ArrayList <Alumno> lista = new ArrayList <Alumno> ();
      lista.add(new Alumno("Valeria",3));
      lista.add(new Alumno("Pedro",1));
      lista.add(new Alumno("Olga",3));
      lista.add(new Alumno("Miguel",3));
      lista.add(new Alumno("Fernanda",2));
      lista.add(new Alumno("Octavio",1));
      lista.add(new Alumno("Rebeca",2));
      lista.add(new Alumno("Esteban",2));
      lista.add(new Alumno("Adrian",1));
      lista.add(new Alumno("Veronica",3));
      lista.add(new Alumno("Leticia",1));
      lista.add(new Alumno("Jessica",2));
      lista.add(new Alumno("Isabel",3));
      lista.add(new Alumno("Jorge",2));
      lista.add(new Alumno("David",1));
      
      
      
      List subLista = lista.subList(1,3);
    
      
      //uso de fot each
   //   for(Alumno a: lista){
   //       System.out.println(a);
    //  }
    }
}

class Alumno{
    String nombre;
    int semestre;
    
    public Alumno(String n, int s){
        nombre = n;
        semestre = s;
    }
    
    public String toString(){
        return nombre + "\t" + semestre;
    }
}


