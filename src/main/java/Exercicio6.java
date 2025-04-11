import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
    
        int n1, n2, soma;
            n1 = Integer.parseInt(JOptionPane.showInputDialog("coloque um número: ")); 
            n2 = Integer.parseInt(JOptionPane.showInputDialog("coloque outro número: ")); 
        
                soma = n1+n2;
                
            JOptionPane.showMessageDialog(null,"A soma dos numeros é: " +soma);
    }
}
