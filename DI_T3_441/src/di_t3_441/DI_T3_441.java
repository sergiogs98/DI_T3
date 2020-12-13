/*
 *
 * 
 *
 */
package di_t3_441;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author sergy
 */
public class DI_T3_441 {

    Scanner teclado;
    
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce nombre de la clase: ");
        String claseTeclado = teclado.next();
        Class clase = Class.forName(claseTeclado);
        
        System.out.println("Nombre: "+clase.getName());
        
        Constructor[] cons = clase.getConstructors();
        for (int i = 0; i < cons.length; i++) {
            System.out.println("Constructor: "+cons[i].getName());
        }
        
        Method mod[] = clase.getMethods();
        System.out.println("Metodos: ");
        for (int i = 0; i < mod.length; i++) {
            System.out.println(mod[i].getName());
        }
    }
    
}
