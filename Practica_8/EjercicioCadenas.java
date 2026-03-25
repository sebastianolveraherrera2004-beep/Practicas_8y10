public class EjercicioCadenas {

    public static void main(String[] args) {
        String cadena = "1973 Perdóname si no te sigo pero me Aburre caminar...";

        mostrarPropiedadesString(cadena);
        mostrarConversionesString(cadena);
        mostrarAnalisisCaracteres(cadena);
    }
    public static void mostrarPropiedadesString(String cadena) {
        System.out.println("Longitud: " + cadena.length());
        System.out.println("Primer caracter: " + cadena.charAt(0));
        System.out.println("Último caracter: " + cadena.charAt(cadena.length()-1));
        System.out.println("Subcadena (0-10): " + cadena.substring(0,10));
        System.out.println("Índice de 'Aburre': " + cadena.indexOf("Aburre"));
        System.out.println("Contiene 'sol'? " + cadena.contains("sol"));
        System.out.println("Reemplazo de 'Aburre' por 'Cansa': " + cadena.replace("Aburre","Cansa"));
    }
    public static void mostrarConversionesString(String cadena) {
        System.out.println("En mayúsculas: " + cadena.toUpperCase());
        System.out.println("En minúsculas: " + cadena.toLowerCase());
        System.out.println("Sin espacios extremos: " + cadena.trim());

        String[] palabras = cadena.split(" ");
        System.out.println("Número de palabras: " + palabras.length);
    }
    public static void mostrarAnalisisCaracteres(String cadena) {
        int letras=0, digitos=0, espacios=0, mayus=0, minus=0;

        for (int i=0; i<cadena.length(); i++) {
            char ch = cadena.charAt(i);

            if(Character.isLetter(ch)) letras++;
            if(Character.isDigit(ch)) digitos++;
            if(Character.isWhitespace(ch)) espacios++;
            if(Character.isUpperCase(ch)) mayus++;
            if(Character.isLowerCase(ch)) minus++;
        }

        System.out.println("Letras: " + letras);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Mayúsculas: " + mayus);
        System.out.println("Minúsculas: " + minus);
    }
}