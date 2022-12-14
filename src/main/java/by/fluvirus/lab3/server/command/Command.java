package by.fluvirus.lab3.server.command;

public interface Command {
    String execute(Object caller, String request);
}
