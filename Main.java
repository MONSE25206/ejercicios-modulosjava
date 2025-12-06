package ejercicio10cadenadetexto;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto CadenaTexto
        CadenaTexto texto1 = new CadenaTexto("Hola mundo", "MOD-TXT", 50);

        // Mostrar datos iniciales
        System.out.println("Cadena actual: " + texto1.getCadenaActual());
        System.out.println("ID del módulo: " + texto1.getIdModulo());
        System.out.println("Longitud máxima: " + texto1.getLongitudMaxima());

        // Agregar prefijo
        String nuevaCadena = texto1.agregarPrefijo(">>> ");
        System.out.println("Cadena con prefijo: " + nuevaCadena);

        // Contar espacios
        int espacios = texto1.contarEspacios();
        System.out.println("Cantidad de espacios en blanco: " + espacios);
    }
}


