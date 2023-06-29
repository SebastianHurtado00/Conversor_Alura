import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {
		String[] Conversores = { "Monedas", "Temperaturas" };
		// Objeto metodo padre Texto de dialogo titulo metodo para una imagen sin imagen
		String opciones = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Conversores",
				JOptionPane.PLAIN_MESSAGE, null,
				// opciones opcion por defecto
				Conversores, Conversores[0]);

		if (opciones == "Monedas") {

			try {
				String Valor = JOptionPane.showInputDialog("Introduce un valor en peso colombiano: ");
				double Dato = Double.valueOf(Valor);
				String[] Divisas = { "Peso a Dólar", "Peso a Euros", "Peso a Libras Esterlinas", "Peso a Yen",
						"Peso a Won" };
				Conversion Value = new Conversion(Divisas, Dato);
				Value.Ejecucuion();
			} catch (NumberFormatException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Dato ingresado Invalido");
			}

		}
	}
}