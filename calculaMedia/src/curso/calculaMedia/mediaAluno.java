package curso.calculaMedia;

import javax.swing.JOptionPane;

public class mediaAluno {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota: ");

		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);

		double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;

		if (media >= 50) {

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média de : " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de : " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com média de : " + media);
		}

	}

}
