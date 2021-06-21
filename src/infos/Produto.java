
package infos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produto {
    


    private String produto;
    private String formula;
    private String preco;
    private String quantidade;
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String Salvar (){
        
        try {
            FileWriter fw = new FileWriter("Produto.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(""+ this.getProduto() +"_"+ this.getFormula() +"_"+ this.getPreco() +"_"+ this.getQuantidade());
            
            
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
        
        
        return "Cadrastrado com Sucesso!" ;
    }
    
}
