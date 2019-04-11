package Entidades;
import java.io.Serializable;
/**
 *
 * @author Gustavo
 */
public class Produto implements Serializable{
    
    private String nomeProduto;
    public int codigoDeBarras;
    private int preco;

    public Produto(String nomeProduto, int codigoDeBarras, int preco){
        this.nomeProduto = nomeProduto;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
