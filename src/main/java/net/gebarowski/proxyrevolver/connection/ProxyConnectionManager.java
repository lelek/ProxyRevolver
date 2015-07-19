package net.gebarowski.proxyrevolver.connection;

import net.gebarowski.proxyrevolver.storage.ProxyRepo;

/**
 * Created by Paweł Gębarowski on 2015-04-18.
 */
public interface ProxyConnectionManager {
    void init(ProxyRepo proxyRepo);
    void connect();

}
