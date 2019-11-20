package com.t.mylibrary;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * @author huangyi
 * 时间：   2019/00/00
 * 描述：   工具类
 */
public class ToastUtils {

    public static void showToast(Context context, String message){
        Toast toast = Toast.makeText(context,message,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

}
