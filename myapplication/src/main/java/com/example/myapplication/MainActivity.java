package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局文件
        setContentView(R.layout.activity_main);
        //上面加载了布局文件，接下来要查找布局文件中的WebView
        this.findViewById(R.id.webview);
        int num = (int)34.56;
        WebView webView = (WebView)this.findViewById(R.id.webview);
        //在Android中所有的可视化组件都是View的子类
        webView.loadUrl("http://www.163.com");//最后加载移动互联网资源

    }
}
