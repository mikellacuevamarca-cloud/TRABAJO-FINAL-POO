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
    
    //get and set
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        String mensajecan="";
        for(int i = 0; i<nroCandidatos;i++){
            mensajecan=mensajecan+candidatos[nroCandidatos].toString()+"\n";
        }
        return "========"+titulo+"========"+"\n"+
                "Fecha:"+fecha+"\n"+
                "Candidatos:"+mensajecan;
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
