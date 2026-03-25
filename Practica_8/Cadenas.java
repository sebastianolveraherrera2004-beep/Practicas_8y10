public class Cadenas {

    public static void main(String[] args) {
        String cadena = "nunca me digas que no puedo nunca me digas que creer no ves que tengo miedo no me pongas tus cadenas";
        String cadena2 = "perdoname si no te sigo pero me aburre caminar me construi unas alas de cartón y voy a intentar llegar al sol aunque me muera de calor...";

        mostrarLongitud(cadena);
        convertirMayusculas(cadena);
        convertirMinusculas(cadena);
        concatenarCadenas(cadena, cadena2);
        substraerCadena(cadena.concat(cadena2), 100);
        imprimirCaracteres(cadena.concat(cadena2));
        imprimirCadenaConSaltos(cadena.concat(cadena2));
        contarVocalesA(cadena.concat(cadena2));
    }

    public static void mostrarLongitud(String cadena) {
        System.out.println("La cadena tiene una cantidad de caracteres " + cadena.length());
    }

    public static void convertirMayusculas(String cadena) {
        System.out.println(cadena.toUpperCase());
    }

    public static void convertirMinusculas(String cadena) {
        System.out.println(cadena.toLowerCase());
    }

    public static void concatenarCadenas(String cadena1, String cadena2) {
        String resultado = cadena1.concat(cadena2);
        System.out.println(resultado);
    }

    public static void substraerCadena(String cadena, int inicio) {
        String sub = cadena.substring(inicio);
        System.out.println(sub);
    }

    public static void imprimirCaracteres(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    public static void imprimirCadenaConSaltos(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ')
                System.out.println();
            else
                System.out.print(cadena.charAt(i));
        }
    }

    public static void contarVocalesA(String cadena) {
        int vocal = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                vocal++;
            }
        }
        System.out.println("Existen " + vocal + " vocales 'a' en la cadena");
    }
}