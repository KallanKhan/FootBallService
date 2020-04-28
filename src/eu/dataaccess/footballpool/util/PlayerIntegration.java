package eu.dataaccess.footballpool.util;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import eu.dataaccess.footballpool.InfoSoapTypeProxy;
import eu.dataaccess.footballpool.TPlayerName;

public class PlayerIntegration {
	public static List<TPlayerName> getTPlayerName()  {
		// TODO Auto-generated method stub
		List<TPlayerName> lPlayerNames=null;
		InfoSoapTypeProxy infoSoapTypeProxy = PlayerFactory.getInstance();
		infoSoapTypeProxy.setEndpoint("https://footballpool.dataaccess.eu/info.wso");
		try {
			lPlayerNames = Arrays.asList( infoSoapTypeProxy.allPlayerNames(true));
		} catch (RemoteException e) {
			throw new RuntimeException(e.getMessage());
		}
		return lPlayerNames;
	}

}
