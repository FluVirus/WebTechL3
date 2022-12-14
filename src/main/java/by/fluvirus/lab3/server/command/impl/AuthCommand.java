package by.fluvirus.lab3.server.command.impl;

import by.fluvirus.lab3.server.command.Command;
import by.fluvirus.lab3.server.model.Rights;
import by.fluvirus.lab3.server.service.ServiceFactory;

public class AuthCommand implements Command {
    @Override
    public String execute(Object caller, String request) {
        var arguments = request.split(" ");
        if (arguments.length != 2) throw new IllegalArgumentException("AUTH command should contain 1 argument");
        Rights rights;
        try {
            rights = Rights.valueOf(arguments[1]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("No such auth type");
        }

        ServiceFactory.getInstance().getAuthService().setRights(caller, rights);
        return "Success.";
    }
}
