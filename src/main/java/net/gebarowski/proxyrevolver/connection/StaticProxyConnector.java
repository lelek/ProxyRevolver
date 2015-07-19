package net.gebarowski.proxyrevolver.connection;

import net.gebarowski.proxyrevolver.storage.ProxyRepo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Paweł Gębarowski on 2015-04-18.
 */
public class StaticProxyConnector implements ProxyConnectionManager {

    ProxyRepo proxyRepo;

    public StaticProxyConnector(ProxyRepo proxyRepo) {
        this.proxyRepo = proxyRepo;
    }

    @Override
    public void init(ProxyRepo proxyRepo) {
        this.proxyRepo = proxyRepo;
    }

    @Override
    public void connect() {

        net.gebarowski.proxyrevolver.storage.data.Proxy proxy = this.proxyRepo.getProxy();

        Proxy prox = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy.getAddress(), proxy.getPort()));
        try {
            URLConnection urlConnection = new URL("http://onet.pl").openConnection(prox);
            System.out.println("dupas");
            InputStream inputStream = urlConnection.getInputStream();

//            In this case you'll need the following code:
//
//                Authenticator authenticator = new Authenticator() {
//
//                    public PasswordAuthentication getPasswordAuthentication() {
//                        return (new PasswordAuthentication("user",
//                                "password".toCharArray()));
//                    }
//                };
//                Authenticator.setDefault(authenticator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

