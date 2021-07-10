package com.nepplus.kotlinbasic_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val testVar = "연습용 토스트";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //테스트 버튼 이벤트리스너 등록
        testBtn.setOnClickListener {
            //버튼이 눌리는지 로그를 찍어보자.
            Log.d("메인화면","testBtn이 클릭 됨")
            Log.i("메인화면","로그 두줄이 찍히게.")
            Log.wtf("w","bh")
        }
        secondBtn.setOnClickListener {
            Log.e("메인화면","secondBtn이 클릭 됨")

        }
        
        toastBtn.setOnClickListener { 
            Toast.makeText(this,testVar,Toast.LENGTH_SHORT).show();
        }
    }
}