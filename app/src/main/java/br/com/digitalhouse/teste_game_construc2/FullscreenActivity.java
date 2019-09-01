package br.com.digitalhouse.teste_game_construc2;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    private WebView jogo;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        jogo = findViewById(R.id.areaDejogo);

        jogo.getSettings().setJavaScriptEnabled(true);
        jogo.getSettings().setAllowFileAccessFromFileURLs(true);

        jogo.loadUrl("file:///android_asset/index.html");


    }
}
