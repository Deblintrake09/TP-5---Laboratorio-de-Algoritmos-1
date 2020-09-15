/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarreglo;

/**
 *
 * @author jackd
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo= {1,2,3,4,5,6,7,8,9,10};
        Arreglo.sumarArreglo(arreglo);
        Arreglo.buscarMayor(arreglo);
        
        String frase = "Trabajar con Arreglos en Java es muy divertido";
        String palabra= "María Gisela Quevedo";
        
        System.out.println(Arreglo.cuentaVocales(frase));
        
        System.out.println(Arreglo.cuentaCaracter(frase, 'á')); 
        
        System.out.println(Arreglo.cuentaVocales(palabra));
        
  
        
    }
    
}
