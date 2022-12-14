package by.fluvirus.lab3.server.command.impl;

import by.fluvirus.lab3.server.command.Command;
import by.fluvirus.lab3.server.model.Rights;
import by.fluvirus.lab3.server.service.ServiceFactory;

public class CreateCommand implements Command {
    @Override
    public String execute(Object caller, String request) {
        var arguments = request.split(" ");
        if (arguments.length != 3) throw new IllegalArgumentException("CREATE invalid syntax");

        if (ServiceFactory.getInstance().getAuthService().getRights(caller) != Rights.ADMIN)
            return "Should be ADMIN.";

        ServiceFactory.getInstance().getStudentFileServiceInstance().addFile(arguments[1], arguments[2]);
        return "Success.";
    }
}
