package ai.cbz.inbound.common.response;

/**
 * @Author: Jinzw
 * @Date: 2020/11/8 11:21
 */
public class DialogPlayTTSParams extends DialogActionParams {
    String text;
    String voice;
//判断是否打断，合成和放音必选
    int supportBreak;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSupportBreak() {
        return supportBreak;
    }

    public void setSupportBreak(int supportBreak) {
        this.supportBreak = supportBreak;
    }
}
