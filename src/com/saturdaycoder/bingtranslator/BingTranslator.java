package com.saturdaycoder.bingtranslator;

import android.app.Activity;
import android.os.Bundle;

public class BingTranslator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        try {
        	BingTranslatorSoapApi.getLanguagesForTranslate();
        	BingTranslatorSoapApi.getLanguagesForSpeak();
        } catch (Exception e) {
        	Debugger.error("Socket/IO exception: " +e.toString());
        }
    }
}