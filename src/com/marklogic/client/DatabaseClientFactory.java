package com.marklogic.client;

import javax.net.ssl.SSLContext;

public class DatabaseClientFactory {
	public enum Authentication {
	    BASIC, DIGEST, NONE;
	}

	protected DatabaseClientFactory() {
	}

	static public DatabaseClientFactory newInstance() {
		return null; // TODO
	}

	public DatabaseClient connect(String host, int port, String user, String password, Authentication type) {
		return null; // TODO
	}
	public DatabaseClient connect(String host, int port, String user, String password, SSLContext context) {
		return null; // TODO
	}
}
