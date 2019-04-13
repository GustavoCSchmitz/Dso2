package Controladores;

import Entidades.Produto;
import Exceptions.ItemInexistenteException;
import Exceptions.SenhaInvalidaException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gustavo
 */
public class ControladorCompra {
    
    private List<Produto> listaDeCompras = new ArrayList<>();
    private static ControladorCompra instance;
    private double caixaLoja;
    private List<Produto> produtosVendidos = new ArrayList<>();
    
    public ControladorCompra(){ }
    
    public static ControladorCompra getinstance(){
        if(instance == null){
            instance = new ControladorCompra();
        }
        return instance;
    }
    
    public void iniciarCompra(){
        // pensar sobre!
    }
    
    public void insereListaDeCompras(Produto p) throws ItemInexistenteException{
        if(p.getCodigoDeBarras() != -1){
            listaDeCompras.add(p);
        }else {         
            throw new ItemInexistenteException("Item inexistente");
        }
        
    }
    
    public void removeListaDeCompras(Produto p) throws SenhaInvalidaException{
        //fazer if, se a senha digitada for igual a senhaFuncionario
        
        
    }
    
    public void FinalizarCompra(List<Produto> listaDeCompras){
        double totalDaCompra = 0;
        for(Produto p : listaDeCompras){
           totalDaCompra += p.getPreco();
        }
        
        for(Produto p : listaDeCompras){
            produtosVendidos.add(p);
        }
        listaDeCompras.clear();
        caixaLoja += totalDaCompra;
    }

    
    public void CancelarCompra() throws SenhaInvalidaException{
        if(true){
            listaDeCompras.clear();
        }else{
            throw new SenhaInvalidaException("Senha Inválida");
        }
    }
        
    public List<Produto> getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(List<Produto> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public double getCaixaLoja() {
        return caixaLoja;
    }

    public void setCaixaLoja(double caixaLoja) {
        this.caixaLoja = caixaLoja;
    }
    
    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<Produto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }
    
    
}
