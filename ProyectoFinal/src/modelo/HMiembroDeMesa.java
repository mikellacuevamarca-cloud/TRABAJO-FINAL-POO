package modelo;

public class HMiembroDeMesa extends HPersona{
    //ATRIBUTOS
    public ENUMTipoMiembro tipoDeMiembro;
    
    //METODOS
    //conastructor sin p
    public HMiembroDeMesa() {
        super();
        tipoDeMiembro = null;
    }
    //Constructor con p
    public HMiembroDeMesa(int nrodni, String nombres, String apellidos,
            ENUMTipoMiembro tipoDeMiembro){
        super(nrodni, nombres, apellidos);
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //getter and setter
    public ENUMTipoMiembro getTipoDeMiembro() {
        return tipoDeMiembro;
    }

    public void setTipoDeMiembro(ENUMTipoMiembro tipoDeMiembro) {
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //redefinir verInfo() verificar
    @Override
    public String verInfo(){
        return "MiembroDeMesa {" + super.verInfo() + "Tipo De Miembro: " +
                tipoDeMiembro + '}';
    }

}
