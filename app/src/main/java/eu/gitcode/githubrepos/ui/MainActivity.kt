package eu.gitcode.githubrepos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.gitcode.githubrepos.R
import eu.gitcode.githubrepos.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}
