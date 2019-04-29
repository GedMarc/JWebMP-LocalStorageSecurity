package com.jwebmp.plugins.security.localstorage.implementations;

import com.jwebmp.websockets.WebSocketsConfiguration;
import com.jwebmp.websockets.services.IWebSocketAuthDataProvider;

public class LocalStorageKeyWSAuth
		implements IWebSocketAuthDataProvider<LocalStorageKeyWSAuth>
{
	@Override
	public StringBuilder getJavascriptToPopulate()
	{
		return new StringBuilder("jw.localstorage['jwamsmk']");
	}

	@Override
	public String name()
	{
		return "jwamsmk";
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
