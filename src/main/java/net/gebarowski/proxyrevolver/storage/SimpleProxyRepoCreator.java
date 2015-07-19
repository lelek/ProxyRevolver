package net.gebarowski.proxyrevolver.storage;

import net.gebarowski.proxyrevolver.storage.data.Proxy;

/**
 * Created by Paweł Gębarowski on 2015-04-14.
 */
public class SimpleProxyRepoCreator implements ProxyRepoCreator {
    @Override
     public ProxyRepo createProxyRepo() {

    SimpleProxyRepo simpleProxyRepo = new SimpleProxyRepo();
    simpleProxyRepo.getProxies().add(new Proxy("127.0.0.1", 8008));
    return simpleProxyRepo;
}
}
