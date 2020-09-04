package com.example.myapplication
import android.animation.ObjectAnimator
import android.app.ProgressDialog
import android.os.Bundle
import android.os.Handler
import android.util.Log.d
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_computer_fragments.*
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var password : String = "abc"
    var count : Int = 0
    var strength : Int = 0
    var password_length : Int = 0
    var countupper : Int = 0
    var countlower : Int = 0
    var countDigit : Int = 0
    var countsymbol : Int = 0
    var cpuspeed : Double =0.0
    var clock_rate : Int = 0
    var inputcpu : String = "abc"
    var inputcpuint : Int = 1
    var totalexe : Int = 10
    var total_month : String ="a"
    var total_mint : String = "1.9"
    private lateinit var Instruction_set : String
    private lateinit var total_execution_time : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


    }


}