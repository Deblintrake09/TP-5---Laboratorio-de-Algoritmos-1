
package pruebaarreglo;

/**
 *
 * @author jackd
 */
public class Arreglo {
    
    private static String VOWELS = "AÀÁÂÃÄÅĀĂĄǺȀȂẠẢẤẦẨẪẬẮẰẲẴẶḀÆǼEȄȆḔḖḘḚḜẸẺẼẾỀỂỄỆĒĔĖĘĚÈÉÊËIȈȊḬḮỈỊĨĪĬĮİÌÍÎÏĲOŒØǾȌȎṌṎṐṒỌỎỐỒỔỖỘỚỜỞỠỢŌÒÓŎŐÔÕÖUŨŪŬŮŰŲÙÚÛÜȔȖṲṴṶṸṺỤỦỨỪỬỮỰ";
    
    public static void sumarArreglo(int[] arreglo)
    {
        int suma=0;
        for(int i=0; i<arreglo.length; i++)
        {
            suma+=arreglo[i];
        }
        System.out.println("La suma de valores del arreglo es " + suma);
        System.out.println("El promedio de los valores del arreglo es " + suma/arreglo.length);
    }
    
    public static int buscarMayor(int[] arreglo)
    {
        int mayor=0;
        int pos=0;
        for(int i=0; i<arreglo.length; i++)
        {
            if(arreglo[i]>mayor)
            {
                mayor=arreglo[i];
                pos=i+1;
            }
        }
        System.out.println("El número mayor del arreglo es " + mayor + "se encuentra en la posición n° " + pos);
        return mayor;
    }
    
    public static int cuentaVocales(String cadena)
    {
        int total=0;
        cadena=cadena.toUpperCase();
        char[] c=cadena.toCharArray();
        
        for(int i=0; i<cadena.length(); i++)
        {
            if(VOWELS.indexOf(c[i])>=0)
            {
                total+=1;
            }
        }
         System.out.println("En la cadena pasada hay una cantidad de vocales total de" + total);
        return total;
    }
    
     public static int cuentaCaracter(String cadena, char c)
    {
        int total=0;
        cadena=cadena.toUpperCase();
        c=Character.toUpperCase(c);
        char[] cArr=cadena.toCharArray();
        for(int i=0; i<cArr.length; i++)
        {
            if(cArr[i]==c)
            {
                total+=1;
            }
        }
        return total;
    }
    
}
