package by.fluvirus.lab3.server.service;

import by.fluvirus.lab3.server.model.Rights;

public interface AuthService {
    Rights getRights(Object user);
    void setRights(Object user, Rights rights);
}
