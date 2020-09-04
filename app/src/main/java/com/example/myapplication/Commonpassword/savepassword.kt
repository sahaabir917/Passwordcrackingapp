package com.example.myapplication.Commonpassword

import android.app.Activity
import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import com.example.myapplication.AppDb.CommonPassEntity
import com.example.myapplication.AppDb.appDb

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_savepassword.*

/**
 * A simple [Fragment] subclass.
 */
class savepassword : Fragment() {

    var count: Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_savepassword, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var db = Room.databaseBuilder(requireActivity().applicationContext, appDb::class.java,"CommonDatabase").build()

        savepass.setOnClickListener {
            Thread{
                var i= 0
                var commonpass = CommonPassEntity()
                commonpass.password = inputpass.text.toString()
                db.pass_dao().savepass(commonpass)
                 var inputpass1 = inputpass.text.toString()
            }.start()
//            d("count out foreach",count.toString())
            inputpass.setText("")
        }



    }
}
