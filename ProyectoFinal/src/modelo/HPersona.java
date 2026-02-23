
package modelo;

public class HPersona {
    //ATRIBUTOS
    protected int nrodni;
    protected String nombres;
    protected String apellidos;
     
    
    //metodo
    //CONSTRUCTOR sin p
    public HPersona() {
        nrodni = 0;
        nombres = "";
        apellidos = "";
        
    }

    //constructor con p
    public HPersona(int nrodni, String nombres, String apellidos) {
        this.nrodni = nrodni;
        this.nombres = nombres;
        this.apellidos = apellidos;    
    }

    //get and set
    public int getNrodni() {
        return nrodni;
    }

    public void setNrodni(int nrodni) {
        this.nrodni = nrodni;
    }
    
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

    
    
    //OTROS METODOS veriinfo
    public String verInfo(){
        return "nNumero de Dni: "+ nrodni+
                "\nNombres: "+ nombres+
                "\nApellidosi: "+ apellidos;
    }
    
}
