package com.yurchenko.maryna.resumeandroidapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistory)

        workHistory.setOnClickListener{
            println("Hey you hit the button!")

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callMaryna = findViewById<Button>(R.id.callMaryna)

        callMaryna.setOnClickListener {
            println("This is my phone number")

            var phoneUri = Uri.parse("tel:1800940525")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }
        var emailButton = findViewById<Button>(R.id.emailButton)

        emailButton.setOnClickListener{
             println("Email")

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "yurchenko.maryna@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nica Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume")
            startActivity(emailIntent)
        }
    }
}
