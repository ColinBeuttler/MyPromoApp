package com.colinbeuttler.mypromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private var contactName: TextInputEditText? = null
    private var contactNumber: TextInputEditText? = null
    private var displayName: TextInputEditText? = null
    private var availableDate: TextInputEditText? = null
    private var juniorCheckBox: CheckBox? = null
    private var immediateStart: CheckBox? = null
    private var jobTitleSpinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contactName = findViewById(R.id.edit_text_contact_name)
        contactNumber = findViewById(R.id.edit_text_contact_number)
        displayName = findViewById(R.id.edit_text_my_display_name)
        availableDate = findViewById(R.id.edit_text_start_date)
        juniorCheckBox = findViewById(R.id.check_box_junior)
        immediateStart = findViewById(R.id.check_box_immediate_start)
        jobTitleSpinner = findViewById(R.id.spinner_job_title)
        val previewButton: Button = findViewById(R.id.preview_button)
        previewButton.setOnClickListener {
            onPreviewClicked()

        }
    }

    private fun onPreviewClicked() {
        val textString = contactName?.text.toString() + ", " + contactNumber?.text.toString()
        Toast.makeText(this, textString, Toast.LENGTH_LONG).show()
    }
}