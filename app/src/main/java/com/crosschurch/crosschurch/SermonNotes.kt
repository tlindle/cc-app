package com.crosschurch.crosschurch

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SermonNotes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sermon_notes)
    }

    fun switchToScripture(view: View) {
        val intent = Intent(this, SermonScripture::class.java)
        startActivity(intent)
    }
}
