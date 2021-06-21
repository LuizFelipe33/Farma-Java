
package infos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {

    
    private String nome;
    private String CPF;
    private String numero;
    private String CEP;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public String Salvar (){
        
        try {
            FileWriter fw = new FileWriter("Cliente.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(""+ this.getNome() +"_"+ this.getCPF() +"_"+ this.getNumero() +"_"+ this.getCEP());
            
            
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileWriter fw = new FileWriter("NomeCEP.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(""+ this.getNome() +"_"+ this.getCEP() );
            
            
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
        
        return "Cadrastrado com Sucesso!" ;
    }
    
 

    
    
}
