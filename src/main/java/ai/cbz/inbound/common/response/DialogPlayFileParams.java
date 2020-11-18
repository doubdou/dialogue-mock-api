package ai.cbz.inbound.common.response;

/**
 * @Author: Jinzw
 * @Date: 2020/11/8 11:30
 */
public class DialogPlayFileParams extends DialogActionParams{
    String path;
    int supportBreak;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSupportBreak() {
        return supportBreak;
    }

    public void setSupportBreak(int supportBreak) {
        this.supportBreak = supportBreak;
    }
}
