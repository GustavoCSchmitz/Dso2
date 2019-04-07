package Controladores;

import Entidades.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class ControladorProduto{
    
    private List<Produto> produtosEstoque = new ArrayList<>();
    private static ControladorProduto instance;
    
    
    public ControladorProduto(){ }
    
    public static ControladorProduto getinstance(){
        if(instance == null){
            instance = new ControladorProduto();
        }
        return instance;
    }
    
    public void cadastraProduto(Produto p){
        produtosEstoque.add(p);
    }
    
    public void removeProduto(Produto p){
        produtosEstoque.remove(p);
    }
    
    public void exibirEstoque(){
        for(Produto p : produtosEstoque){
            System.out.println(p.getNomeProduto()+ p.getCodigoDeBarras() + p.getPreco());
        }
    }
}
