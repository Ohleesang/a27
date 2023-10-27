package com.example.a27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(phone_number: String): String {
                var answer:String = ""
                var star = Array<Char>(phone_number.length-4,{'*'})
                var convertedStar = String(star.toCharArray())
                answer = convertedStar + phone_number.substring(phone_number.length-4..phone_number.length-1)
                return answer
            }
        }

        val a = Solution()
        a.solution("01033334444")//7+4
        a.solution("027778888")//5+4
    }
}