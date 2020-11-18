package ai.cbz.inbound.common.response;

/**
 * @Author: Jinzw
 * @Date: 2020/11/8 11:42
 */
public class DialogDetectSpeechParams extends DialogActionParams{
    int asrModeID;


    public int getAsrModeID() {
        return asrModeID;
    }

    public void setAsrModeID(int asrModeID) {
        this.asrModeID = asrModeID;
    }
}
