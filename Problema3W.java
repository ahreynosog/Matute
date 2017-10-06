import java.util.Scanner;

public class Problema3W
  {
    public static void main (String[] args)
      {
        double calificacion, j=0, suma=0, cantidad=0, total=0;
        Scanner lector = new Scanner (System.in);
        System.out.println("¿Cuántas calificaciones gustas que se promedien?");
        cantidad = lector.nextDouble();

        while(j<cantidad)
        {
          System.out.println("Calificación "+(1+j)+": ");
          calificacion = lector.nextDouble();
          suma=suma+calificacion;
          j++;

        }
          total=(double)suma/cantidad;
          System.out.println("El promedio de dichas calificaciones corresponde a " + total);


      }
  }
/*
¿Cuántas calificaciones gustas que se promedien?
3
Calificación 1.0: 
99
Calificación 2.0: 
98
Calificación 3.0: 
97
El promedio de dichas calificaciones corresponde a 98.0
*/
