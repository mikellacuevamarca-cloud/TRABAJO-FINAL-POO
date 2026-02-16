package modelo;

public class MiembroDeMesa extends Persona{
    //ATRIBUTOS
    public String tipoDeMiembro;
    
    //METODOS
    //CONSTRUCTOR sin p
    public MiembroDeMesa() {
        super();
        tipoDeMiembro = "";
    }
    
    //Constructor con p
    public MiembroDeMesa(String nombres, String apellidos, int nrodni, String tipoDeMiembro){
        super(nombres, apellidos, nrodni);
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //get and set

    public String getTipoDeMiembro() {
        return tipoDeMiembro;
    }

    public void setTipoDeMiembro(String tipoDeMiembro) {
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //redefinir verInfo()
    @Override
    public void verInfo(){
        System.out.println("Información del miembro de mesa: ");
        super.verInfo();
        System.out.println("Tipo de miembro(presidente, secretarion o vocal): " + tipoDeMiembro);
    }
    
    
}
