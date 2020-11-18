package ai.cbz.inbound.common.enums;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 15:26
 */
public enum DialogActionTypeEnum {
    DM_CC_CHAT_REFUSE(2000),
    DM_CC_CHAT_CREATE_COMPLETE(2001),
    DM_CC_CHAT_PLAY_FILE (2002),
    DM_CC_CHAT_PLAY_TTS (2003),
    DM_CC_CHAT_TRANSFER (2004),
    DM_CC_CHAT_PAUSE_PLAY (2005),
    DM_CC_CHAT_DETECT_SPEECH(2006),
    DM_CC_CHAT_GET_DTMF(2007),
    DM_CC_CHAT_END(2008),
    DM_CC_CHAT_NONE(2009);

    private final int type;

    DialogActionTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
