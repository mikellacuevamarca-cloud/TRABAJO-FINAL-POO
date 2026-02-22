
package modelo;

public class DetalleVoto {
    //ATRIBUTOS
    private HCandidato candidato;
    private int cantidadCandidato; //general
    private int votosPreferenciales; //dentro del general, cuantos votaron especificamente por el

    //CONSTRCUTOR
    public DetalleVoto(HCandidato candidato, int cantidadCandidato, int votosPreferenciales) {
        this.candidato = candidato;
        this.cantidadCandidato = cantidadCandidato;
        this.votosPreferenciales = votosPreferenciales;
    }
    
    //GET AND SET
    public HCandidato getCandidato() {
        return candidato;
    }

    public void setCandidato(HCandidato candidato) {
        this.candidato = candidato;
    }

    public int getCantidadCandidato() {
        return cantidadCandidato;
    }

    public void setCantidadCandidato(int cantidadCandidato) {
        this.cantidadCandidato = cantidadCandidato;
    }

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public void setVotosPreferenciales(int votosPreferenciales) {
        this.votosPreferenciales = votosPreferenciales;
    }
    
    //verinfo
    public String verInfo() {
        return "DetalleVoto {" + 
                "\nCandidato:" + candidato + 
                "\nCantidad de votos general de candidato: " + cantidadCandidato + 
                "\nVotos Preferenciales: " + votosPreferenciales + '}';
    }
    
}
