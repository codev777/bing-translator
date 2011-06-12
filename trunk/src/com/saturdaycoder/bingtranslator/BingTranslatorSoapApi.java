package com.saturdaycoder.bingtranslator;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.ksoap2.*;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.*;
import org.xmlpull.v1.XmlPullParserException;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.*;

public class BingTranslatorSoapApi {

	private static final String AppId = "32BA0BF1609128EF1E37D5F09C8814B4B1D8EF2B";
	private static final String Url = "http://api.microsofttranslator.com/V2/SOAP.svc";
	private static final String Namespace = "http://api.microsofttranslator.com/V2";
	
	
	public class Language {
		public String code = null;
		public String name = null;
		public ArrayList<Language> spokenLangs = new ArrayList<Language>();
	}
	private static HttpTransportSE transport 
					= new HttpTransportSE(Url);
	private static SoapSerializationEnvelope envelope
					= new SoapSerializationEnvelope(SoapEnvelope.VER11);
	
	public static String[] getLanguagesForTranslate() {
		String method = "GetLanguagesForTranslate";
		String soapAction = "http://api.microsofttranslator.com/V2/LanguageService/GetLanguagesForTranslate";
		try {
	        SoapObject request = new SoapObject(Namespace, 
	        		method);
	        request.addProperty("appId", AppId);
	        envelope.setOutputSoapObject(request);
	        envelope.bodyOut = request;
	        envelope.dotNet = true;
	        envelope.encodingStyle="UTF-8";
	        transport.debug = true;
	        transport.call(soapAction, envelope);
	        Object result = envelope.getResponse();
	        if (result == null) {
	        	Debugger.error("Error get response: null");
	        	return null;
	        }
	        else {
	        	SoapObject so = (SoapObject)result;
	        	Debugger.debug("response count  " + so.getPropertyCount());
	        	if (so.getPropertyCount() < 1) {
	        		return null;
	        	}
	        	String ret[] = new String[so.getPropertyCount()];
	        	for (int i = 0; i < so.getPropertyCount(); ++i) {
	        		Debugger.debug("prop [" + i + "],  = " + so.getProperty(i).toString());
	        		ret[i] = so.getProperty(i).toString();
	        	}
	        	Debugger.debug("response is " + result.toString());
	        	return ret;
	        }
	    } catch (Exception e) {
	    	Debugger.error("error: " + e.toString());
	    	Debugger.error("\r\n\r\n\r\n");
	    	Debugger.debug("Soap request is: " + transport.requestDump);
	    	Debugger.error("\r\n\r\n\r\n");
	    	Debugger.debug("Soap response is: " + transport.responseDump);
	    	Debugger.error("\r\n\r\n\r\n");
	        return null;
	    }
	}
	
	public static String[] getLanguagesForSpeak() {
		String method = "GetLanguagesForSpeak";
		String soapAction = "http://api.microsofttranslator.com/V2/LanguageService/GetLanguagesForSpeak";
		try {
	        SoapObject request = new SoapObject(Namespace, 
	        		method);
	        request.addProperty("appId", AppId);
	        envelope.setOutputSoapObject(request);
	        envelope.bodyOut = request;
	        envelope.dotNet = true;
	        envelope.encodingStyle="UTF-8";
	        transport.debug = true;
	        transport.call(soapAction, envelope);
	        Object result = envelope.getResponse();
	        if (result == null) {
	        	Debugger.error("Error get response: null");
	        	return null;
	        }
	        else {
	        	SoapObject so = (SoapObject)result;
	        	Debugger.debug("response count  " + so.getPropertyCount());
	        	if (so.getPropertyCount() < 1) {
	        		return null;
	        	}
	        	String ret[] = new String[so.getPropertyCount()];
	        	for (int i = 0; i < so.getPropertyCount(); ++i) {
	        		Debugger.debug("prop [" + i + "],  = " + so.getProperty(i).toString());
	        		ret[i] = so.getProperty(i).toString();
	        	}
	        	Debugger.debug("response is " + result.toString());
	        	return ret;
	        }
	    } catch (Exception e) {
	    	Debugger.error("error: " + e.toString());
	    	Debugger.error("\r\n\r\n\r\n");
	    	Debugger.debug("Soap request is: " + transport.requestDump);
	    	Debugger.error("\r\n\r\n\r\n");
	    	Debugger.debug("Soap response is: " + transport.responseDump);
	    	Debugger.error("\r\n\r\n\r\n");
	        return null;
	    }
	}
}
