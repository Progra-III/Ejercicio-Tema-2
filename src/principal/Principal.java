package principal;
import capa.*;

public class Principal {

    public static void main(String[] args) {

        Person persona1= new Person (1122,"Persona 1", 1990);
        System.out.println(persona1);

        //Person persona2;
        //persona2.setId(5);
        //no esta inicializado

        Professor professor1= new Professor(1123, "Professor 1", 1990, "Professor 1");

        System.out.println(professor1);

    }
}
