package cn.linghaiweiye.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Description :
 * <p/>
 * Created by Chris Kyle on 2016/4/7.
 */
public final class BeatPreference {

    public static final String SDK_PREFERENCE_DEFAULT_STRING = null;
    public static final int SDK_PREFERENCE_DEFAULT_INT = -10000;
    public static final long SDK_PREFERENCE_DEFAULT_LONG = 0L;
    public static final boolean SDK_PREFERENCE_DEFAULT_BOOL = false;
    public static final int[] SDK_PREFERENCE_DEFAULT_INT_ARRAY = new int[]{0};

    private static final String PREFERENCE_NAME = "cn.raise.app.raisepig";

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private volatile static BeatPreference mBeatPreference;

    public static BeatPreference getInstance(Context context) {
        if (mBeatPreference == null) {
            synchronized (BeatPreference.class) {
                if (mBeatPreference == null) {
                    mBeatPreference = new BeatPreference(context);
                }
            }
        }
        return mBeatPreference;
    }

    private BeatPreference(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }

    public BeatPreference put(String key, Object value) {
        if (value == null) {
            mEditor.putString(key, null);
        } else if (value instanceof Boolean) {
            mEditor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Integer || value instanceof Byte) {
            mEditor.putInt(key, (Integer) value);
        } else if (value instanceof Long) {
            mEditor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            mEditor.putFloat(key, (Float) value);
        } else if (value instanceof String) {
            mEditor.putString(key, (String) value);
        } else {
            mEditor.putString(key, value.toString());
        }
        return this;
    }

    public BeatPreference remove(String key) {
        mEditor.remove(key);
        return this;
    }

    public boolean getBoolean(String key, boolean defValue) {
        return mSharedPreferences.getBoolean(key, defValue);
    }

    public int getInt(String key, int defValue) {
        return mSharedPreferences.getInt(key, defValue);
    }

    public long getLong(String key, long defValue) {
        return mSharedPreferences.getLong(key, defValue);
    }

    public float getFloat(String key, float defValue) {
        return mSharedPreferences.getFloat(key, defValue);
    }

    public String getString(String key, String defValue) {
        return mSharedPreferences.getString(key, defValue);
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key, SDK_PREFERENCE_DEFAULT_STRING);
    }

    public boolean commit(String key, Object value) {
        return put(key, value).commit();
    }

    public boolean commit() {
        return mEditor.commit();
    }
}
