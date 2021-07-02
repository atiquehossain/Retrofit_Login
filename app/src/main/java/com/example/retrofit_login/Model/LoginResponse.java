package com.example.retrofit_login.Model;

public class LoginResponse {
    public String Command;
    public String User;
    public String Success;
    public String Message;
    public String ServerRecordId;
    public String RecordId;
    public String TotalRecord;
    public String PageNo;
    public String PageSize;
    public String Status;
    public ApiPacket apiPacket;

    public LoginResponse(String command, String user, String success, String message, String serverRecordId, String recordId, String totalRecord, String pageNo, String pageSize, String status, ApiPacket apiPacket) {
        Command = command;
        User = user;
        Success = success;
        Message = message;
        ServerRecordId = serverRecordId;
        RecordId = recordId;
        TotalRecord = totalRecord;
        PageNo = pageNo;
        PageSize = pageSize;
        Status = status;
        this.apiPacket = apiPacket;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String command) {
        Command = command;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getSuccess() {
        return Success;
    }

    public void setSuccess(String success) {
        Success = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getServerRecordId() {
        return ServerRecordId;
    }

    public void setServerRecordId(String serverRecordId) {
        ServerRecordId = serverRecordId;
    }

    public String getRecordId() {
        return RecordId;
    }

    public void setRecordId(String recordId) {
        RecordId = recordId;
    }

    public String getTotalRecord() {
        return TotalRecord;
    }

    public void setTotalRecord(String totalRecord) {
        TotalRecord = totalRecord;
    }

    public String getPageNo() {
        return PageNo;
    }

    public void setPageNo(String pageNo) {
        PageNo = pageNo;
    }

    public String getPageSize() {
        return PageSize;
    }

    public void setPageSize(String pageSize) {
        PageSize = pageSize;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public ApiPacket getApiPacket() {
        return apiPacket;
    }

    public void setApiPacket(ApiPacket apiPacket) {
        this.apiPacket = apiPacket;
    }
}
