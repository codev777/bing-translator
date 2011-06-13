package com.saturdaycoder.bingtranslator;

import java.util.HashMap;

public class Language {
	public class Attributes {
		public boolean canTranslate;
		public boolean canSpeak;
	}
	public HashMap<String, String> nameMap = new HashMap<String, String>();
	public Attributes attributes = new Attributes();
}
