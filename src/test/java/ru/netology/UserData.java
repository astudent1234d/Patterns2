package ru.netology;

import lombok.Value;

@Value
public class UserData {
    private String login;
    private String password;
    private String status;
}

