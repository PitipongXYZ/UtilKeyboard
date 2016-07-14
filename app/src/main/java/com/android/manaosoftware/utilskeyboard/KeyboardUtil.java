package com.android.manaosoftware.utilskeyboard;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by pw on 14/7/2559.
 */
public class KeyboardUtil{

    private KeyboardUtil() {
        super();
    }

    public static void closeKeybord(View myView, Context mContext) {
        InputMethodManager inputMethodManager = getInputMethodManager(mContext);
        inputMethodManager.hideSoftInputFromWindow(myView.getWindowToken(), 0);
    }

    public static void openKeybord(View myView, Context mContext) {
        InputMethodManager inputMethodManager = getInputMethodManager(mContext);
        inputMethodManager.showSoftInput(myView, InputMethodManager.RESULT_SHOWN);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,
                InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    protected static InputMethodManager getInputMethodManager(Context mContext) {
        return (InputMethodManager) mContext
                .getSystemService(Context.INPUT_METHOD_SERVICE);
    }
}
