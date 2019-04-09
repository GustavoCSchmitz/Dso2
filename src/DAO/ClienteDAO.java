package DAO;

import Entidades.Cliente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

public class ClienteDAO {
    private static ClienteDAO instancia;
    private HashMap<Integer, Cliente> cliente = new HashMap<>();
    private final String arquivoCliente = "Cliente.dat";
    
    private ClienteDAO (){
        load();
    }
    
    public Cliente get(Integer cpfPropiretario){
        return cliente.get(cpfPropiretario);
    }
    
    public void put(Cliente c){
        cliente.put(c.getCpf(), c);
        this.persist();
    }
    
    public void remove(long cpf){
	cliente.remove(cpf);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoCliente);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cliente);
           
           oo.flush();
           fout.flush();
            
           oo.close();
           fout.close();
           
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void load () {
        try {
            FileInputStream fin = new FileInputStream(arquivoCliente);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cliente = (HashMap<Integer, Cliente>) oi.readObject();
            
            oi.close();
            fin.close();
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public static ClienteDAO getInstancia(){
        if(instancia == null){
            instancia = new ClienteDAO();
        }
        return instancia;
    }
    
    public Collection<Cliente> getList(){
	return cliente.values();
    }
}
