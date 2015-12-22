package animation;

import android.content.Context;

import com.nancymi.twandroid.MainActivity;

/**
 * Created by nancymi on 12/22/15.
 */
public class BgActionImpl implements BgAction {

    private static final long INIT_BG_COLOR = 0x03A9F4; //Light Blue

    private final Context context;

    public BgActionImpl(Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        //TODO 初始化数据存储到 pref 中，初始化 View
    }

    @Override
    public void draw(long endRgb) {

    }
}
