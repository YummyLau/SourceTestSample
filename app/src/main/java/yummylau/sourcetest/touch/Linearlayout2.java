package yummylau.sourcetest.touch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import yummylau.sourcetest.LogUtils;

/**
 * Created by yummylau on 2018/3/7.
 */

public class Linearlayout2 extends LinearLayout {

    private static final String TAG = Linearlayout2.class.getSimpleName();

    public Linearlayout2(Context context) {
        super(context);
    }

    public Linearlayout2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Linearlayout2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean result = super.dispatchTouchEvent(ev);
        Log.d(TAG, "#dispatchTouchEvent " + LogUtils.getEventAtionStr(ev) + ": " + result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = super.onInterceptTouchEvent(ev);
        Log.d(TAG, "#onInterceptTouchEvent " + LogUtils.getEventAtionStr(ev) + ": " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = true;
        Log.d(TAG, "#onTouchEvent " + LogUtils.getEventAtionStr(event) + ": " + result);
        return result;
    }
}
