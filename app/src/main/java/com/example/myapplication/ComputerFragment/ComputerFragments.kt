package com.example.myapplication.ComputerFragment

import android.animation.ObjectAnimator
import android.app.ProgressDialog
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.myapplication.AppDb.CommonPassEntity
import com.example.myapplication.AppDb.appDb
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentComputerFragmentsBinding
import kotlinx.android.synthetic.main.fragment_computer_fragments.*


/**
 * A simple [Fragment] subclass.
 */
class ComputerFragments : Fragment() {
    var total_days: String = "a"
    var total_days_mob: String = "a"
    var total_execution_time_year: String = "a"
    var total_for_mobile_time_year: String = "a"
    var positions: Int = 0
    var password: String = "abc"
    var count: Int = 0
    var strength: Int = 0
    var password_length: Int = 0
    var countupper: Int = 0
    var countlower: Int = 0
    var countDigit: Int = 0
    var countsymbol: Int = 0
    var cpuspeed: Double = 0.0
    var clock_rate: Int = 0
    var inputcpu: String = "abc"
    var inputcpuint: Int = 1
    var totalexe: Int = 10
    var total_month: String = "a"
    var total_month_for_mob: String = "s"
    var total_min_for_mob: String = "a"
    var total_mint: String = "1.9"
    var total_hours: String = "1"
    var total_hours_mob: String = "a"
    var space: Int = 0
    var combinationsofpassword = StringBuilder()
    private lateinit var Instruction_set: String
    private lateinit var total_execution_time: String
    var total_for_mobile_time: String = "a"
    var passwords: String = "s"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentComputerFragmentsBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var db = Room.databaseBuilder(
            requireActivity().applicationContext,
            appDb::class.java,
            "CommonDatabase"
        ).build()


        var commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "123456"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "123456789"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "qwerty"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "password"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "1234567"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "12345678"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "12345"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "iloveyou"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "111111"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "123123"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "abc123"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "qwerty123"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()



        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "1q2w3e4r"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "admin"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "qwertyuiop"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "654321"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "555555"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "lovely"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "7777777"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "welcome"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "888888"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "princess"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "dragon"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "password1"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()

        commonpasswordentry = CommonPassEntity()
        commonpasswordentry.password = "123qwe"
        Thread{
            db.pass_dao().savepass(commonpasswordentry)
        }.start()


        submit.setOnClickListener {
            inputcpu = cpuspeedfrominput.text.toString()
            inputcpu = multiply(inputcpu, "1000000000")
            Log.d("input cpu speed is ", inputcpu)
            progressBar.visibility = View.GONE
            onlycom.visibility = View.GONE
            onlycom1.visibility = View.GONE
            onlymob.visibility = View.GONE
            onlymob2.visibility = View.GONE
            onlysup.visibility = View.GONE
            onlysup2.visibility = View.GONE
            commonpassmatch.text = " "
            suggestiontitle.visibility = View.GONE
            suggestion.visibility = View.GONE
            linear1.visibility = View.VISIBLE


            passwords = pass.text.toString()

            if (passwords.length < 3) {
                linear1.visibility = View.GONE
                commonpassmatch.text = "your password must be atleast 3 charecters.please try again"
                commonpassmatch.visibility = View.VISIBLE

            } else {

                 Thread {

                    var i = 0
                    var inputpass1 = pass.text.toString()
                    db.pass_dao().selectall().forEach {
                        d("data", i.toString() + "th data : " + it.password.toString())
                        i++
                        if (inputpass1 == it.password.toString()) {
                            count++
                            d("count in foreach", count.toString())
                        }
                    }
                     d("count out foreach", count.toString())
                    if (count >= 1) {
                        commonpassmatch.setText(R.string.app_name)
                    } else {
                        d("notcommon", "notcommon")
                    }
                    count = 0
                }.start()


                object : CountDownTimer(15000, 500) {
                    override fun onFinish() {
                        linear1.visibility = View.GONE
                    }

                    override fun onTick(millisUntilFinished: Long) {

                        positions = position()

                        if (positions == 1) {
                            animation1.text = showmymassage()
                            animation1.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation1.startAnimation(animation)
                        } else if (positions == 2) {
                            animation2.text = showmymassage()
                            animation2.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation2.startAnimation(animation)
                        } else if (positions == 3) {
                            animation3.text = showmymassage()
                            animation3.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation3.startAnimation(animation)
                        } else if (positions == 4) {
                            animation4.text = showmymassage()
                            animation4.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation4.startAnimation(animation)
                        } else if (positions == 5) {
                            animation5.text = showmymassage()
                            animation5.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation5.startAnimation(animation)
                        } else if (positions == 6) {
                            animation6.text = showmymassage()
                            animation6.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation6.startAnimation(animation)
                        } else if (positions == 8) {
                            animation7.text = showmymassage()
                            animation7.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation7.startAnimation(animation)
                        } else if (positions == 8) {
                            animation8.text = showmymassage()
                            animation8.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation8.startAnimation(animation)
                        } else if (positions == 9) {
                            animation9.text = showmymassage()
                            animation9.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation9.startAnimation(animation)
                        } else if (positions == 10) {
                            animation10.text = showmymassage()
                            animation10.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation10.startAnimation(animation)
                        } else if (positions == 11) {
                            animation11.text = showmymassage()
                            animation11.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation11.startAnimation(animation)
                        } else if (positions == 12) {
                            animation12.text = showmymassage()
                            animation12.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation12.startAnimation(animation)
                        } else if (positions == 13) {
                            animation13.text = showmymassage()
                            animation13.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation13.startAnimation(animation)
                        } else if (positions == 14) {
                            animation14.text = showmymassage()
                            animation14.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation14.startAnimation(animation)
                        } else if (positions == 15) {
                            animation15.text = showmymassage()
                            animation15.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation15.startAnimation(animation)
                        } else if (positions == 16) {
                            animation16.text = showmymassage()
                            animation16.visibility = View.VISIBLE
                            var animation = AnimationUtils.loadAnimation(context, R.anim.fade_in)
                            animation16.startAnimation(animation)
                        }
                    }

                }.start()


                strength = 0
                password = pass.text.toString()
                Log.d("password is ", password.toString())
                password_length = password.length - 1
                for (i in 0..password_length) {
                    if (password[i] == 'A' || password[i] == 'B' || password[i] == 'C' || password[i] == 'D' || password[i] == 'E'
                        || password[i] == 'F' || password[i] == 'G' || password[i] == 'H' || password[i] == 'I' || password[i] == 'J'
                        || password[i] == 'K' || password[i] == 'L' || password[i] == 'M' || password[i] == 'N' || password[i] == 'O'
                        || password[i] == 'P' || password[i] == 'Q' || password[i] == 'R' || password[i] == 'S' || password[i] == 'T'
                        || password[i] == 'U' || password[i] == 'V' || password[i] == 'W' || password[i] == 'X' || password[i] == 'Y'
                        || password[i] == 'Z'
                    ) {
                        countupper++
                    }

                    if (password[i] == 'a' || password[i] == 'b' || password[i] == 'c' || password[i] == 'd' || password[i] == 'e'
                        || password[i] == 'f' || password[i] == 'g' || password[i] == 'h' || password[i] == 'i' || password[i] == 'j'
                        || password[i] == 'k' || password[i] == 'l' || password[i] == 'm' || password[i] == 'n' || password[i] == 'o'
                        || password[i] == 'p' || password[i] == 'q' || password[i] == 'r' || password[i] == 's' || password[i] == 't'
                        || password[i] == 'u' || password[i] == 'v' || password[i] == 'w' || password[i] == 'x' || password[i] == 'y'
                        || password[i] == 'z'
                    ) {
                        countlower++
                    }

                    if (password[i] == '1' || password[i] == '2' || password[i] == '3' || password[i] == '4' ||
                        password[i] == '5' || password[i] == '6' || password[i] == '7' || password[i] == '8' ||
                        password[i] == '9' || password[i] == '0'
                    ) {
                        countDigit++
                    }

                    if (password[i] == '+' || password[i] == '-' || password[i] == '*' || password[i] == '/' ||
                        password[i] == ':' || password[i] == '%' || password[i] == '$' || password[i] == '#' ||
                        password[i] == '@' || password[i] == '^' || password[i] == '.'
                    ) {
                        countsymbol++
                    }

                    if (password[i] == ' ') {
                        space++
                    }

                }

                if (countDigit >= 1) {
                    strength += 10
                    combinationsofpassword.append("1")
                }

                if (countlower >= 1) {
                    strength += 26
                    combinationsofpassword.append("a")
                }


                if (countupper >= 1) {
                    strength += 26
                    combinationsofpassword.append("A")
                }

                if (countsymbol >= 1) {
                    strength += 10
                    combinationsofpassword.append("/")
                }

                if (space >= 1) {
                    strength += 5
                    combinationsofpassword.append(" ")
                }



                Log.d("strength is", strength.toString())

                password_length = password.length
                Log.d("password length is -", password_length.toString())
                cpuspeed = 4000000000.0
                Log.d("expo", cpuspeed.toString())

                clock_rate = 1
                Log.d("clock rate is : ", clock_rate.toString())


                Instruction_set = "1"
                for (i in 1..password_length) {
                    Instruction_set = multiply(strength.toString(), Instruction_set)
                    Log.d("instruction set is at ", i.toString() + "position is " + Instruction_set)
                }
                Log.d("instruction set is at ", Instruction_set)


                total_execution_time = multiply(Instruction_set, clock_rate.toString())
                Log.d("total second after multiply clock rate ", total_execution_time)
                inputcpu = inputcpu.dropLast(9)
                total_for_mobile_time = total_execution_time
                if (inputcpu == "") {
                    total_execution_time = longDivision(total_execution_time, 4)
                    total_execution_time = total_execution_time.dropLast(9)
                    Log.d("total seconds", total_execution_time)
                    total_month = total_execution_time
                    total_mint = total_execution_time
                    total_hours = total_execution_time
                    total_days = total_execution_time
                    total_month = longDivision(total_month, 2628000)
                    total_execution_time_year = longDivision(total_execution_time, 31540000)
                    total_mint = longDivision(total_mint, 60)
                    total_hours = longDivision(total_hours, 3600)
                    total_days = longDivision(total_days, 86400)


                    total_for_mobile_time = longDivision(total_for_mobile_time, 2)
                    total_for_mobile_time = total_for_mobile_time.dropLast(9)
                    total_month_for_mob = total_for_mobile_time
                    total_min_for_mob = total_for_mobile_time
                    total_hours_mob = total_for_mobile_time
                    total_days_mob = total_for_mobile_time
                    total_month_for_mob = longDivision(total_month_for_mob, 2628000)
                    total_for_mobile_time_year = longDivision(total_for_mobile_time, 31540000)
                    total_min_for_mob = longDivision(total_min_for_mob, 60)
                    total_hours_mob = longDivision(total_hours_mob, 3600)
                    total_days_mob = longDivision(total_days_mob, 86400)
                } else {
                    total_execution_time = longDivision(total_execution_time, inputcpu.toInt())
                    total_execution_time = total_execution_time.dropLast(9)
                    Log.d("total seconds", total_execution_time)
                    total_month = total_execution_time
                    total_mint = total_execution_time
                    total_hours = total_execution_time
                    total_days = total_execution_time
                    total_month = longDivision(total_month, 2628000)
                    total_execution_time_year = longDivision(total_execution_time, 31540000)
                    total_mint = longDivision(total_mint, 60)
                    total_hours = longDivision(total_hours, 3600)
                    total_days = longDivision(total_days, 86400)



                    total_for_mobile_time = longDivision(total_for_mobile_time, inputcpu.toInt())
                    total_for_mobile_time = total_for_mobile_time.dropLast(9)
                    total_month_for_mob = total_for_mobile_time
                    total_min_for_mob = total_for_mobile_time
                    total_hours_mob = total_for_mobile_time
                    total_days_mob = total_for_mobile_time
                    total_month_for_mob = longDivision(total_month_for_mob, 2628000)
                    total_for_mobile_time_year = longDivision(total_for_mobile_time, 31540000)
                    total_min_for_mob = longDivision(total_min_for_mob, 60)
                    total_hours_mob = longDivision(total_hours_mob, 3600)
                    total_days_mob = longDivision(total_days_mob, 86400)

                }

                textvisible(
                    total_execution_time_year,
                    total_month,
                    total_days,
                    total_hours,
                    total_mint,
                    total_execution_time,
                    total_for_mobile_time_year,
                    total_for_mobile_time,
                    total_month_for_mob,
                    total_days_mob,
                    total_hours_mob,
                    total_min_for_mob,
                    total_for_mobile_time,
                    passwords
                )
            }
        }


//
//            progressdialoging()
//            progressBar.visibility = View.VISIBLE
//            progressbarexe()


    }




    private fun progressdialoging() {
        val progressdialog = ProgressDialog(context)
        progressdialog.setMessage(showmymassage())
        progressdialog.setCancelable(false)
        progressdialog.setTitle("Analysis")
        progressdialog.show()
        Handler().postDelayed({ progressdialog.dismiss() }, 10000)
    }

    private fun showmymassage(): CharSequence? {
        var string = StringBuilder()

        var digit = (0 until 2).random()
        string.append(digit.toString())
        return string
    }

    fun progressbarexe() {
        progressBar.progress = 0
        progressBar.max = 100
        var currentprogress = 100
        ObjectAnimator.ofInt(progressBar, "progress", currentprogress)
            .setDuration(15000)
            .start()
    }

    fun textvisible(
        totalExecutionTimeYear: String,
        totalMonth: String,
        totalDays: String,
        totalHours: String,
        totalMint: String,
        totalExecutionTime: String,
        totalForMobileTimeYear: String,
        totalForMobileTime: String,
        totalMonthForMob: String,
        totalDaysMob: String,
        totalHoursMob: String,
        totalMinForMob: String,
        totalForMobileTime1: String,
        passwords: String
    ) {
        Handler().postDelayed({

            onlycom.visibility = View.VISIBLE
            onlycom1.visibility = View.VISIBLE
            onlycom1.text =
                "your password can be cracked in _" + totalExecutionTimeYear + " years Or _" + totalMonth + "Months Or _" + totalDays + " day Or _" + totalHours + " hour _" + totalMint + " minutes _" + totalExecutionTime + " seconds "
            onlymob.visibility = View.VISIBLE
            onlymob2.visibility = View.VISIBLE
            onlymob2.text =
                "your password can be cracked in " + totalForMobileTimeYear + " years Or _" + totalMonthForMob + "Months Or _" + totalDaysMob + " day Or _" + totalHoursMob + " hour _" + totalMinForMob + " minutes _" + totalForMobileTime + " seconds "

            suggestiontitle.visibility = View.VISIBLE
            var i: Int = 0
            var counts: Int = 0
            var symbolss: Int = 0
            var low: Int = 0
            var up: Int = 0
            var spa: Int = combinationsofpassword.length - 1
            d("combinations of password is ", combinationsofpassword.toString())

            for (i in 0..spa) {

                if (combinationsofpassword[i] == '1') {
                    counts++
                }

                if (combinationsofpassword[i] == 'a') {
                    counts++
                }

                if (combinationsofpassword[i] == 'A') {
                    counts++
                }

                if (combinationsofpassword[i] == ' ') {
                    counts++
                }

                if (combinationsofpassword[i] == '/') {
                    counts++
                }
            }

            if (counts == 1) {
                suggestion.text = "password is weak"
                suggestion.visibility = View.VISIBLE
            }

            if (counts == 2) {
                suggestion.text = "password is medium"
                suggestion.visibility = View.VISIBLE
            }

            if (counts == 3) {
                suggestion.text = "password is better"
                suggestion.visibility = View.VISIBLE
            }

            if (counts == 4) {
                suggestion.text = "password is strong"
                suggestion.visibility = View.VISIBLE
            }

            if (counts == 5) {
                suggestion.text = "password is strongest"
                suggestion.visibility = View.VISIBLE
            }

            pass.setText("")
            cpuspeedfrominput.setText("")
            givenpassword.visibility = View.VISIBLE
            givenpassword.text = "your last password was ${this.passwords}"

        }, 16000)
    }



    fun multiply(num1: String, num2: String): String {
        val n1 = StringBuilder(num1).reverse().toString()
        val n2 = StringBuilder(num2).reverse().toString()
        val d = IntArray(num1.length + num2.length)

        //multiply each digit and sum at the corresponding positions
        for (i in 0 until n1.length) {
            for (j in 0 until n2.length) {
                d[i + j] += (n1[i] - '0') * (n2[j] - '0')
            }
        }
        val sb = StringBuilder()

        //calculate each digit
        for (i in d.indices) {
            val mod = d[i] % 10
            val carry = d[i] / 10
            if (i + 1 < d.size) {
                d[i + 1] += carry
            }
            sb.insert(0, mod)
        }

        //remove front 0's
        while (sb[0] == '0' && sb.length > 1) {
            sb.deleteCharAt(0)
        }
        return sb.toString()
    }


    fun position(): Int {
        var digit = (1 until 17).random()
        return digit
    }

    fun longDivision(
        number: String,
        divisor: Int
    ): String {

        val result = java.lang.StringBuilder()

        val dividend = number.toCharArray()
        var carry = 0


        for (i in dividend.indices) {
            val x = (carry * 10
                    + Character.getNumericValue(
                dividend[i]
            ))

            result.append(x / divisor)
            carry = x % divisor
        }

        for (i in 0 until result.length) {
            if (result[i] != '0') {
                // Return the result
                return result.substring(i)
            }
        }
        return ""
    }
}
