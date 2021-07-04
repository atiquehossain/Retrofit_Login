package com.example.retrofit_login.Model;

public class ApiPacket {
    Packet packet;

    public ApiPacket(Packet packet) {
        this.packet = packet;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    @Override
    public String toString() {
        return "ApiPacket{" +
                "packet=" + packet +
                '}';
    }
}
