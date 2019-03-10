package com.giuseppesorce.adiexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.eds.smokedetector.commonsservices.replaceFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.replaceFragment(R.id.fmContainer, BlankFragment.newInstance(), BlankFragment.FRAGMENT_TAG)
    }
}
