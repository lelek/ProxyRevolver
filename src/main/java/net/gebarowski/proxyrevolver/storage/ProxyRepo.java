package net.gebarowski.proxyrevolver.storage;

import net.gebarowski.proxyrevolver.storage.data.Proxy;

import java.util.Collection;

/**
 * Created by Paweł Gębarowski on 2015-04-14.
 */
public interface ProxyRepo {

    Proxy getProxy();
    Collection<Proxy> getProxies();
}
