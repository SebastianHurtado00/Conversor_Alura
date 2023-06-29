import javax.swing.JOptionPane;

class Conversion {
	private String opcion[];
	private double dato;

	public Conversion(String opcion[], double dato) {
		this.opcion = opcion;
		this.dato = dato;
	}
	
	public String Mn() {
		MenuPrincipal.main(null);
	}

	public void Ejecucuion() {
		String moneda = (String) JOptionPane.showInputDialog(null, "¿Aque moneda desea hacer la conversion?",
				"Conversor", JOptionPane.PLAIN_MESSAGE, null, this.opcion, this.opcion[0]);

		switch (moneda) {
		case "Peso a Dólar": {
			double dolares = this.dato / 5000;
			double dolaresRedondeados = Math.round(dolares * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null,
					this.dato + "$ pesos colombianos son: " + dolaresRedondeados + "$ dolares. ");
			break;
		}
		case "Peso a Euros": {
			double euros = this.dato / 4500;
			double eurosRedondeados = Math.round(euros * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null,
					this.dato + "$ pesos colombianos son: " + eurosRedondeados + "€ Euros. ");
			break;
		}

		case "Peso a Libras Esterlinas": {
			double libras = this.dato / 5200;
			double librasRedondeados = Math.round(libras * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null,
					this.dato + "$ pesos colombianos son: " + librasRedondeados + "£ Libras Esterlinas. ");
			break;
		}
		case "Peso a Yen": {
			double euros = this.dato / 28.77;
			double yenRedondeados = Math.round(euros * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, this.dato + "$ pesos colombianos son: " + yenRedondeados + "¥ yenes. ");
			break;
		}
		case "Peso a Won": {
			double euros = this.dato / 0.32;
			double wonRedondeados = Math.round(euros * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, this.dato + "$ pesos colombianos son: " + wonRedondeados + "₩ wones. ");
			break;
		}

		default:
			JOptionPane.showMessageDialog(null, "Dato Invalido");
		}

		int comfirmResult = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

		if (comfirmResult == JOptionPane.YES_OPTION) {
			Mn();
		} else if (comfirmResult == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}

	}

}
