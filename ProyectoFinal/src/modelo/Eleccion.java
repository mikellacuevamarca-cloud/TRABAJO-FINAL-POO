package modelo;

public abstract class Eleccion {
    //atributos de intancia
    private Fecha fecha;
    private HCandidato candidatoAsociado;
    
    //CONSTRUCTORES
    public Eleccion(){
        fecha = new Fecha();
    }
    public Eleccion(Fecha fecha, HCandidato candidatoAsociado){
        this.fecha=fecha;
        this.candidatoAsociado=candidatoAsociado;
    }
    
    //get and set
    public Fecha getFecha() {
        return fecha;
    }

    public HCandidato getCandidatoAsociado() {
        return candidatoAsociado;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCandidatoAsociado(HCandidato candidatoAsociado) {
        this.candidatoAsociado = candidatoAsociado;
    }
    
    public String verInfo(){
        return "Fecha:"+fecha+"\n"+candidatoAsociado;
    }
    public abstract void registrarEleccion();
    
    
}
