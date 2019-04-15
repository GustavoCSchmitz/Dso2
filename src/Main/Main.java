/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controladores.ControladorProduto;
import Entidades.Produto;
import Telas.TelaCompra;
import Telas.TelaInicial;

/**
 *
 * @author Gustavo
 */
public class Main {
    
    public static void main(String[] args){
        
        TelaInicial Tela1 = new TelaInicial();    
        Tela1.setVisible(true);
   
        Produto p1 = new Produto("Café",6558,2);
        Produto p2 = new Produto("Azeite",123,15);
        Produto p3 = new Produto("Arroz",68,45);
        Produto p4 = new Produto("Ovo",9321,12);
        ControladorProduto.getinstance().cadastraProduto(p1);
        ControladorProduto.getinstance().cadastraProduto(p2);
        ControladorProduto.getinstance().cadastraProduto(p3);
        ControladorProduto.getinstance().cadastraProduto(p4);

    }
}
