package com.example.retrofit_login.Model;

public class Packet {

    public int UserID;
    public String Email;
    public String UserName; //Username in actual RF login
    public String GeoType;
    public String Token;
    public String Password;
    public String FullName;
    public String Designation;
    public String Organization;
    public String StaffID;
    public String PhoneNumber;
    public String CreateDate;
    public String EditDate;
    public String DeviceId;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getGeoType() {
        return GeoType;
    }

    public void setGeoType(String geoType) {
        GeoType = geoType;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getEditDate() {
        return EditDate;
    }

    public void setEditDate(String editDate) {
        EditDate = editDate;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public Packet(int userID, String email, String userName, String geoType, String token, String password, String fullName, String designation, String organization, String staffID, String phoneNumber, String createDate, String editDate, String deviceId) {
        UserID = userID;
        Email = email;
        UserName = userName;
        GeoType = geoType;
        Token = token;
        Password = password;
        FullName = fullName;
        Designation = designation;
        Organization = organization;
        StaffID = staffID;
        PhoneNumber = phoneNumber;
        CreateDate = createDate;
        EditDate = editDate;
        DeviceId = deviceId;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "UserID=" + UserID +
                ", Email='" + Email + '\'' +
                ", UserName='" + UserName + '\'' +
                ", GeoType='" + GeoType + '\'' +
                ", Token='" + Token + '\'' +
                ", Password='" + Password + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Designation='" + Designation + '\'' +
                ", Organization='" + Organization + '\'' +
                ", StaffID='" + StaffID + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", CreateDate='" + CreateDate + '\'' +
                ", EditDate='" + EditDate + '\'' +
                ", DeviceId='" + DeviceId + '\'' +
                '}';
    }
}
