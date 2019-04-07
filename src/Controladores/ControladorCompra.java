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
    private int senhaFuncionario = 123456;
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
        if(true){
            listaDeCompras.remove(p);
        }else{
            throw new SenhaInvalidaException("Senha Invalida");
        }
    }
    
    public void FinalizarCompra(List<Produto> listaDeCompras){
        double totalDaCompra = 0;
        for(Produto p : listaDeCompras){
           System.out.println(p);
           totalDaCompra += p.getPreco();
        }
        
        for(Produto p : listaDeCompras){
            produtosVendidos.add(p);
        }
        listaDeCompras.clear();
        caixaLoja += totalDaCompra;
    }

    public void ImprimirCupom(List<Produto> listaDeCompras){
        //Temporário esse System.out
        for(Produto p : listaDeCompras){
            System.out.println(p);
        }
    }
    
    public void CancelarCompra() throws SenhaInvalidaException{
        //fazer if senhaDoFuncionario com senha inserida
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

    public int getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(int senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public double getCaixaLoja() {
        return caixaLoja;
    }

    public void setCaixaLoja(double caixaLoja) {
        this.caixaLoja = caixaLoja;
    }
    
}
