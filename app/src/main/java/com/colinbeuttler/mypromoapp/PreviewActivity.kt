package com.colinbeuttler.mypromoapp

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    private var message: Message? = null
    private lateinit var messagePreviewText: String

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        displayMessage()
        setUpButton()
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun displayMessage() {
        message = intent.getSerializableExtra("Message", Message::class.java)
        messagePreviewText = """
                Hi ${message?.contactName},
                
                My name is ${message?.displayName} and I am ${message?.getFullJobDescription()}
                
                I have a portfolio of apps to demonstrate my technical skills that I can show on request.
                
                I am able to start a new position ${message?.getAvailablity()}.
                
                Please get in touch if you have any suitable roles for me.
                
                Thanks and regards.
                
            """.trimIndent()
        text_view_message.text = messagePreviewText
    }

    private fun setUpButton() {
        send_message_button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto: ${message?.contactNumber}")
                putExtra("sms_body", messagePreviewText)
            }
            startActivity(intent)
        }

    }
}