package modelo;

public class MesaElectoral {
    //ATRIBUTOS de clase
    private int idMesa;
    private HMiembroDeMesa[] miembroMesa; //sale de la clase de Miembro de mesa

    private static int MAX = 3; //son solo 3 miembros

    //METODO
    //CONSTRUCTOR
    public MesaElectoral(int idMesa, HMiembroDeMesa[] miembroMesa) {
        this.idMesa = idMesa;
        this.miembroMesa = new HMiembroDeMesa[MAX];
    }

    //GETTER AND SETTER
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public HMiembroDeMesa[] getMiembroMesa() {
        return miembroMesa;
    }

    public void setMiembroMesa(HMiembroDeMesa[] miembroMesa) {
        this.miembroMesa = miembroMesa;
    }

    //verInfo
    public String verInfo() {
        String comentario = "";
        for (int i = 0; i < miembroMesa.length; i++) {
            comentario = comentario + miembroMesa[i].verInfo();
            
        }
        return "MesaElectoral{" + "ID de Mesa:" + idMesa + "Miembros de Mesa: " + comentario  + '}';
    }
   
    
   //falta
    public void modificarMesaElectoral(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el id de la mesa Electoral: ");
        idMesa = sc.nextInt();
   
        System.out.print("Ingrese el total de votantes registrados: ");
        nroTotalVotantesRegistrados = sc.nextInt();
    }
   
   //resultados por candidato
   
    //votos en blancoy nulos
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
   
    public String verInfo() {
        return "Informacion de la mesa: \n" +
               "\nID de la mesa: " + idMesa + 
                "\nMiembro de mesa: " + 
        System.out.println("Id de la mesa: "+idMesa+"\n"+
                "Numero de votantes registrados: "+nroTotalVotantesRegistrados+"\n"+
                "cantidad de miembros de mesa: "+cantMDM+"\n");

        for (int i = 0; i < cantMDM; i++) {
            miembroMesa[i].verInfo();
            System.out.println("\n");
        }
    }
}