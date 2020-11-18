package ai.cbz.inbound.common.api;

import ai.cbz.inbound.common.request.DialogManageRequest;
import ai.cbz.inbound.common.response.DialogManageResponse;

/**
 * @Author: Jinzw
 * @Date: 2020/11/16 14:59
 */
public interface IDialogService {
    String greeting(String name);
    DialogManageResponse dialogManage(DialogManageRequest request);
}
