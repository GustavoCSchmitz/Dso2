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
   
        Produto p1 = new Produto("Café",1,2);
        Produto p2 = new Produto("Azeite",2,3);
        Produto p3 = new Produto("Arroz",3,5);
        Produto p4 = new Produto("Ovo",4,8);
        Produto p5 = new Produto("Leite",1,2);
        Produto p6 = new Produto("Feijão",1,6);
        Produto p7 = new Produto("Macarrão",1,4);
        Produto p8 = new Produto("Sabonete",1,1);
        Produto p9 = new Produto("Cerveja",1,3);
        Produto p10 = new Produto("Pão",1,5);
        ControladorProduto.getinstance().cadastraProduto(p1);
        ControladorProduto.getinstance().cadastraProduto(p2);
        ControladorProduto.getinstance().cadastraProduto(p3);
        ControladorProduto.getinstance().cadastraProduto(p4);
        ControladorProduto.getinstance().cadastraProduto(p5);
        ControladorProduto.getinstance().cadastraProduto(p6);
        ControladorProduto.getinstance().cadastraProduto(p7);
        ControladorProduto.getinstance().cadastraProduto(p8);
        ControladorProduto.getinstance().cadastraProduto(p9);
        ControladorProduto.getinstance().cadastraProduto(p10);

    }
}
