package modelo;

public class HMiembroDeMesa extends HPersona{
    //ATRIBUTOS
    public ENUMTipoEleccion tipoDeMiembro;
    
    //METODOS
    //Constructor con p
    public HMiembroDeMesa(String nombres, String apellidos, int nrodni, 
            ENUMTipoEleccion tipoDeMiembro){
        super(nombres, apellidos, nrodni);
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //getter and setter
    public ENUMTipoEleccion getTipoDeMiembro() {
        return tipoDeMiembro;
    }

    public void setTipoDeMiembro(ENUMTipoEleccion tipoDeMiembro) {
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //redefinir verInfo() verificar
    @Override
    public String verInfo(){
        return "MiembroDeMesa {" + super.verInfo() + "Tipo De Miembro: " +
                tipoDeMiembro + '}';
    }

}
//METODOS
    /*CONSTRUCTOR sin p
    public HMiembroDeMesa() {
        super();
        tipoDeMiembro = "";
    }*/
    