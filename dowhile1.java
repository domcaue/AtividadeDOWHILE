package atividadeDOWHILE;

public class dowhile1 {
    public static void main(String[] args) {
        int totalTempo = 2;
        int inicioTempo = 0;

        while(inicioTempo <= totalTempo){
            try {
                System.out.println("Assistindo filme..."+inicioTempo);
                Thread.sleep(60000);
                inicioTempo++;
            }catch(InterruptedException e){
                System.out.println("Ops! Hpuve algum erro...:"+e);
            }
        }
        System.out.println("O filme acabou.");
    }
}
