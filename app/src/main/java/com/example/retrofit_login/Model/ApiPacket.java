package com.example.retrofit_login.Model;

import java.util.List;

public class ApiPacket<T> {
    private T Packet;
    private List<T> PacketList;

    public T getPacket() {
        return Packet;
    }

    public void setPacket(T packet) {
        Packet = packet;
    }

    public List<T> getPacketList() {
        return PacketList;
    }

    public void setPacketList(List<T> packetList) {
        PacketList = packetList;
    }

    @Override
    public String toString() {
        return "ApiPacket{" +
                "Packet=" + Packet +
                ", PacketList=" + PacketList +
                '}';
    }
}

