package com.saturdaycoder.bingtranslator;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {
	private static final String FILENAME = "preferences";
	
	private static final String PREF_TO_LANG = "to_lang";
	private static final String PREF_SPOKEN_LANG = "speak_lang";
	private static final String PREF_USER_LOCALE = "locale";
	
	
	public static void setToLang(Context context, String to) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		pref.edit().putString(PREF_TO_LANG, to);
		pref.edit().commit();
	}
	
	public static String getToLang(Context context) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		return pref.getString(PREF_TO_LANG, "en");
	}
	
	public static void setSpeakLang(Context context, String lang) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		pref.edit().putString(PREF_SPOKEN_LANG, lang);
		pref.edit().commit();
	}
	
	public static String getSpeakLang(Context context) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		return pref.getString(PREF_SPOKEN_LANG, "en");
	}
	
	public static void setLocale(Context context, String locale) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		pref.edit().putString(PREF_USER_LOCALE, "en");
		pref.edit().commit();
	}
	
	public static String getLocale(Context context) {
		SharedPreferences pref = context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE);
		return pref.getString(PREF_USER_LOCALE, "en");
	}
}
