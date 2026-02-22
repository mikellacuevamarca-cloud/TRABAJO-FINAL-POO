package modelo;
import java.util.Scanner;

public class MesaElectoral {
    //ATRIBUTOS de clase
    private int idMesa;
    private HMiembroDeMesa[] miembroMesa; //sale de la clase de Miembro de mesa
    private int nroTotalVotantesRegistrados;
    private int cantMDM;
    private static int MAX = 3; //son solo 3 miembros
    //resultados por candidato
   
    //votos en blancoy nulos

    public MesaElectoral() {
        idMesa = 0;
        miembroMesa = new HMiembroDeMesa[MAX];
        nroTotalVotantesRegistrados = 0;
        cantMDM = 0;
    }
   
    public MesaElectoral(int idMesa,int nroTotalVotantesRegistrados) {
        this.idMesa = idMesa;
        miembroMesa = new HMiembroDeMesa[MAX];
        this.nroTotalVotantesRegistrados = nroTotalVotantesRegistrados;
        cantMDM = 0;
    }
   
    public void modificarMesaElectoral(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el id de la mesa Electoral: ");
        idMesa = sc.nextInt();
   
        System.out.print("Ingrese el total de votantes registrados: ");
        nroTotalVotantesRegistrados = sc.nextInt();
    }
   
   
    public void agregarMiembrosMesa(HMiembroDeMesa miembroDeMesa){
        if (cantMDM < MAX){
            miembroMesa[cantMDM] = miembroDeMesa;
            cantMDM++;
        }else{
            System.out.println("Error");
        }
       
    }

    public void eliminarMiembroDeMesa(int pos){
        if(pos >= 0 && pos < cantMDM){
            for (int i = pos; i < cantMDM-1; i++) {
                miembroMesa[i] = miembroMesa[i+1];
            }
            cantMDM--;
        }else{
            System.out.println("Error");
        }
    }
   
    public void verInfo() {
        System.out.println("Informacion de la mesa: \n");
        System.out.println("Id de la mesa: "+idMesa+"\n"+
                "Numero de votantes registrados: "+nroTotalVotantesRegistrados+"\n"+
                "cantidad de miembros de mesa: "+cantMDM+"\n");

        for (int i = 0; i < cantMDM; i++) {
            miembroMesa[i].verInfo();
            System.out.println("\n");
        }
    }
}