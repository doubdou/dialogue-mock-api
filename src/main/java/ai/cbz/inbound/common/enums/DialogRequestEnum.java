package ai.cbz.inbound.common.enums;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 10:42
 */
public enum DialogRequestEnum {
    CC_DM_CHAT_CREATE (1000),
    CC_DM_CHAT_START(1001),
    CC_DM_CHAT_TIMEOUT(1002),
    CC_DM_CHAT_TEXT(1003),
    CC_DM_CHAT_DTMF(1004),
    CC_DM_CHAT_ACTION_SUCCESS(1005),
    CC_DM_CHAT_ACTION_FAILED(1006),
    CC_DM_CHAT_END(1007);

    private final int value;

    DialogRequestEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
