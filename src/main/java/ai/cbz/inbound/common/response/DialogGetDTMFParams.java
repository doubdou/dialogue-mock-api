package ai.cbz.inbound.common.response;

/**
 * @Author: Jinzw
 * @Date: 2020/11/8 12:04
 */
public class DialogGetDTMFParams extends DialogActionParams{
    String endTag;
    int length;

    @Override
    public int getTimeout() {
        return super.getTimeout();
    }

    @Override
    public void setTimeout(int timeout) {
        super.setTimeout(timeout);
    }

    public String getEndTag() {
        return endTag;
    }

    public void setEndTag(String endTag) {
        this.endTag = endTag;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
