
public class _05_EjercicioConversionMoneda {

	public static void main(String[] args) {
		float eur = 34.85F;
		final float USD = (eur / 0.85F);

		System.out.println(USD);
		System.out.println(eurToUsd(34.85F));
		System.out.println(usdToEur(40.999996F));
	}

	public static float eurToUsd(float eur) {
		return eur / 0.85F;
	}

	public static float usdToEur(float usd) {
		return usd * 0.85F;
	}
}
