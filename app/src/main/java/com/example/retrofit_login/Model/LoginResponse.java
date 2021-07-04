package com.example.retrofit_login.Model;

public class LoginResponse {
    public boolean Success;
    public String Message;
    public String Tag;
    public long ServerRecordId;
    public Object RecordId;
    public int TotalRecord;
    public int PageNo;
    public int PageSize;
    public ApiPacket ApiPacket;
    public int Status;

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public long getServerRecordId() {
        return ServerRecordId;
    }

    public void setServerRecordId(long serverRecordId) {
        ServerRecordId = serverRecordId;
    }

    public Object getRecordId() {
        return RecordId;
    }

    public void setRecordId(Object recordId) {
        RecordId = recordId;
    }

    public int getTotalRecord() {
        return TotalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        TotalRecord = totalRecord;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public com.example.retrofit_login.Model.ApiPacket getApiPacket() {
        return ApiPacket;
    }

    public void setApiPacket(com.example.retrofit_login.Model.ApiPacket apiPacket) {
        ApiPacket = apiPacket;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public LoginResponse(boolean success, String message, String tag, long serverRecordId, Object recordId, int totalRecord, int pageNo, int pageSize, com.example.retrofit_login.Model.ApiPacket apiPacket, int status) {
        Success = success;
        Message = message;
        Tag = tag;
        ServerRecordId = serverRecordId;
        RecordId = recordId;
        TotalRecord = totalRecord;
        PageNo = pageNo;
        PageSize = pageSize;
        ApiPacket = apiPacket;
        Status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "Success=" + Success +
                ", Message='" + Message + '\'' +
                ", Tag='" + Tag + '\'' +
                ", ServerRecordId=" + ServerRecordId +
                ", RecordId=" + RecordId +
                ", TotalRecord=" + TotalRecord +
                ", PageNo=" + PageNo +
                ", PageSize=" + PageSize +
                ", ApiPacket=" + ApiPacket +
                ", Status=" + Status +
                '}';
    }
}
