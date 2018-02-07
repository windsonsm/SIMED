package br.com.simed.model;
public class Cep extends Bairro{
    private int codigo;
    private String logradouro;

  public int getCodigo() {
      return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
  
    
    
 @Override
  public String toString(){
      String codigo = String.valueOf(getCodigo());
      return codigo;
  } 
  
  
  
}
