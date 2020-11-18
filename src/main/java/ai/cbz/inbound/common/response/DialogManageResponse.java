package ai.cbz.inbound.common.response;


/**
 * @Author: Jinzw
 * @Date: 2020/11/5 11:04
 */
public class DialogManageResponse {
    private int status;
    private String respTime;
    private String msg;
    private DialogData dialogData;

    public int getStatus(){
        return status;
    }

    public void setStatus(int status) { this.status = status; }

    public String getRespTime(){
        return respTime;
    }

    public void setRespTime(String respTime) { this.respTime = respTime; }

    public String getMsg(){ return msg; }

    public void setMsg(String msg) { this.msg = msg; }

    public DialogData getData(){ return dialogData; }

    public void setDialogData(DialogData dialogData) { this.dialogData = dialogData; }
}
