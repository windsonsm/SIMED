package br.com.simed.model;
public class Estado {
    private int codigoEstado;
    private String nomeEstado;
    private String siglaEstado;

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
    
    @Override
  public String toString(){
      return getNomeEstado();
     // return String.valueOf(getCodigoEstado());
  } 
    
    
}
