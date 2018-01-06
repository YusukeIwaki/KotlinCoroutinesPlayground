package io.github.yusukeiwaki.kotlincoroutinesplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch(UI) {
            DummyRepository().execute()
            findViewById<TextView>(R.id.text).setText("currentTimeMillis = ${System.currentTimeMillis()}")
        }
    }
}
