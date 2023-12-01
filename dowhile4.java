package atividadeDOWHILE;
import java.util.*;
public class dowhile4 {
   public static void main(String[] args) {
    try{
    Scanner scnProduto = new Scanner(System.in);
    Scanner scnQtd = new Scanner(System.in);
    Scanner scnContinuar = new Scanner(System.in);
    boolean continuar = true;

    String[] nomesProdutos = {
        "Maçã (Kg)",
        "Pão (Un)",
        "Sabão (Un)",
        "Coca-cola(2L)",
        "Chocolate (Barra)"
    };
    Double[] precosProdutos = {
        7.59,
        0.51,
        27.88,
        8.99,
        3.89
    };

    Short codProduto;
    List<Short> codigosProdutosCarrinho =new ArrayList<>();
    List<String> nomesProdutosCarrinho =new ArrayList<>();
    List<Double> precosProdutosCarrinho =new ArrayList<>();

    Double qtdProduto;
    List<Double> qtdsProdutosCarrinho =new ArrayList<>();
    List<Double> subtotalProdutosCarrinho =new ArrayList<>();

    short qtdProdutosCarrinho = 0;
    
    boolean carrinhoCheio = false;

    short idProdTemp;
    while(carrinhoCheio == false){
        idProdTemp = 0;
        while(idProdTemp < nomesProdutos.length){
        System.out.println("Cód["+idProdTemp+"] - Produto: "+nomesProdutos[idProdTemp]);
        idProdTemp++;
        }
        System.out.println("Dgite o código do produto que deseja adicionar ao carrinho");
         codProduto = scnProduto.nextShort();

         codigosProdutosCarrinho.add((codProduto));
         nomesProdutosCarrinho.add(nomesProdutos[codProduto]);
         precosProdutosCarrinho.add(precosProdutos[codProduto]);

        System.out.println("Digite a quantidade do produto que deseja adicionar ao carrinho");
        qtdProduto = scnQtd.nextDouble();

        qtdsProdutosCarrinho.add(qtdProduto);
        subtotalProdutosCarrinho.add(precosProdutos[codProduto]*qtdProduto);

        qtdProdutosCarrinho++;
        if(qtdProdutosCarrinho == nomesProdutos.length){
            carrinhoCheio = true;
        }
        System.out.println("Deseja adicionar mais algum produto no carrinho?");
        if(scnContinuar.nextLine().toUpperCase().equals("NAO")){
            break;
        }

        short idProdCarrinhoTemp = 0;
        Double precoTotal = 0.0;
        System.out.println("Os produtos do carrinho são:");

        while(idProdCarrinhoTemp < nomesProdutosCarrinho.size()){
            System.out.println(
               "Código: "+
            codigosProdutosCarrinho.get(idProdCarrinhoTemp)+
            " | Produto: "+
            nomesProdutosCarrinho.get(idProdTemp)+
            " | Preço Unitário: "+
            precosProdutosCarrinho.get(idProdCarrinhoTemp)+
            " | Quantidade: "+ 
            qtdsProdutosCarrinho.get(idProdCarrinhoTemp)+
            " | Subtotal: R$ "+
            subtotalProdutosCarrinho.get(idProdCarrinhoTemp) 
            );
            precoTotal += subtotalProdutosCarrinho.get(idProdCarrinhoTemp);
            idProdCarrinhoTemp++;
        
        System.out.println("Total da compra: R$ "+precoTotal);



    }



    scnProduto.close();
    scnQtd.close();
    scnContinuar.close();
        }catch;
    }
}
}
