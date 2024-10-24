import javax.swing.JOptionPane;

public class Sobrecarga{
    public void calcula (double valor){//DEFINE MÉTODO E RECEBE 1 PARAMETRO
        double dobro = valor * 2;
        String x = String.format("Dobro = "+dobro);//FORMATA TD SAIDA P/ UM STRING
        JOptionPane.showMessageDialog(null,x);
    }
    public void calcula (int valor1, int valor2){//DEFINE O MÉTODO E RECEBE 2 PARAMETRO
        int soma = valor1 + valor2;
        String x = String.format("Soma = " +soma);//FORMATA TD SAIDA P/ UM STRING
        JOptionPane.showMessageDialog(null,x);
    }
}
