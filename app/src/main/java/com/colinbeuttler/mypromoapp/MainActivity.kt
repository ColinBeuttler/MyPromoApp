package com.colinbeuttler.mypromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val previewButton: Button = findViewById(R.id.preview_button)
        previewButton.setOnClickListener {
            onPreviewClicked()

        }
    }

    private fun onPreviewClicked() {
        val contactName: TextInputEditText = findViewById(R.id.edit_text_contact_name)
        val contactNumber: TextInputEditText = findViewById(R.id.edit_text_contact_number)
        val textString = contactName.text.toString() + ", " + contactNumber.text.toString()
        Toast.makeText(this, textString, Toast.LENGTH_LONG).show()
    }
}