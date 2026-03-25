public class AnalizadorCadena {

    public static void main(String[] args) {
        String cadena = "1973 Perdóname si no te sigo pero me Aburre caminar me Construí unas alas de cartón y voy a intentar llegar al sol aunque me muera de calor...";

        int letras = contarLetras(cadena);
        int digitos = contarDigitos(cadena);
        int minusculas = contarMinusculas(cadena);
        int mayusculas = contarMayusculas(cadena);

        System.out.println("El número de letras es: " + letras);
        System.out.println("El número de números es: " + digitos);
        System.out.println("El número de minúsculas es: " + minusculas);
        System.out.println("El número de mayúsculas es: " + mayusculas);

        imprimirMayusculas(cadena);
        imprimirMinusculas(cadena);
    }

    public static int contarLetras(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLetter(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarDigitos(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMinusculas(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isLowerCase(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayusculas(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirMayusculas(String cadena) {
        System.out.println("\nCadena en mayúsculas:");
        System.out.println(cadena.toUpperCase());
    }

    public static void imprimirMinusculas(String cadena) {
        System.out.println("\nCadena en minúsculas:");
        System.out.println(cadena.toLowerCase());
    }
}
