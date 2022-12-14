package by.fluvirus.lab3.server.command.impl;

import by.fluvirus.lab3.server.command.Command;
import by.fluvirus.lab3.server.model.Rights;
import by.fluvirus.lab3.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    @Override
    public String execute(Object caller, String request) {
        ServiceFactory.getInstance().getAuthService().setRights(caller, Rights.UNAUTH);
        return "Disconnected!";
    }
}
