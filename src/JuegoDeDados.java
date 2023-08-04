
        import java.util.Random;
        import java.util.Scanner;

        public class JuegoDeDados {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int totalJugador1 = 0;
                int totalJugador2 = 0;

                for (int ronda = 1; ronda <= 3; ronda++) {
                    System.out.println("Ronda " + ronda + ":");
                    System.out.println("Jugador 1, presiona cualquier tecla para lanzar el dado.");
                    scanner.nextLine();
                    int dadoJugador1 = random.nextInt(6) + 1;
                    totalJugador1 += dadoJugador1;
                    System.out.println("Jugador 1 lanzó el dado y obtuvo: " + dadoJugador1);
                    System.out.println("Puntuación total del Jugador 1: " + totalJugador1);
                    System.out.println();

                    System.out.println("Jugador 2, presiona cualquier tecla para lanzar el dado.");
                    scanner.nextLine();
                    int dadoJugador2 = random.nextInt(6) + 1;
                    totalJugador2 += dadoJugador2;
                    System.out.println("Jugador 2 lanzó el dado y obtuvo: " + dadoJugador2);
                    System.out.println("Puntuación total del Jugador 2: " + totalJugador2);
                    System.out.println();
                }

                System.out.println("Fin del juego.");
                System.out.println("Puntuación total del Jugador 1: " + totalJugador1);
                System.out.println("Puntuación total del Jugador 2: " + totalJugador2);

                if (totalJugador1 > totalJugador2) {
                    System.out.println("¡El Jugador 1 gana el juego!");
                } else if (totalJugador2 > totalJugador1) {
                    System.out.println("¡El Jugador 2 gana el juego!");
                } else {
                    System.out.println("¡Empate! Los jugadores tienen la misma puntuación.");
                }
            }
        }


