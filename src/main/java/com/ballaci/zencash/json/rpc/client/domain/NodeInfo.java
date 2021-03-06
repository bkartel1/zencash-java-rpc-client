package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Armand Ballaci
 */

public class NodeInfo implements Serializable {

    // total bytes recieved
    @JsonProperty
    private String addednode;

    // total bytes sent
    @JsonProperty
    private String connected;

    // time in miliseconds
    @JsonProperty
    private NodeAddress[] addresses;

    public NodeInfo(@JsonProperty("addednode") String addednode,
                    @JsonProperty("connected") String connected,
                    @JsonProperty("addresses") NodeAddress[] addresses) {
        this.addednode = addednode;
        this.connected = connected;
        this.addresses = addresses;
    }

    public String getAddednode() {
        return addednode;
    }

    public void setAddednode(String addednode) {
        this.addednode = addednode;
    }

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    public NodeAddress[] getAddresses() {
        return addresses;
    }

    public void setAddresses(NodeAddress[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "NodeInfo{" +
                "addednode='" + addednode + '\'' +
                ", connected='" + connected + '\'' +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}
