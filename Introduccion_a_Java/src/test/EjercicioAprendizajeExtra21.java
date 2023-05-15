/*
Ejercicio de Aprendizaje Extra.
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
*/
package test;




public class EjercicioAprendizajeExtra21 {

    public static void main(String[] args) {
    
     double[][] notas = {{7.0, 5.5, 8.0, 6.5}, 
                        {4.5, 6.5, 7.0, 5.5}, 
                        {8.5, 9.0, 6.0, 7.5}, 
                        {6.0, 5.5, 7.0, 6.5}, 
                        {6.5, 7.5, 9.0, 8.0}, 
                        {8.0, 7.5, 6.0, 6.5}, 
                        {9.0, 9.5, 8.0, 9.5}, 
                        {6.5, 7.0, 7.5, 8.0}, 
                        {7.5, 8.0, 8.5, 9.0}, 
                        {5.5, 4.0, 6.5, 5.0}}; 
        
     
     int aprobados = 0;
     int desaprobados = 0;
     
     for(int i=0;i<notas.length;i++){
         double promedio = calcularPromedio(notas[i]);
         if(promedio>=7){
             aprobados++;
         }else{
             desaprobados++;
         }
         
     }
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de desaprobados: "+desaprobados);
        }
    public static double calcularPromedio(double[] notas){
        double promedio = 0;
        promedio += notas[0] * 0.1;    // Primer trabajo práctico evaluativo
        promedio += notas[1] * 0.15;  // Segundo trabajo práctico evaluativo
        promedio += notas[2] * 0.25; // Primer integrador
        promedio += notas[3] * 0.5; // Segundo integrador
        return promedio;
    }
}