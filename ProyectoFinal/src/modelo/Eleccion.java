package modelo;

public abstract class Eleccion {
    //atributos de intancia
    protected Fecha fecha;
    protected HCandidato[] candidatos;
    protected int nroCandidatos;
    protected String titulo;
    private static final int MAX=100;
    
    //CONSTRUCTORES
    public Eleccion(){
        fecha = new Fecha();
        nroCandidatos=0;
        titulo="";
        candidatos=new HCandidato[MAX];
    }
    public Eleccion(Fecha fecha, HCandidato[] candidatos, String titulo){
        this.fecha=fecha;
        this.candidatos=candidatos;
        this.titulo=titulo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public HCandidato[] getCandidatos() {
        return candidatos;
    }

    public int getNroCandidatos() {
        return nroCandidatos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setCandidatos(HCandidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public void setNroCandidatos(int nroCandidatos) {
        this.nroCandidatos = nroCandidatos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        String mensajecan="";
        for(int i = 0; i<nroCandidatos;i++){
            mensajecan=mensajecan+candidatos[i].toString()+", ";
        }
        return "========"+titulo+"========"+"\n"+
                "Fecha:"+fecha+"\n"+
                "Candidatos:"+mensajecan+" Total de candidatos ("+nroCandidatos+").";
    }
    public abstract String verInfo();
    public void agregarCandidato(HCandidato candidato){
        if(nroCandidatos<MAX){
            candidatos[nroCandidatos]=candidato;
            nroCandidatos++;
        }
        else{
            System.out.println("Espacio lleno.");
        }
    }
    
}
