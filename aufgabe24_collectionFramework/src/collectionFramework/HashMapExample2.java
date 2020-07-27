package collectionFramework;

import java.util.HashMap;

/**
 * This example shows how you could use HashMap Collection for translating your UI.
 * @author hansz
 *
 */
public class HashMapExample2 {
	private static HashMap<String, String> englishMap = new HashMap<>();
	private static HashMap<String, String> germanMap = new HashMap<>();
	private static HashMap<String, String> languageMap = new HashMap<>();
	
	/**
	 * The HashTable for the selected language is created (e.g. englishMap) and then 
	 * a reference is stored in the HashTable used for retrieving the translations (= languageMap)
	 * @param language selected language
	 */
	public static void translateText(String language) {
		
		switch (language.toLowerCase()) {
		case "english":
			initEnglishMap();
			languageMap = englishMap;
			break;
			
		case "german":
			initGermanMap();
			languageMap = germanMap;
			break;

		default:
			System.out.printf("Fehler in translateText: Es gibt keine Übersetzung für %s%n", language);;
		}
		
		printTranslatedText();
	}
	
	/**
	 * Each language has its own HashMap.
	 * The  HashMap of the selected language is referenced to this languageMap and
	 * that's why we need only one function for retrieving the translated text,
	 */
	private static void printTranslatedText() {
		System.out.println(languageMap.get("feld1"));
		System.out.println(languageMap.get("feld2"));
		System.out.println(languageMap.get("feld3"));
	}
	
	private static void initEnglishMap() {
		englishMap.put("feld1", "Translated text for field 1");
		englishMap.put("feld2", "Translated text for field 2");
		englishMap.put("feld3", "Translated text for field 3");
	}
	
	private static void initGermanMap() {
		germanMap.put("feld1", "Übersetzter Text für Feld 1");
		germanMap.put("feld2", "Übersetzter Text für Feld 2");
		germanMap.put("feld3", "Übersetzter Text für Feld 3");
	}

}
