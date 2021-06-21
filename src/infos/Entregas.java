
package infos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Entregas extends Cliente{
    
    private String produto;
    private String data;
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String Salvar (){
        
        try {
            FileWriter fw = new FileWriter("Entregas.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(""+ this.getNome()+"_"+ this.getProduto() +"_"+ this.getCEP() +"_"+ this.getData());
            
            
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
        
        
        return "Cadrastrado com Sucesso!" ;
    }
    
    
}
