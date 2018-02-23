package br.com.simed.model;
public class Cidade extends Estado{
    private int codigocidade;
    private String nomeCidade;

    public int getCodigocidade() {
        return codigocidade;
    }

    public void setCodigocidade(int codigocidade) {
        this.codigocidade = codigocidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNome(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
   
    @Override
  public String toString(){
      return getNomeCidade();
  } 

    
}
