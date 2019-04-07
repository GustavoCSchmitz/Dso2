/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
/**
 *
 * @author Gustavo
 */
public class Cliente implements Serializable {
    
    private String nome;
    private long cpf;
    private long cartaoCredito;
    private short senhaCartao;
    
    public Cliente(long cartaoCredito, short senhaCartao){
        this.senhaCartao = senhaCartao;
        this.cartaoCredito = cartaoCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public short getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(short senhaCartao) {
        this.senhaCartao = senhaCartao;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(long cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    
}
