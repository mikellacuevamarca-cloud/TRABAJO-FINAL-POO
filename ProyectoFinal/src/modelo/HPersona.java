
package modelo;

public class HPersona {
    //ATRIBUTOS
    protected String nombres;
    protected String apellidos;
    protected int nrodni; 
    
    //metodo
    //CONSTRUCTOR sin p
    public HPersona() {
        nombres = "";
        apellidos = "";
        nrodni = 0;
    }

    //constructor con p
    public HPersona(String nombres, String apellidos, int nrodni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nrodni = nrodni;
    }

    //get and set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNrodni() {
        return nrodni;
    }

    public void setNrodni(int nrodni) {
        this.nrodni = nrodni;
    }
    
    //OTROS METODOS veriinfo
    public String verInfo(){
        return "Nombres: "+ nombres+
                "\nApellidos: "+ apellidos+
                "\nNumero de Dni: "+ nrodni;
    }
    
}
