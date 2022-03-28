package com.dgpay.scorecount

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnPlushScoreTeamA.setOnClickListener(this)
        btnMinusScoreTeamA.setOnClickListener(this)
        btnPlushScoreTeamB.setOnClickListener(this)
        btnMinusScoreTeamB.setOnClickListener(this)
        btn_reset.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btnPlushScoreTeamA -> {
                addScoreA()
            }
            R.id.btnMinusScoreTeamA -> {
                minusScoreA()
            }
            R.id.btnPlushScoreTeamB -> {
                addScoreB()
            }
            R.id.btnMinusScoreTeamB -> {
                minusScoreB()
            }
            R.id.btn_reset ->{
                resetScore()
            }
        }
    }
    private fun addScoreA(){
        scoreA += 1
        tvScoreTeamA.text=scoreA.toString()
    }
    private fun addScoreB(){
        scoreB += 1
        tvScoreTeamB.text=scoreB.toString()
    }
    private fun minusScoreA(){
        scoreA -= 1
        tvScoreTeamA.text=scoreA.toString()
    }
    private fun minusScoreB(){
        scoreB -= 1
        tvScoreTeamB.text=scoreB.toString()
    }
    private fun resetScore(){
        scoreA = 0
        scoreB = 0
        tvScoreTeamA.text = scoreA.toString()
        tvScoreTeamB.text = scoreB.toString()
    }
}