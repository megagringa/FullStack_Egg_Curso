# ejercicioJavaT4

Ejercicios realizados en java para un bootcamp.

Primer punto if:
```
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double numeroif = escaner.nextDouble();
		
		if (numeroif == 0) {
			System.out.println("El número es neutro");
		} else if (numeroif < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}
}
```
Segundo punto while:
```
class while
{
    public static void main(String args[])
    {
        int numerowhile = 0;

        while (numerowhile <= 2)
        {
            System.out.println("Valor de numero: " + numerowhile);
 
            
            numerowhile++;
        }
    }
}
```
Tecer punto Do while:
```
class dowhile
{
    public static void main(String args[])
    {
        int numeroWhile = 0;
        do
        {
            System.out.println("Valor de numero :" + numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile <= 2);
    }
}
```

Cuarto punto for:
```
public static void main(String args[])
    {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println("Valor de numero: " + numeroFor);
    }
 ```
 QUinto punto switch:
 ```
  public static void main(String[] args)
    {
	Scanner escaner = new Scanner(System.in);
	System.out.println("Escribe un número:");
	int estacion = escaner.nextInt();
        String muestra;
         
        // instrucción switch con tipo de datos int
        switch (estacion) 
        {
            case 1:  muestra = "Verano";
                     break;
            case 2:  muestra = "Otoño";
                     break;
            case 3:  muestra = "Invierno";
                     break;
            case 4:  muestra = "Primavera";
                     break;
            
            default: dayString = "No hay estacion";
                     break;
        }
        System.out.println(Muestra);
    }
 ```
