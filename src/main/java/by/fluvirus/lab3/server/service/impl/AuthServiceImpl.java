package by.fluvirus.lab3.server.service.impl;

import by.fluvirus.lab3.server.model.Rights;
import by.fluvirus.lab3.server.service.AuthService;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private final Map<Object, Rights> users = new HashMap<>();

    @Override
    public Rights getRights(Object user) {
        if (!users.containsKey(user)) {
            users.put(user, Rights.UNAUTH);
        }
        return users.get(user);
    }

    @Override
    public void setRights(Object user, Rights rights) {
        users.put(user, rights);
    }
}
