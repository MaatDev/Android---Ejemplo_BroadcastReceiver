package com.examples.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
	
		for(int i = 0; i< 5;i++)
		Log.v("Droidnova","*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
		MyPhoneStateListener phonelistener = new MyPhoneStateListener();
		TelephonyManager manager = (TelephonyManager)
			context.getSystemService(Context.TELEPHONY_SERVICE);
		manager.listen(phonelistener, PhoneStateListener.LISTEN_CALL_STATE);
		
		
	}

}
