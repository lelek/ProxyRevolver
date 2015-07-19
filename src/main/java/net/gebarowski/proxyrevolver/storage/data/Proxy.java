package net.gebarowski.proxyrevolver.storage.data;

/**
 * Created by Paweł Gębarowski on 2015-04-18.
 */
public class Proxy {
    public Proxy(String address, Integer port) {

        this.address = address;
        this.port = port;
    }


    public String getAddress() {
        return address;
    }

    public Integer getPort() { return port; }

    private String address;
    private Integer port;

}
