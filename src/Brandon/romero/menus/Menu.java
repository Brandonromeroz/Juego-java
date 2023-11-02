package Brandon.romero.menus;

import Brandon.romero.Jugar;

import java.util.Scanner;

public class Menu  {
    public static int getOpcion(String menu) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(menu);
        return scanner.nextInt();
    }
    public static void seleccionarOpcion(int opcion) {
        int op=0;
        switch (opcion) {
            case 1:
               op= getOpcion(Textos.menuNivel);
                Jugar jugar=new Jugar(op);
                jugar.iniciar();
                break;
            case 2:
               op= getOpcion(Textos.instrucciones);
                break;
            case 3:
                System.out.println(Textos.gameOver);
                System.exit(0);
                break;
            default:
                System.out.println(Textos.opcionIncorrecta);
        }
    }
    }
