package com.capgemini.actionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Choose Option"
        supportActionBar?.subtitle = "Capgemini"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Next")?.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
        menu?.add("Toolbar")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.title){
            "Toolbar" -> {
                val i = Intent(this, ToolBarActivity::class.java)
                startActivity(i)
            }
            "Next" -> {
                val i = Intent(this, DemoActivity::class.java)
                startActivity(i)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun buttonClick(view: View) {
        when(view.id){
            R.id.showB -> {
                supportActionBar?.title = "Welcome"
                supportActionBar?.show()
            }
            R.id.hideB -> {
                supportActionBar?.hide()
            }
        }
    }
}