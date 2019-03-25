package com.zj.dialog.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.zj.dialog.QKDialog;
import com.zj.dialog.QKLoadDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                showButtonStyle1();
                break;
            case R.id.button2:
                showButtonStyle2();
                break;
            case R.id.button3:
                showButtonStyle3();
                break;
            case R.id.button4:
                showButtonStyle4();
                break;
            case R.id.button5:
                showButtonStyle5();
                break;
            case R.id.button6:
                showButtonStyle6();
                break;
            case R.id.button7:
                showButtonStyle7();
                break;
            case R.id.button8:
                showButtonStyle8();
                break;
        }

    }

    private void showButtonStyle1() {
//        QKDialog newFragment = QKDialog.newInstance();
//        newFragment.show(getSupportFragmentManager(), "dialog");


        new QKDialog(MainActivity.this).builder()
                .setMsg("两个button")
                .setPositiveButton(null, new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                    }
                })
                .setNegativeButton(null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }

    /**
     * 带标题
     */
    private void showButtonStyle2() {
        new QKDialog(MainActivity.this).builder()
                .setTitle("标题")
                .setMsg("两个button")
                .setPositiveButton(null, new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                    }
                })
                .setNegativeButton(null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }

    /**
     * 一个button
     */
    private void showButtonStyle3() {
        new QKDialog(MainActivity.this).builder()
                .setMsg("确定button")
                .setPositiveButton(null, new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }

    private void showButtonStyle4() {
        new QKDialog(MainActivity.this).builder()
                .setTitle("标题")
                .setMsg("取消button")
                .setNegativeButton(null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }

    private void showButtonStyle5() {
        new QKDialog(MainActivity.this).builder()
                .setTitle("标题")
                .setMsg("取消button")
                .setCancelable(false)
                .setNegativeButton(null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }

    private void showButtonStyle6() {
        new QKLoadDialog(MainActivity.this).builder().setTips("加载中...").show();
    }

    private void showButtonStyle8() {
        new QKLoadDialog(MainActivity.this).builder()
                .setTips("上传中...")
                .setTipsTextSize(R.dimen.content_text_size_18)
                .setTipsTextColor(R.color.yellow)
                .setBarColor(R.color.green)
                .setBarWidth(10)
                .show();
    }

    private void showButtonStyle7() {
        new QKDialog(MainActivity.this).builder()
                .setTitle("标题")
                .setTitleColor(R.color.colorPrimary)
                .setTitleSize(R.dimen.content_text_size_18)
                .setMsg("自定义文字颜色大小")
                .setMsgSize(R.dimen.content_text_size_16)
                .setMsgColor(R.color.actionsheet_blue)
                .setPositiveButtonColor(R.color.black)
                .setPositiveButtonSize(R.dimen.content_text_size_12)
                .setPositiveButton(null, new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                    }
                })
                .setNegativeButtonSize(R.dimen.content_text_size_12)
                .setNegativeButtonColor(R.color.yellow)
                .setNegativeButton(null, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }
}
