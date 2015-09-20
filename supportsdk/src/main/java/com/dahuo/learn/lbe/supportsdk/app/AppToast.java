package com.dahuo.learn.lbe.supportsdk.app;

import android.content.Context;
import android.view.Gravity;

import com.github.johnpersano.supertoasts.SuperToast;

/**
 * @author YanLu
 * @since 15/9/20
 */
public class AppToast {

    public static void show(Context context, int rid) {
        show(context, context.getString(rid));
    }

    public static void show(Context context, String msg) {
        SuperToast.create(context, msg, SuperToast.Duration.LONG, SuperToast.Animations.POPUP).show();
    }
    public static void showCenter(Context context, String msg) {
        SuperToast toast = SuperToast.create(context, msg, SuperToast.Duration.LONG, SuperToast.Animations.POPUP);

        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}