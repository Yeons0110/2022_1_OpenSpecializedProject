/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2020039003 김성연
 * 작성일 : 2022.04.03
 *프로그램 설명 :  에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록 프로젝트를 작성하라.
 ************************************************/

package com.example.practiceedit

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var editText1: EditText? = null
    var result: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "연습문제 4-8"
        editText1 = findViewById<View>(R.id.editTest1) as EditText
        editText1!!.setOnKeyListener { v, keyCode, event ->
            result = editText1!!.text.toString()
            Toast.makeText(applicationContext, result, Toast.LENGTH_SHORT).show()
            false
        }
    }


}