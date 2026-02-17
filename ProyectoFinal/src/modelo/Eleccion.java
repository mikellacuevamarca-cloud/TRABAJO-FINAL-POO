package modelo;

public abstract class Eleccion {
    //atributos de intancia
    private Fecha fecha;
    private Candidato candidatoAsociado;
    public Eleccion(Fecha fecha, Candidato candidatoAsociado){
        this.fecha=fecha;
        this.candidatoAsociado=candidatoAsociado;
    }
    public Candidato getCandidato(){
        return candidatoAsociado;
    }
    public void setCandidato(Candidato candidatoAsociado){
        this.candidatoAsociado=candidatoAsociado;
    }
    public abstract void modificarEleccion();
    
    
    
}
