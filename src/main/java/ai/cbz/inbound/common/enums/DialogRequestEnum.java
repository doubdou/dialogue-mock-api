package ai.cbz.inbound.common.enums;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 10:42
 */
public enum DialogRequestEnum {
    AA_DM_CHAT_CREATE (10000),
    AA_DM_CHAT_START(10001),
    AA_DM_CHAT_TIMEOUT(10002),
    AA_DM_CHAT_TEXT(10003),
    AA_DM_CHAT_DTMF(10004),
    AA_DM_CHAT_ACTION_SUCCESS(10005),
    AA_DM_CHAT_ACTION_FAILED(10006),
    AA_DM_CHAT_END(10007);

    private final int value;

    DialogRequestEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
