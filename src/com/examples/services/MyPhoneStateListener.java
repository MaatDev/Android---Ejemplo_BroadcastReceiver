package com.examples.services;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyPhoneStateListener extends PhoneStateListener{

	@Override
	public void onCallStateChanged(int state, String incomingNumber) {
		// TODO Auto-generated method stub
		super.onCallStateChanged(state, incomingNumber);
		
		switch(state){
			case TelephonyManager.CALL_STATE_IDLE:
				Log.d("DEBUG","IDLE"+"---------------------------");
				break;
			case TelephonyManager.CALL_STATE_OFFHOOK:
				Log.d("DEBUG","OFFHOOK"+"---------------------------");
				break;
			case TelephonyManager.CALL_STATE_RINGING:
				Log.d("DEBUG","RINGIG"+"---------------------------");
			break;
		
		}
		
		
	}
	
}
