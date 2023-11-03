package Brandon.romero;

import Brandon.romero.menus.Textos;
import Brandon.romero.menus.Menu;

public class Jugar {
    private int nivel;
    private int vidaJugador;
    private int vidaEnemigos;

    public Jugar(int nivel) {
        this.nivel = nivel;
        this.vidaJugador = 100; // Establece la vida inicial del jugador
        this.vidaEnemigos = 100 * nivel; // Establece la vida inicial de los enemigos según el nivel
    }

    public void iniciar() {
        JUEGO();
    }

    private void JUEGO() {
        System.out.println(Textos.inicioDeBatalla);

        while (vidaJugador > 0 && vidaEnemigos > 0) {
            mostrarEstadoDelJuego();

            int accion = Menu.getOpcion(Textos.menuAcciones);

            INICIO(accion);
        }

        if (vidaJugador <= 0) {
            System.out.println("¡Perdiste! " + Textos.gameOver);
        } else {
            System.out.println("¡Ganaste!");
        }
    }

    private void INICIO(int accion) {
        INICIIOO(accion);
    }

    private void INICIIOO(int accion) {
        switch (accion) {
            case 1:
                // Implementa la lógica de ataque
                int danioJugador = (int) (Math.random() * 20); // Simula un daño aleatorio
                int danioEnemigos = (int) (Math.random() * 20 * nivel); // Simula un daño aleatorio de los enemigos

                vidaJugador -= danioEnemigos;
                vidaEnemigos -= danioJugador;

                System.out.println("Atacaste al enemigo y le hiciste " + danioJugador + " de daño.");
                System.out.println("Los enemigos te atacaron y te hicieron " + danioEnemigos + " de daño.");
                break;
            case 2:
                // Implementa la lógica de defensa
                int defensa = (int) (Math.random() * 10); // Simula un valor de defensa aleatorio
                int danioEnemigosDefensa = (int) (Math.random() * 20 * nivel); // Simula un daño aleatorio de los enemigos

                danioEnemigosDefensa -= defensa;
                if (danioEnemigosDefensa < 0) {
                    danioEnemigosDefensa = 0;
                }

                vidaJugador -= danioEnemigosDefensa;

                System.out.println("Te defendiste y recibiste " + danioEnemigosDefensa + " de daño de los enemigos.");
                break;
            default:
                System.out.println(Textos.opcionIncorrecta);
                break;
        }
    }

    private void mostrarEstadoDelJuego() {
        System.out.println(Textos.contadorEnemigos);
        System.out.println("Vida del Jugador: " + vidaJugador);
        System.out.println("Vida de los Enemigos: " + vidaEnemigos);
    }
}
