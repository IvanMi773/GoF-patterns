package com.company.behavioral_patterns.template_method;

public abstract class Network {

    protected String username;
    protected String password;

    public Network() {
    }

    public boolean post (String message) {
        if (login(this.username, this.password)) {
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }

        return false;
    }

    abstract boolean login(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logout();
}
