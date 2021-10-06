package com.capgemini.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class ToolBarActivity : AppCompatActivity() {
    lateinit var tBar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        tBar = findViewById(R.id.toolbar)

        setSupportActionBar(tBar)
    }
}