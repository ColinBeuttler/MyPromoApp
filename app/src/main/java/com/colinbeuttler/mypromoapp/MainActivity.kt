package com.colinbeuttler.mypromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preview_button.setOnClickListener {
            onPreviewClicked()

        }
    }

    private fun onPreviewClicked() {
        val contactName = edit_text_contact_name.text.toString()
        val contactNumber = edit_text_contact_number.text.toString()
        val displayName = edit_text_my_display_name.text.toString()
        val includeJunior = check_box_junior.isChecked
        val jobTitle = spinner_job_title.selectedItem?.toString()
        val immediateStart = check_box_immediate_start.isChecked
        val startDate = edit_text_start_date.text.toString()
        val testString = "Name of Contact: $contactName, Contact Phone Number: $contactNumber, My display Name: $displayName, Include Junior: $includeJunior, Job Title: $jobTitle, Start Immediately: $immediateStart, Start Date: $startDate"

        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }
}