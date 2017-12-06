package be.vdab.valueobjects;

public final class Adres {
	private final String straat;
	private final String huisnummer;
	private final String busnummer;
	private final String postcode;
	private final String gemeente;
	
	public Adres (String straat, String huisnummer, String busnummer,
			String postcode, String gemeente) {
		if(isStraatValid(straat)) {
			this.straat = straat;
		}
		else {
			throw new IllegalArgumentException();
		}
		if(isHuisnummerValid(huisnummer)) {
			this.huisnummer = huisnummer;
		}
		else {
			throw new IllegalArgumentException();
		}
		if(isBusnummerValid(busnummer)) {
			this.busnummer = busnummer;
		}
		else {
			throw new IllegalArgumentException();
		}
		if(isPostcodeValid(postcode)) {
			this.postcode = postcode;
		}
		else {
			throw new IllegalArgumentException();
		}
		if(isGemeenteValid(gemeente)) {
			this.gemeente = gemeente;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public String getStraat() {
		return straat;
	}

	public String getHuisnummer() {
		return huisnummer;
	}

	public String getBusnummer() {
		return busnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getGemeente() {
		return gemeente;
	}

	public static boolean isStraatValid(String straat) {
		return straat != null && !straat.trim().isEmpty();
	}
	
	public static boolean isHuisnummerValid(String huisnummer) {
		return huisnummer != null && !huisnummer.trim().isEmpty();
	}
	
	public static boolean isBusnummerValid(String busnummer) {
		return busnummer != null;
	}
	
	public static boolean isPostcodeValid(String postcode) {
		return postcode != null && !postcode.trim().isEmpty();
	}
	
	public static boolean isGemeenteValid(String gemeente) {
		return gemeente != null && !gemeente.trim().isEmpty();
	}
	
	@Override
	public String toString() {
		return straat + " " + huisnummer + " " + busnummer + " " + postcode + " " + gemeente;
	}
	
}
