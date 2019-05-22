package com.example.patientsandmedication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PatientsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_patients, container, false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val patient = Patient("benidobre@gmail.com", "beni", "male", 1, "dobre")
            val action = PatientsFragmentDirections.actionPatientsDestToDetailDest(patient)
            findNavController().navigate(action)
        }

        return view
    }


}
