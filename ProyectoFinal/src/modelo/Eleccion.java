package modelo;


public abstract class Eleccion {
    //atributos de intancia
    protected Fecha fecha;
    protected Candidato[] candidatos;
    protected int nroCandidatos;
    protected String titulo;
    private static final int MAX=100;
    public Eleccion(){
        fecha = new Fecha();
        nroCandidatos=0;
        titulo="";
        candidatos=new Candidato[MAX];
    }
    public Eleccion(Fecha fecha, Candidato[] candidatos, String titulo){
        this.fecha=fecha;
        this.candidatos=candidatos;
        this.titulo=titulo;
                
    }
    public Fecha getFecha() {
        return fecha;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public int getCandidatoslenght(){
        return candidatos.length;
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
    }
    
   
