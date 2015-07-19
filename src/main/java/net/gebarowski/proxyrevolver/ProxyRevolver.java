package net.gebarowski.proxyrevolver;

import net.gebarowski.proxyrevolver.connection.ProxyConnectionManager;
import net.gebarowski.proxyrevolver.connection.StaticProxyConnector;
import net.gebarowski.proxyrevolver.storage.SimpleProxyRepoCreator;
import net.gebarowski.proxyrevolver.storage.ProxyRepoCreator;
import net.gebarowski.proxyrevolver.storage.ProxyRepo;

/**
 * Created by Paweł Gębarowski on 2015-04-13.
 */
public class ProxyRevolver {

    public static void main(String str[]) {
        ProxyRepoCreator proxyRepoCreator = new SimpleProxyRepoCreator();
        ProxyRepo proxyRepoStorage = proxyRepoCreator.createProxyRepo();
        ProxyConnectionManager proxyConnectionManager = new StaticProxyConnector(proxyRepoStorage);
        proxyConnectionManager.connect();
    }
}


