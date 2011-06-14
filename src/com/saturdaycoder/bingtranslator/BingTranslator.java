package com.saturdaycoder.bingtranslator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;

public class BingTranslator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
         db = Database.getInstance(this);
        
    /*    try {
        	BingTranslatorSoapApi.getLanguagesForTranslate();
        	BingTranslatorSoapApi.getLanguagesForSpeak();
        } catch (Exception e) {
        	Debugger.error("Socket/IO exception: " +e.toString());
        }
        */
    }
    
    private void displayTranslator() {
    	
    }
    
    private HashMap<String, String>  codeNameMap = new HashMap<String, String>();
    private ArrayList<String> transCodeList = new ArrayList<String> ();
    private ArrayList<String> speakCodeList = new ArrayList<String> ();
    private Database db;
    
    private void checkLanguageCodes() {
    	Language langs[] = db.getLanguages();
    	if (langs == null || langs.length == 0) {
    		// API - get lang codes - async task
    	}
    }
    
    private void loadLanguageCodes() {
    	transCodeList.clear();
    	speakCodeList.clear();
    	Language langs[] = db.getLanguages();
    	for (int i = 0; i < langs.length; ++i) {
    		if (langs[i].attributes.canTranslate) {
    			transCodeList.add(langs[i].code);
    		}
    		if (langs[i].attributes.canSpeak) {
    			speakCodeList.add(langs[i].code);
    		}
    	}
    }
    
    private void checkLocale() {
    	Locale locale = Locale.getDefault();
    	//String cachedLocale = Preference.getLocale(this);
    	
    	// if the name table not exist in table, get it through API
    	if (!db.hasLocaleNames(locale.toString())) {
    		// API - async task
    	}
    	
    	// load data from DB to arraylist
    }
    
    private void onUpdate() {
    	
    }
    
    private boolean codeListReady = false;
    private boolean nameListReady = false;
    
    private void updateLanguageCodes() {
    	transCodeList.clear();
    	// get lang for translate
    	String[] transCodes = BingTranslatorSoapApi.getLanguagesForTranslate();
    	for (int i = 0; i < transCodes.length; ++i) {
    		transCodeList.add(transCodes[i]);
    	}
    	// get lang for speak
    	speakCodeList.clear();
    	String[] speakCodes = BingTranslatorSoapApi.getLanguagesForSpeak();
    	for (int i = 0; i < speakCodes.length; ++i) {
    		speakCodeList.add(speakCodes[i]);
    	}
    }
    
    private void updateLanguageNames(String locale) {
    	// get lang name
    	
    	
    }
    
    private int[] getMatchingSpeakLangIds(String lang) {
    	// search in speakCodeList
    }
    
    
    
}