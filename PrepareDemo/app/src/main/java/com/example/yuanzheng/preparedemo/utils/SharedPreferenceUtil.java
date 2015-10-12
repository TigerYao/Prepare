package com.example.yuanzheng.preparedemo.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;

/**
 * Created by yee on 8/5/14.
 *
 * @author yee
 */
@SuppressWarnings("unused")
public class SharedPreferenceUtil {

    private static final String FILE_NAME = "liangrenwang";

    public static void putString(Context mContext, String key, String value) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        apply(editor);
    }

    public static String getString(Context mContext, String key, String defaultValue) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void putInt(Context mContext, String key, int value) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        apply(editor);
    }

    public static int getInt(Context mContext, String key, int defaultValue) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, defaultValue);
    }

    public static void putLong(Context mContext, String key, long value) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        apply(editor);
    }

    public static long getLong(Context mContext, String key, long defaultValue) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, defaultValue);
    }

    public static void putBoolean(Context mContext, String key, boolean value) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        apply(editor);
    }

    public static boolean getBoolean(Context mContext, String key, boolean defaultValue) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public static void putFloat(Context mContext, String key, float value) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(key, value);
        apply(editor);
    }

    public static float getFloat(Context mContext, String key, float defaultValue) {
        if (null == mContext || TextUtils.isEmpty(key)) {
            return defaultValue;
        }
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(key, defaultValue);
    }

//    public static void putStringSet(Context mContext, String key, Set<String> value) {
//        if (null == mContext || TextUtils.isEmpty(key)) {
//            return;
//        }
//        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putStringSet(key, value);
//        apply(editor);
//    }
//
//    public static Set<String> getStringSet(Context mContext, String key, Set<String> defaultValue) {
//        if (null == mContext || TextUtils.isEmpty(key)) {
//            return defaultValue;
//        }
//        SharedPreferences sharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
//        return sharedPreferences.getStringSet(key, defaultValue);
//    }

    /**
     * use new api to reduce file operate
     *
     * @param editor editor
     */
    public static void apply(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            editor.apply();
        } else {
            editor.commit();
        }
    }
}
