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
		db.execSQL("CREATE TABLE trans_langs (channel_id INTEGER primary key, "
				+ " code TEXT DEFAULT '', "
				+ " name TEXT DEFAULT '')");
		db.execSQL("CREATE TABLE speak_langs (channel_id INTEGER primary key, "
				+ " code TEXT DEFAULT '', "
				+ " name TEXT DEFAULT '')");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		db.execSQL("DROP TABLE IF EXISTS trans_langs");
		db.execSQL("DROP TABLE IF EXISTS speak_langs");
		onCreate(db);
	}
	
	public void setTransLang(Language lang) {
		
	}
	
	public void clearTransLang(Language lang) {
	}
	
	public Language[] getTransLangs() {
	}
}
