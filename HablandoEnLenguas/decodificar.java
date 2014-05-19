package final_201314595;

public class decodificar {

    public decodificar(String text, int caso, String resul) {
        String codifi = text;
        char c[] = codifi.toCharArray();
        String mensaje = "";
        for (int x = 0; x < codifi.length(); x++) {
            switch (c[x]) {
                case 'y':
                    mensaje = mensaje + "a";
                    break;
                case 'e':
                    mensaje = mensaje + "o";
                    break;
                case 'q':
                    mensaje = mensaje + "z";
                    break;
                case 'j':
                    mensaje = mensaje + "u";
                    break;
                case 'p':
                    mensaje = mensaje + "r";
                    break;
                case 'm':
                    mensaje = mensaje + "l";
                    break;
                case 's':
                    mensaje = mensaje + "n";
                    break;
                case 'l':
                    mensaje = mensaje + "g";
                    break;
                case 'c':
                    mensaje = mensaje + "e";
                    break;
                case 'k':
                    mensaje = mensaje + "i";
                    break;
                case 'd':
                    mensaje = mensaje + "s";
                    break;
                case 'x':
                    mensaje = mensaje + "m";
                    break;
                case 'v':
                    mensaje = mensaje + "p";
                    break;
                case 'n':
                    mensaje = mensaje + "b";
                    break;
                case 'r':
                    mensaje = mensaje + "t";
                    break;
                case 'i':
                    mensaje = mensaje + "d";
                    break;
                case 'b':
                    mensaje = mensaje + "h";
                    break;
                case 't':
                    mensaje = mensaje + "w";
                    break;
                case 'a':
                    mensaje = mensaje + "y";
                    break;
                case 'h':
                    mensaje = mensaje + "x";
                    break;
                case 'w':
                    mensaje = mensaje + "f";
                    break;
                case 'o':
                    mensaje = mensaje + "k";
                    break;
                case 'g':
                    mensaje = mensaje + "v";
                    break;
                case 'u':
                    mensaje = mensaje + "j";
                    break;
                case 'f':
                    mensaje = mensaje + "c";
                    break;
                case ' ':
                    mensaje = mensaje + " ";
                    break;
                default:
                    mensaje = mensaje + c[x];
                    break;

            }
        }
        if (caso != 0) {
            System.out.println("Caso" + caso + ": " + mensaje);
            resul = resul + "Caso " + caso + ": " + mensaje;

        }

    }
}
