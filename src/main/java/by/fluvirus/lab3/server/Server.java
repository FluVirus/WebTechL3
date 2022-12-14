package by.fluvirus.lab3.server;

import by.fluvirus.lab3.server.controller.ServerController;

public class Server {
    public static void main(String[] args) {
        var server = new ServerController();
        server.start();
    }
}
