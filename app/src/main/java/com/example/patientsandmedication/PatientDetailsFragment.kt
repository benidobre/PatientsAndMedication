package com.example.patientsandmedication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 *
 */
class PatientDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_patient_details, container, false)
        val args: PatientDetailsFragmentArgs by navArgs()
        val patient = args.patient
        val details = view.findViewById<TextView>(R.id.details)
        details.text = patient.email
        return view
    }


}
