package com.testaar.kakaxilibrary.utils;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by Administrator on 2017/9/9.
 */

public class ToastUtils {

    private static Toast toast;

    /**
     * show
     * @param context show
     * @param message menssage tip
     */
    public  static  void showToast( Context context,String message){
        if(toast==null){// 不用getApplicationContext的话,导致内存泄露
            toast= Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.show();
        }else {
            toast.setText(message);
            toast.show();
        }

    }

}
