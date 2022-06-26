package net.incmplt.geminipdajpkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //レイアウトで指定したWebViewのIDを指定する。
        WebView  myWebView = (WebView)findViewById(R.id.webview1);
        //リンクをタップしたときに標準ブラウザを起動させない
        myWebView.setWebViewClient(new WebViewClient());

        // myWebView.loadUrl("http://www.google.co.jp");
        myWebView.loadUrl("file:///android_asset/index.html");
        //jacascriptを許可する
        myWebView.getSettings().setJavaScriptEnabled(true);
    }

}
