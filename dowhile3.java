package atividadeDOWHILE;
import java.util.*;
public class dowhile3 {
    public static void main(String[] args) {
        Scanner scnFruta = new Scanner(System.in);
        Scanner scnSair = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();
        System.out.println("Digite o nome de uma fruta");
        String fruta = scnFruta.nextLine();

        boolean sair = false;
        while(sair == false){
        if(fruta!=""){
            frutas.add(fruta);
        }else{
            System.out.println("Digite um nome válido");
        }
        System.out.println("Deseja digitar mais alguma fruta?");
        System.out.println("Digite S ou s para continuar ou N/n para sair");
        String saida = scnSair.nextLine();
        if(saida.equals("N")|| saida.equals("n")){
            break;
        }
    }
    System.out.println("Foram adicionadas "+frutas.size()+ " frutas, quais sejam: "+frutas);
    scnFruta.close();
    scnSair.close();
}
}
