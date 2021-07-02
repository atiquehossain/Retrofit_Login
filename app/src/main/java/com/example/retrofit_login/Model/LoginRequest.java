package com.example.retrofit_login.Model;

public class LoginRequest {
    String DeviceUniqueId;
    String Password;
    String UserName;


    public LoginRequest(String deviceUniqueId, String password, String userName) {
        DeviceUniqueId = deviceUniqueId;
        Password = password;
        UserName = userName;
    }
}
