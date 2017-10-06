import java.util.Scanner;

public class Problema3D
  {
    public static void main (String[] args)
      {
        double calificacion, j=0, suma=0, cantidad=0, total=0;
        Scanner lector = new Scanner (System.in);
        System.out.println("¿Cuántas calificaciones gustas que se promedien?");
        cantidad = lector.nextDouble();

        do
        {
          System.out.println("Calificación: ");
          calificacion = lector.nextDouble();
          suma=suma+calificacion;
          j++;
        }
        while (j<cantidad);
          total = (double)suma/cantidad;
          System.out.println("El promedio de dichas calificaciones corresponde a "+total);

        }
    }
