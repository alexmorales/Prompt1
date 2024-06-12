import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de notas que va a ingresar
        System.out.print("Ingrese la cantidad de notas: ");
        int cantidadNotas = scanner.nextInt();

        double sumaNotas = 0;

        // Ciclo para pedir y sumar las notas ingresadas
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            sumaNotas += nota;
        }

        // Calcular el promedio
        double promedio = sumaNotas / cantidadNotas;

        // Mostrar el resultado
        System.out.println("El promedio de las " + cantidadNotas + " notas es: " + promedio);

        scanner.close();
    }
}
