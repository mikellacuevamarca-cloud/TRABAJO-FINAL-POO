package modelo;
    
public class Fecha {
    //Atributos de instancia
    private int dia;
    private int mes;
    private int anio;
    //Metodos
    //Constructores
    //Sin parametros
    public Fecha(){
        dia=1;
        mes=1;
        anio=1900;
    }
    //Con parametros
    public Fecha(int dia, int mes, int anio){
        if(validarFecha(anio,mes,dia)==true){
            this.dia=dia;
            this.mes=mes;
            this.anio=anio;
        }
        else{
            System.err.println("Error en los datos de la fecha.");
            this.dia=1;
            this.mes=1;
            this.anio=1900;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int nroDias(int pmes, int panio){
        if(pmes==2){
            if(panio%4==0){
                return 29;
            }else{
                return 28;
            }
        }
        if(pmes==1||pmes==3||pmes==5||pmes==7||pmes==8||pmes==10||pmes==12){
            return 31;
        }else{
            return 30;
        }
    }
    public boolean validarFecha(int panio, int pmes, int pdia){
        if(panio>0){
            if(pmes>0&&pmes<13){
                if(pdia>0&&pdia<=nroDias(pmes,panio)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
}
