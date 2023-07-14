package curso.entradaDeDados;

import javax.swing.JOptionPane;

public class dados {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

		double pessoaNumero = Double.parseDouble(pessoas);
		double carroNumero = Double.parseDouble(carros);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o  resultado da divisão ?");

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "A divisão para pessoas deu  " + divisao);
		}else {
			System.out.println("Optou por não ver o resultado");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Quer saber o resto da divisão ?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "sobrou" + resto + " carros");
		}else {
			System.out.println("Optou por não ver o resultado");
		}

	}

}
