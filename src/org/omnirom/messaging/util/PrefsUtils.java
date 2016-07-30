package org.omnirom.messaging.util;

import com.android.messaging.Factory;
import com.android.messaging.R;
import com.android.messaging.util.BuglePrefs;

import android.content.Context;

public class PrefsUtils {

    public static final String SHOW_EMOTICONS_ENABLED    = "pref_show_emoticons";

    public static boolean isShowEmoticonsEnabled() {
        final BuglePrefs prefs = BuglePrefs.getApplicationPrefs();
        final Context context = Factory.get().getApplicationContext();
        final boolean defaultValue = context.getResources().getBoolean(
                R.bool.show_emoticons_pref_default);
        return prefs.getBoolean(SHOW_EMOTICONS_ENABLED, defaultValue);
    }
}
