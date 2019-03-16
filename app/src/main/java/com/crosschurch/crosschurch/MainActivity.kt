package com.crosschurch.crosschurch

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val messagesFragment = MessagesFragment()
    private val notesFragment = NotesFragment()
    private val eventsFragment = EventsFragment()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                setFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_messages -> {
                setFragment(messagesFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_events -> {
                setFragment(eventsFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notes -> {
                setFragment(notesFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, homeFragment).commit()
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}
