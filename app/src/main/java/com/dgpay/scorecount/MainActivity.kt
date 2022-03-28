package com.dgpay.scorecount

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlushScoreTeamA.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btnPlushScoreTeamA -> {

            }
            R.id.btnMinusScoreTeamA -> {

            }
            R.id.btnPlushScoreTeamB -> {

            }
            R.id.btnMinusScoreTeamB -> {

            }
            R.id.btn_reset ->{

            }
        }
    }
}