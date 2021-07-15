import javax.swing.JOptionPane;

class Main{
  String nome = "nome";

  public static void main(String[]args) {
   Main n = new Main();
    n.registro();

  }
public void registro (){
  nome =  JOptionPane.showInputDialog("Qual seu nome?");
  int ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu ano de nascimento?"));
  int idade_atual = (2021-ano_nascimento);
  nome = nome+ " sua idade é "+idade_atual; 
  JOptionPane.showMessageDialog(null, nome);
    }
}
