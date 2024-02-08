
public class _05_EliminarDuplicados {

	public static void main(String[] args) {
		System.out.println("ELIMINAR ELEMENTOS ARRAY DUPLICADOS");
		System.out.println("-----------------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();
		System.out.println("");
		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);
		
		int acumuladorRepeticiones = 0;
		
		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			for (int j = i + 1; j < arrayNumerosEnteros.length; j++) {
				if ( arrayNumerosEnteros[i] == arrayNumerosEnteros[j]) {
					acumuladorRepeticiones++;
				}
			}
		}
		
		System.out.println(acumuladorRepeticiones);

	}

}
