package com.ble.message;

import java.util.HashMap;
import java.util.Map;

import com.megster.cordova.ble.central.Peripheral;

public class MessageHandlerFactory {

	private Map<Byte, MessageHandler> mMessageHandlers;
	
	public MessageHandlerFactory(Peripheral peripheral) {
		mMessageHandlers = new HashMap<>();
		mMessageHandlers.put(HealthMessageHandler.TYPE, new HealthMessageHandler(peripheral));
		mMessageHandlers.put(SportsMessageHandler.TYPE, new SportsMessageHandler(peripheral));
		mMessageHandlers.put(SecurityMessageHandler.TYPE, new SecurityMessageHandler(peripheral));
		mMessageHandlers.put(SettingMessage.TYPE, new SettingMessage(peripheral));
		mMessageHandlers.put(PhoneMessageHandler.TYPE,new PhoneMessageHandler(peripheral) );
	}
	
	public MessageHandler getMessageHandler(byte type) {
		return mMessageHandlers.get(type);
	}
	
	
}
