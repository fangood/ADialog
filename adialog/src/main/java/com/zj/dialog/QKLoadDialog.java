package com.zj.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.zj.dialog.view.ProgressWheel;


/**
 * 加载Dialog
 */
public class QKLoadDialog {

    private Context mContext;
    private boolean showTitle;
    /**
     * LoadDialog
     */
    private Dialog dialog;
    /**
     * canNotCancel, the mDialogTextView dimiss or undimiss flag
     */
    private boolean canNotCancel;
    /**
     * if the mDialogTextView don't dimiss, what is the tips.
     */
    private String tipMsg;

    private TextView mShowMessage;
    //进度条
    private ProgressWheel progress_wheel;

    public QKLoadDialog(Context ctx, boolean canNotCancel, String tipMsg) {
        this.mContext = ctx;
        this.canNotCancel = canNotCancel;
        this.tipMsg = tipMsg;
    }

    public QKLoadDialog(Context ctx) {
        this.mContext = ctx;
    }

    public QKLoadDialog builder() {
        // 获取Dialog布局
        View view = LayoutInflater.from(mContext).inflate(
                R.layout.layout_dialog_loading, null);

        progress_wheel = view.findViewById(R.id.progress_wheel);
        mShowMessage = view.findViewById(R.id.show_message);

        // 定义Dialog布局和参数
        dialog = new Dialog(mContext, android.R.style.Theme_InputMethod);
        dialog.setContentView(view);
        dialog.setCanceledOnTouchOutside(false);

        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributesParams = window.getAttributes();
        attributesParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        attributesParams.dimAmount = 0.5f;
        window.setAttributes(attributesParams);

        window.setLayout(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        return this;
    }

    public QKLoadDialog setCancelable(boolean cancel) {
        dialog.setCancelable(cancel);
        return this;
    }

    public QKLoadDialog setCanceledOnTouchOutside(boolean cancel) {
        dialog.setCanceledOnTouchOutside(cancel);
        return this;
    }

    public QKLoadDialog setTips(String title) {
        showTitle = true;
        if (TextUtils.isEmpty(title)) {
            mShowMessage.setText("加载中");
        } else {
            mShowMessage.setText(title);
        }
        return this;
    }

    public QKLoadDialog setTipsTextSize(int titleSize) {
        setTextSize(mContext, titleSize, mShowMessage);
        return this;
    }

    public QKLoadDialog setTipsTextColor(int color) {
        mShowMessage.setTextColor(getColor(mContext, color));
        return this;
    }

    public QKLoadDialog setBarColor(int color) {
        progress_wheel.setBarColor(color);
        return this;
    }

    public QKLoadDialog setBarWidth(int width) {
        progress_wheel.setBarWidth(width);
        return this;
    }

    public void show() {
        setLayout();
        if (!dialog.isShowing()) {
            dialog.show();
        }
    }

    private void setLayout() {
        if (showTitle) {
            mShowMessage.setVisibility(View.VISIBLE);
        }
    }

    public void dismiss() {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private int getColor(Context context, int id) {
        final int version = Build.VERSION.SDK_INT;
        if (version >= 23) {
            return ContextCompat.getColor(context, id);
        } else {
            return context.getResources().getColor(id);
        }
    }

    private void setTextSize(Context context, int size, TextView textView) {
        int dimen = context.getResources().getDimensionPixelSize(size);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, dimen);
    }
}
