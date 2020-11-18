package ai.cbz.inbound.common.request;

import ai.cbz.inbound.common.enums.DialogRequestEnum;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 11:04
 */
public class DialogManageRequest {
    private String callId;
    private String caller;
    private String callee;
    private String text;
    private DialogRequestEnum reqType;

    public void setChatId(String callId){
        this.callId = callId;
    }

    public String getCallId() { return callId; }

    public void setClientId(String caller){
        this.caller = caller;
    }

    public String getCaller() { return caller; }

    public void setCallee(String callee){
        this.callee = callee;
    }

    public String getCallee() { return callee; }

    public void setReqType(DialogRequestEnum reqType){
        this.reqType = reqType;
    }

    public DialogRequestEnum getReqType() { return reqType; }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() { return text; }
}
