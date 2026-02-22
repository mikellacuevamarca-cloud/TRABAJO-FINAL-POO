package modelo;
public class PartidoPolitico {
    private String nombrePartido;
    private String sigla;
    private String simbolo;
    private String representante;
    public PartidoPolitico(){
        nombrePartido="";
        sigla="";
        simbolo="";
        representante="";
    }

    public PartidoPolitico(String nombrePartido, String sigla, String simbolo, String representante) {
        this.nombrePartido = nombrePartido;
        this.sigla = sigla;
        this.simbolo = simbolo;
        this.representante = representante;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public String getSigla() {
        return sigla;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public String verInfo(){
        return "Nombre Partido:"+nombrePartido+"n"+
                "Sigla Partido:"+sigla+"\n"+
                "Simbolo partido:"+simbolo+"\n"+
                "Representante partido:"+representante;
    }
    @Override
    public String toString() {
        return nombrePartido;
    }
    
}
