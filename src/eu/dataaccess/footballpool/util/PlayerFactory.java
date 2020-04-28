package eu.dataaccess.footballpool.util;

import eu.dataaccess.footballpool.InfoSoapTypeProxy;

public class PlayerFactory {
	public static InfoSoapTypeProxy getInstance() {
		return new InfoSoapTypeProxy();
	}
}
