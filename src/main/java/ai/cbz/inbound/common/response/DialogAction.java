package ai.cbz.inbound.common.response;

import ai.cbz.inbound.common.enums.DialogActionTypeEnum;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 15:33
 */
public class DialogAction {
    DialogActionTypeEnum actionTypeEnum;
    DialogActionParams params;

    public DialogActionTypeEnum getAction(){
        return this.actionTypeEnum;
    }

    public void setAction(DialogActionTypeEnum actionTypeEnum) {
        this.actionTypeEnum = actionTypeEnum;
    }

    public DialogActionParams getParams() { return params; }

    public void setParams(DialogActionParams params) { this.params = params; }
}
