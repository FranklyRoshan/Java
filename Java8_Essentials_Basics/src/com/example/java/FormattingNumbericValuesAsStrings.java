package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbericValuesAsStrings {

	public static void main(String[] args) {
		
		Locale locale = new Locale("da", "DK"); // Danish (Denmark)

		double doubleValue = 1_234_567.89d; // double doubleValue = 1_234_567.89;

		NumberFormat numF = NumberFormat.getInstance();
		System.out.println("Number: " + numF.format(doubleValue));
		
		NumberFormat numF1 = NumberFormat.getInstance(locale);
		System.out.println("Number: " + numF1.format(doubleValue));

		NumberFormat curF = NumberFormat.getCurrencyInstance();
		System.out.println("currency: " + curF.format(doubleValue));

		NumberFormat curF1 = NumberFormat.getCurrencyInstance(locale);
		System.out.println("currency: " + curF1.format(doubleValue));

		NumberFormat intF = NumberFormat.getIntegerInstance();
		System.out.println("Integer: " + intF.format(doubleValue));

		NumberFormat intF1 = NumberFormat.getIntegerInstance(locale);
		System.out.println("Integer: " + intF1.format(doubleValue));

		System.out.println("Language: " + locale.getLanguage());
		System.out.println("Country: " + locale.getCountry());
		System.out.println("Display Name: " + locale.getDisplayName());

	}

}

/*
 * 💡 Why Use Locale? Locale is essential for internationalization (i18n) and
 * localization (l10n) — for example: Showing dates and currencies according to
 * a region. Translating text based on the user’s language. Formatting numbers
 * and measurements.
 */

/*
 * Parameter Description Example language Lowercase ISO 639 language code "en"
 * (English), "fr" (French), "da" (Danish) country Uppercase ISO 3166 country
 * code "US" (United States), "IN" (India), "DK" (Denmark)
 */

/*
 * 🧩 Syntax Breakdown Part Meaning Locale Class name (from java.util) locale
 * Reference variable of type Locale new Locale("da", "DK") Creates a Locale
 * object with specific language and country codes
 */