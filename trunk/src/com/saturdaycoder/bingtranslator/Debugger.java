package com.saturdaycoder.bingtranslator;

import android.util.Log;

public class Debugger {
  private static final String TAG="BingTranslator";
  public static void verbose(String s) {
    Log.v(TAG, s);
  }

  public static void debug(String s) {
    Log.d(TAG, s);
  }
  public static void info(String s) {
    Log.i(TAG, s);
  }
  public static void warn(String s) {
	    Log.w(TAG, s);
  }
  public static void error(String s) {
    Log.e(TAG, s);
  }
  public static void dumpException(Exception e) {
	  Log.e(TAG, e.toString());
  }
}
