package modelo;

public abstract class Eleccion {
    //atributos de intancia
    private Fecha fecha;
    private Candidato candidatoAsociado;
    public Eleccion(){
        fecha = new Fecha();
    }
    public Eleccion(Fecha fecha, Candidato candidatoAsociado){
        this.fecha=fecha;
        this.candidatoAsociado=candidatoAsociado;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Candidato getCandidatoAsociado() {
        return candidatoAsociado;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCandidatoAsociado(Candidato candidatoAsociado) {
        this.candidatoAsociado = candidatoAsociado;
    }
    public String verInfo(){
        return "Fecha:"+fecha+"\n"+candidatoAsociado;
    }
    public abstract void registrarEleccion();
    
    
}
