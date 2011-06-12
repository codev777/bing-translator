package com.saturdaycoder.bingtranslator;

public class Language {
	public String code;
	public String getLocale() {
		try {
			return code.substring(0, 2);
		} catch (Exception e) {
			return code;
		}
	}
	public String name;
	
}
