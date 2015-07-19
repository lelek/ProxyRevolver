package net.gebarowski.proxyrevolver.storage;

import net.gebarowski.proxyrevolver.storage.data.Proxy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Paweł Gębarowski on 2015-04-18.
 */
public class SimpleProxyRepo implements ProxyRepo {

    private List<Proxy> proxies = new ArrayList<>();

    @Override
    public Proxy getProxy() {
        return  proxies.get(0);
    }

    @Override
    public Collection<Proxy> getProxies() {
        return proxies;
    }
}
