package Brandon.romero;

import Brandon.romero.menus.Textos;

public class Jugar {
    private int dificuldad;

    public Jugar(int dificuldad) {
        this.dificuldad = dificuldad;

        }


    public void iniciar() {
        System.out.println(Textos.inicioDeBatalla);
        System.out.println(Textos.contadorEnemigos);
        System.out.println(Textos.menuAcciones);

    }
}
