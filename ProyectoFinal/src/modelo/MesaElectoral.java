package modelo;

public class MesaElectoral {
    //ATRIBUTOS de clase
    private int idMesa;
    private HMiembroDeMesa[] miembroMesa;
    private static final int MAX = 3;

    // Constructor vacío
    public MesaElectoral() {
        idMesa = 0;
        miembroMesa = new HMiembroDeMesa[MAX];
    }

    // Constructor con parámetro
    public MesaElectoral(int idMesa) {
        this.idMesa = idMesa;
        miembroMesa = new HMiembroDeMesa[MAX];
    }

    //GETTER AND SETTER
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public HMiembroDeMesa[] getMiembroMesa() {
        return miembroMesa;
    }

    public String verInfo() {

        String info = "====== MESA ELECTORAL ======\n\n";
        info = info + "ID de Mesa: " + idMesa + "\n\n";
        info = info + "Miembros de Mesa:\n\n";

        for (int i = 0; i < MAX; i++) {

            info = info + "Posicion: " + i + "\n";

            if (miembroMesa[i] != null) {
                info = info + miembroMesa[i].verInfo() + "\n";
            } else {
                info = info + "Puesto: No asignado\n\n";
            }
        }

        return info;
    }
    /*public String verInfo() {
        String comentario = "";
        for (int i = 0; i < miembroMesa.length; i++) {
            if (miembroMesa[i] != null) {
                comentario = comentario + miembroMesa[i].verInfo();
            }else{
                comentario += "\n  - [Puesto no asignado]";
            }
        }
        return "MesaElectoral{ ID de Mesa:" + idMesa + "Miembros de Mesa: " + comentario  + '}';
    }
*/
}
