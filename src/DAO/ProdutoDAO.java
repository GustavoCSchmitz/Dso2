/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Produto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class ProdutoDAO implements Serializable{
    
    private static ProdutoDAO instance;
    private final String nomeArquivo = "Produtos.txt";
    public ArrayList<Produto> listaProdutos = new ArrayList();
    
    
    public ProdutoDAO(){
        load();
    }
    
    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        
        return instance;
    }
    
    public void persist() {
        try {
            FileOutputStream ProdutoOut = new FileOutputStream(nomeArquivo);
            
            ObjectOutputStream oo = new ObjectOutputStream(ProdutoOut);
            oo.writeObject(listaProdutos);
    
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void load() {
        try {
            FileInputStream ProdutosIn = new FileInputStream(nomeArquivo);
            ObjectInputStream io = new ObjectInputStream(ProdutosIn);
            
            this.listaProdutos = (ArrayList<Produto>) io.readObject();
           
        } catch (IOException ex) {
            persist();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Adiciona(Produto p) {
        listaProdutos.add(p);
    }
}
