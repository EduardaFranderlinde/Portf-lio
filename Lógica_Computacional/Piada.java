import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    String s = "Errou!";
    int acertos = 0;
    String resposta1 = JOptionPane.showInputDialog(null, "O que o tomate foi fazer no banco?");
    if (resposta1.equals("Tirar o extrato")) {
      s = "Acertou";
      acertos++;
    }
    JOptionPane.showMessageDialog(null, s);

    String resposta2 = JOptionPane.showInputDialog(null, "Você conhece a piada do pônei?");
    if (resposta2.equals("Po nei eu")) {
      s = "Acertou";
      acertos++;
    } else {
      s = "Errou";
    }
    JOptionPane.showMessageDialog(null, s);
    JOptionPane.showMessageDialog(null, "Você acertou " + acertos + " respostas!");
  }
}
