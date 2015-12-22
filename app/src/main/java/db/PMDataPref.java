package db;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by nancymi on 12/22/15.
 */
public class PMDataPref {

    private static final String PM_PREF_NAME = "pm_pref";

    private static final String PM_AREA = "pm_area";

    private static final String PM_DIAL = "pm_dial";

    private static final String PM_BG_COLOR = "pm_bg_color";

    private final SharedPreferences pmDataPref;
    private final SharedPreferences.Editor editor;

    public PMDataPref(Context context) {
        pmDataPref = context.getSharedPreferences(PM_PREF_NAME, Context.MODE_PRIVATE);
        editor = pmDataPref.edit();
    }

    public void setPmDial(int pmDial) {
        editor.putInt(PM_DIAL, pmDial);
    }

    public int getPmDial() {
        int pmDial = pmDataPref.getInt(PM_DIAL, -1);
        return pmDial;
    }

    public void setPmBgColor(long pmBgColor) {
        editor.putLong(PM_BG_COLOR, pmBgColor);
    }

    public long getPmBgColor() {
        long pmBgColor = pmDataPref.getLong(PM_BG_COLOR, -1);
        return pmBgColor;
    }

    public void setArea(String area) {
        editor.putString(PM_AREA, area);
        editor.commit();
    }

    public String getArea() {
        String area = pmDataPref.getString(PM_AREA, "");
        return area;
    }
}
