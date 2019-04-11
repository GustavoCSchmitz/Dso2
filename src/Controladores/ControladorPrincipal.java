/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Telas.TelaCartao;
import Telas.TelaCompra;
import Telas.TelaConfirmacao;
import Telas.TelaFinal;
import Telas.TelaInicial;
import Telas.TelaSenhaCancelaCompra;


/**
 *
 * @author Gustavo
 */
public class ControladorPrincipal {
    
    
    private static ControladorPrincipal instance;
    
    public ControladorPrincipal(){
        
    }
    
    public static ControladorPrincipal getinstance(){
        if(instance == null){
            instance = new ControladorPrincipal();
        }
        return instance;
    }
    
    public void exibeTelaInicial(){
        TelaInicial.getinstance().setVisible(true);
    }
    
    public void exibeTelaFinal(){
        TelaFinal.getinstance().setVisible(true);
    }
    
    public void exibeTelaConfirmacao(){
        TelaConfirmacao.getinstance().setVisible(true);
    }
    
    public void exibeTelaCompra(){
        TelaCompra.getinstance().setVisible(true);
    }
    
    public void exibeTelaCartao(){
        TelaCartao.getinstance().setVisible(true);
    }
    
    public void exibeTelaSenhaCancelaCompra(){
        TelaSenhaCancelaCompra.getinstance().setVisible(true);
    }
       
}
