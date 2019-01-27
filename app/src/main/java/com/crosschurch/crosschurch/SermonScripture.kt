package com.crosschurch.crosschurch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import kotlinx.android.synthetic.main.activity_sermon_scripture.*


class SermonScripture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sermon_scripture)
        scriptureTextView.setMovementMethod(ScrollingMovementMethod())
    }

    fun switchToNotes(view: View) {
        val intent = Intent(this, SermonNotes::class.java)
        startActivity(intent)
    }
}
