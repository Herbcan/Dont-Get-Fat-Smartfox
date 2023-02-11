package com.sushi.DGF;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.ExtensionLogLevel;
import com.smartfoxserver.v2.extensions.SFSExtension;


public class ServerExtension extends SFSExtension
{
	public final String version = "0.0.1";
	
	@Override
	public void init()
	{
		trace(ExtensionLogLevel.INFO, "===========================================================");
		trace(ExtensionLogLevel.INFO, "Don't Get Fat server extension Initialize.");	
		trace(ExtensionLogLevel.INFO, String.format("version : v%s.", version));
		trace(ExtensionLogLevel.INFO, "===========================================================");
		// Event Listener
		addEventHandler(SFSEventType.SERVER_READY, ServerReadyEventHandler.class);
	}

	@Override
	public void destroy() 
	{
		
	}
	
	@Override
	public Object handleInternalMessage(String cmdName, Object params)
	{
		Object returnObj = null;
		return returnObj;
	}
}
