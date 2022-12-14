package by.fluvirus.lab3.client;

import by.fluvirus.lab3.client.controller.ClientController;

public class Client {
    public static void main(String[] args) {
        var client = new ClientController();
        client.start();
    }
}
