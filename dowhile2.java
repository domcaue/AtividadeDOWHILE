package atividadeDOWHILE;

import java.util.*;

public class dowhile2 {
    public static void main(String[] args) {
        
        // String[] usuariosLogados ={"teste1","teste2","..."};
        // usuariosLogados[2] = "teste4";
        // usuariosLogados[3] = "Substituir a string...";

        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;
        
        Scanner scnUser = new Scanner(System.in);
        String usuario;
        try{
             while(usersLogged.size() < limitUsers){
            System.out.println("digite o usuário");
            usuario = scnUser.nextLine();
            if(usuario != ""){
                usersLogged.add(usuario);
            }else{
                System.out.println("Digite um usuario válido");
            }
            Thread.sleep(1000);
            } 
            System.out.println("Limite de usuarios excedido");
            
        }catch(InterruptedException e){
            System.out.println("ops! algo deu errado" +e);
        }

        scnUser.close();
    }
}
