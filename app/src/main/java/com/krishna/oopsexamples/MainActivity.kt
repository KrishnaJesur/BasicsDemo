package com.krishna.oopsexamples

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    private fun init() {

        // 1 1 3 5 8 13 21
        /*find Fibonacci Series*/
        findFibonacciNumber()
        /*END*/

        // aba
        /*find Pallindrome String*/
        findPallindormeString()
        /*END*/

        /*find Max Number */
        findMinMaxNumber()
        /*END*/

        // //153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3
        /*find Armstrong Number */
        findArmstrongNumber()
        /*END*/


    }

    private fun findArmstrongNumber() {

        var c = 0
        var a: Int
        var temp: Int
        var n = 153 //It is the number to check armstrong
        temp = n
        while (n > 0) {
            a = n % 10
            n /= 10
            c += (a * a * a)
        }

        if (temp == c) {
            Log.d("armstrong number", "$temp")
        } else {
            Log.d("not armstrong number", "$temp")
        }

    }
}


private fun findMinMaxNumber() {
    val arrayList = ArrayList<Int>()
    arrayList.add(3)
    arrayList.add(1)
    arrayList.add(8)
    arrayList.add(3)
    arrayList.add(5)

    val obj: Any = Collections.max(arrayList)
    val obj2: Any = Collections.min(arrayList)
    Log.d("getreversedstring", "$obj $obj2")

}

private fun findPallindormeString() {

    var a: String = "cocoococ"

    var b: String
    b = a.reversed()
    Log.d("getreversedstring", b + " " + a)

    if (b.equals(a)) {
        Log.d("istrue", "true")
    } else {
        Log.d("istrue", "false")
    }
}

private fun findFibonacciNumber() {
    val count = 7
    var num1 = 0
    var num2 = 1

    for (i in 1..count) {
        print("$num1 ")
        /* On each iteration, we are assigning second number
         * to the first number and assigning the sum of last two
         * numbers to the second number
         */
        val sumOfPrevTwo = num1 + num2
        num1 = num2
        num2 = sumOfPrevTwo
        Log.d("Output", num2.toString())
    }
}

