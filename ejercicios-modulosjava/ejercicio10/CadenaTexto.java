public class CadenaTexto {
    private String cadena;
    private String id;
    private int longitudMax;

    public CadenaTexto(String cadena, String id, int longitudMax) {
        this.cadena = cadena;
        this.id = id;
        this.longitudMax = longitudMax;
    }

    public String getCadena() { return cadena; }
    public String getId() { return id; }
    public int getLongitudMax() { return longitudMax; }

    public void setCadena(String cadena) { this.cadena = cadena; }
    public void setId(String id) { this.id = id; }
    public void setLongitudMax(int longitudMax) { this.longitudMax = longitudMax; }

    // comportamiento 1
    public String agregarPrefijo(String prefijo) {
        return prefijo + cadena;
    }

    // comportamiento 2
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') contador++;
        }
        return contador;
    }
}
