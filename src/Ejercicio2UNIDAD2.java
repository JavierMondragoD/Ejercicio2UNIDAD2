/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Ejercicio2UNIDAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio2UNIDAD2 objfact = new Ejercicio2UNIDAD2 ();
        System.out.println (" El factorial de 10 mediante recursividad es " + objfact.factorialRecursivo (10));  
    }
    public int factorialRecursivo (int n ) {
        if (n < 0){
            return 0;
        }else{
            if (n==0){
                return 1;
            }else{
                return n * factorialRecursivo (n - 1); 
            }
        }
            
    } 
}

