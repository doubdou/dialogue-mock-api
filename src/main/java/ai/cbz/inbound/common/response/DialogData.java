package ai.cbz.inbound.common.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 11:06
 */
public class DialogData {
    List<DialogAction> actions;

    public  DialogData(){ actions = new ArrayList<>(); }

    public void setActions(List<DialogAction> actions) { this.actions = actions; }

    public List<DialogAction> getActions(){ return this.actions; }

    public void addAction(DialogAction action){ actions.add(action); }
}
