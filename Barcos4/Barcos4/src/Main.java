import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuadricula cuadricula = new Cuadricula();
        Scanner scanner = new Scanner(System.in);
        int opcion = 4;
        System.out.println("Bienvenido a la micro guerra de barcos!");
        do{
            System.out.println("1. Colocar barco");
            System.out.println("2. Disparar");
            System.out.println("3. Visualización");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Coloca tu barco en la cuadrícula. Introduce las coordenadas fila y columna (0-9):");
                    int filaBarco = scanner.nextInt();
                    int columnaBarco = scanner.nextInt();
                    if (!cuadricula.depositarBarco(filaBarco, columnaBarco)) {
                        System.out.println("Coordenadas inválidas. Fin del juego.");
                        return;
                    }
                    cuadricula.depositoAleatorio();
                    break;
                case 2:
                    System.out.println("Dispara a una celda de la cuadrícula. Introduce las coordenadas fila y columna (0-9):");
                    int filaDisparo = scanner.nextInt();
                    int columnaDisparo = scanner.nextInt();
                    if (cuadricula.disparar(filaDisparo, columnaDisparo)) {
                        System.out.println("Barco hundido!");
                    } else {
                        System.out.println("Agua...");
                    }
                    cuadricula.disparoAleatorio();
                    break;
                case 3:
                    cuadricula.visualizacion();
                    break;
                case 4:
                    System.out.println("Fin del juego");
                    break;
            }
        }while(opcion != 4);
    }
}