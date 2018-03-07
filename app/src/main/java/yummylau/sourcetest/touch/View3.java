package yummylau.sourcetest.touch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import yummylau.sourcetest.LogUtils;

/**
 * Created by yummylau on 2018/3/7.
 */

public class View3 extends View {

    private static final String TAG = View3.class.getSimpleName();

    public View3(Context context) {
        super(context);
    }

    public View3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public View3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean result = super.dispatchTouchEvent(event);
        Log.d(TAG, "#dispatchTouchEvent " + LogUtils.getEventAtionStr(event) + ": " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = false;
        Log.d(TAG, "#onTouchEvent " + LogUtils.getEventAtionStr(event) + ": " + result);
        return result;
    }
}
