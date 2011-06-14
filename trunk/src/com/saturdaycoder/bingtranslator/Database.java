package com.saturdaycoder.bingtranslator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "userdb.sqlite";
	private static final int DB_VERSION = 1;
	protected Database(Context context) {
		super(context, DATABASE_NAME, null, DB_VERSION);
	}
	protected static Database inst = null;
	public static Database getInstance(Context context) {
		if (inst == null) {
			synchronized(Database.class) {
				if (inst == null) {
					inst = new Database(context);
				}
			}
		}
		
		return inst;
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE langs (channel_id code TEXT primary key, "
				+ " can_translate BOOLEAN DEFAULT TRUE, "
				+ " can_speak BOOLEAN DEFAULT TRUE)");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		db.execSQL("DROP TABLE IF EXISTS langs");
		onCreate(db);
	}
	
	public void putLanguage(String code, Language.Attributes attributes) {
		
	}
	
	public void putLanguageName(String code, String locale, String name) {
		
	}
	
	public void removeLanguage(String code) {
		
	}
	
	public Language.Attributes getLanguageAttributes(String code) {
		return null;
	}
	
	public Language[] getLanguages() {
		return null;
	}
	
	public String getLanguageName(String code, String locale) {
		return null;
	}
	
	public void removeAllLanguages() {
	}
	
	public void setLanguageName(String code, String locale, String name) {
		
	}
	
	public boolean hasLocaleNames(String locale) {
		return false;
	}
	
}
