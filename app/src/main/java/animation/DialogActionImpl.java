package animation;

import android.content.Context;

/**
 * Created by nancymi on 12/22/15.
 */
public class DialogActionImpl implements DialogAction {

    private final Context context;

    public DialogActionImpl(Context context) {
        this.context = context;
    }

    @Override
    public void show() {
        //TODO 显示 dialog
    }

    @Override
    public void cancel() {
        //TODO 取消 dialog
    }
}
