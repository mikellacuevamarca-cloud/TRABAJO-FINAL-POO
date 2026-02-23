package modelo;

/**
 *
 * @author Mikella
 */
public class GestionOperador {
    private Operador[] operadores;
    private int count;

    public GestionOperador() {
        operadores = new Operador[5]; 
        // Agregamos uno por defecto para probar
        operadores[0] = new Operador("admin", "1234");
        count = 1;
    }

    public boolean autenticar(String user, String pass) {
        for (int i = 0; i < count; i++) {
            if (operadores[i].getUsuario().equals(user) && 
                operadores[i].getContrasenia().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}
