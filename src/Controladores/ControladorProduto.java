package Controladores;

import Entidades.Produto;
import Exceptions.ItemInexistenteException;
import Telas.TelaCompra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    public Produto getProdutoPeloCodigo(int codigo) {
		return produtosEstoque.stream()
			.filter(produto -> produto.codigoDeBarras == codigo)
			.findFirst()
                        .orElse(null);
    }
}
