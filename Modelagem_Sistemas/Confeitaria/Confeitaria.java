import java.util.ArrayList;

public class Confeitaria{
  private String confeiteiro;
  private ArrayList<String> cardapio;
  private ArrayList<String> utensilios;
  private String clientela;
  private Bolo bolo;

  public Confeitaria(String confeiteiro, String     
  clientela, Bolo bolo){
    this.confeiteiro = confeiteiro;
    this.clientela = clientela;
    this.bolo = bolo;
  }    
    
  public boolean vender(double valor){
    return true;
  }

  public boolean armazenar(String produto, int     
  quantidade){
    return true;
  }

    
}
