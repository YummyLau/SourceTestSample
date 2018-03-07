package yummylau.sourcetest;

import android.view.MotionEvent;

/**
 * Created by yummylau on 2018/3/7.
 */

public class LogUtils {

    public static String getEventAtionStr(MotionEvent event) {
        String result = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                result = "MotionEvent.ACTION_DOWN";
                break;
            }

            case MotionEvent.ACTION_UP: {
                result = "MotionEvent.ACTION_UP";
                break;
            }

            case MotionEvent.ACTION_MOVE: {
                result = "MotionEvent.ACTION_MOVE";
                break;
            }

            case MotionEvent.ACTION_CANCEL: {
                result = "MotionEvent.ACTION_CANCEL";
                break;
            }
        }
        return result;
    }
}
