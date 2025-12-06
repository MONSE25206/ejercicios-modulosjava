package ejercicio10cadenadetexto;

public class CadenaTexto {

    // 1. Atributos privados
    private String cadenaActual;
    private String idModulo;
    private int longitudMaxima;

    // 2. Constructor
    public CadenaTexto(String cadenaActual, String idModulo, int longitudMaxima) {
        this.cadenaActual = cadenaActual;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    // 3. Getters y Setters
    public String getCadenaActual() {
        return cadenaActual;
    }

    public void setCadenaActual(String cadenaActual) {
        if (cadenaActual.length() <= longitudMaxima) {
            this.cadenaActual = cadenaActual;
        } else {
            System.out.println("Error: la cadena excede la longitud máxima permitida.");
        }
    }

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        if (longitudMaxima > 0) {
            this.longitudMaxima = longitudMaxima;
        } else {
            System.out.println("La longitud máxima debe ser mayor a 0.");
        }
    }

    // 4. Métodos de comportamiento

    // Comportamiento 1: Añadir prefijo
    public String agregarPrefijo(String prefijo) {
        String nuevaCadena = prefijo + this.cadenaActual;

        if (nuevaCadena.length() <= longitudMaxima) {
            this.cadenaActual = nuevaCadena;
            return this.cadenaActual;
        } else {
            return "Error: la cadena resultante excede la longitud máxima permitida.";
        }
    }

    // Comportamiento 2: Contar espacios en blanco
    public int contarEspacios() {
        int contador = 0;

        for (int i = 0; i < cadenaActual.length(); i++) {
            if (cadenaActual.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;
    }
}


