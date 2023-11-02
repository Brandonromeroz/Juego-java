package Brandon.romero;

import Brandon.romero.menus.Menu;
import Brandon.romero.menus.Textos;

public class Juego {
    public static void main(String[]args){
        int opcion;
        do {
            opcion = Menu.getOpcion(Textos.menuPrincipal);
            Menu.seleccionarOpcion(opcion);
        }while (opcion!=3);
    }

        }



