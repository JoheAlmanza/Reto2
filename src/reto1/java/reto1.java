
package reto1.java;

import java.util.Scanner;

public class reto1 
{

   public static String NRiesgo(int num)
   {
      String dato="";
      if (num>=0 && num<=5)
          dato="SIN RIESGO";
      if(num>5 && num<=14)
          dato="BAJO";
      if(num>14 && num<=35)
          dato="MEDIO";
      if(num>35 && num<=80)
          dato="ALTO";
      if(num>80 && num<=100)
          dato="INVIABLE SANITARIAMENTE";
      return dato;
    }
   
 
public static void main(String[] args) 
    {
        Scanner ingreso=new Scanner(System.in);
        int mayor, menor, n, suma=0;
        int promedio=0;
        n=ingreso.nextInt();
        int[] vector=new int[n];
        for (int i=0; i<vector.length;i++)
        {
            vector[i]=ingreso.nextInt();
            suma +=vector[i];
        }
        promedio=suma/n;
        
        
        mayor=vector[0];
        menor=vector[0];
        
        for (int i:vector){
            if (mayor<i)
                mayor=i;
            if(menor>i)
                menor=i;
        }
        System.out.println(NRiesgo(promedio));
        System.out.println(NRiesgo(mayor));
        System.out.println(NRiesgo(menor));
        
    }
     
    
}
