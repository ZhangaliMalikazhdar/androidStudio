package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
// View.OnClickener()
class MainActivity : AppCompatActivity(){
    var str1:String = ""
    var str2:String = ""
    var test:Boolean = false
    var direction:Array<String> = arrayOf("Plus","Minus","Multiply","Divide")
    var director:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // counter = savedInstanceState?.getDouble("counter")?:Math.random()*10
        //Log.e("Counter", counter.toString())

//        button1.setOnClickListener{
//            view ->
//            counter++
//            text1.text = "$counter"
//        }

//        button1.setOnClickListener(this)
//        text1.setOnClickListener(this)
    }
    fun btn1(view: View){
        when(test){
            false -> {str1+='1';txt.text = str1}
            true -> {str2+='1';txt.text = str2}
        }
    }
    fun btn2(view: View){
        when(test){
            false -> {str1+='2';txt.text = str1}
            true -> {str2+='2';txt.text = str2}
        }
    }
    fun btn3(view: View){
        when(test){
            false -> {str1+='3';txt.text = str1}
            true -> {str2+='3';txt.text = str2}
        }
    }
    fun btn4(view: View){
        when(test){
            false -> {str1+='4';txt.text = str1}
            true -> {str2+='4';txt.text = str2}
        }
    }
    fun btn5(view: View){
        when(test){
            false -> {str1+='5';txt.text = str1}
            true -> {str2+='5';txt.text = str2}
        }
    }
    fun btn6(view: View){
        when(test){
            false -> {str1+='6';txt.text = str1}
            true -> {str2+='6';txt.text = str2}
        }
    }
    fun btn7(view: View){
        when(test){
            false -> {str1+='7';txt.text = str1}
            true -> {str2+='7';txt.text = str2}
        }
    }
    fun btn8(view: View){
        when(test){
            false -> {str1+='8';txt.text = str1}
            true -> {str2+='8';txt.text = str2}
        }
    }
    fun btn9(view: View){
        when(test){
            false -> {str1+='9';txt.text = str1}
            true -> {str2+='9';txt.text = str2}
        }
    }
    fun btn0(view: View){
        when(test){
            false -> {str1+='0';txt.text = str1}
            true -> {str2+='0';txt.text = str2}
        }
    }
    fun btnPlus(view: View){
        test = true
        director = direction[0]
    }
    fun btnMinus(view: View){
        test = true
        director = direction[1]
    }
    fun btnMultiply(view: View){
        test = true
        director = direction[2]
    }
    fun btnDivide(view: View){
        test = true
        director = direction[3]
    }
    fun btnEqual(view: View){
        test = false
        when(director){
            direction[0] ->{txt.text = "${str1.toInt()+str2.toInt()}"
                str1 = "${str1.toInt()+str2.toInt()}"}
            direction[1] ->{txt.text = "${str1.toInt()-str2.toInt()}"
                str1 = "${str1.toInt()-str2.toInt()}"}
            direction[2] ->{txt.text = "${str1.toInt()*str2.toInt()}"
                str1 = "${str1.toInt()*str2.toInt()}"}
            direction[3] ->{txt.text = "${str1.toInt()/str2.toInt()}"
                str1 = "${str1.toInt()/str2.toInt()}"}
        }
        str2 = ""
    }
//    fun txtClick1(view: View) {
//        counter = 0
//        text1.text = "$counter"
//    }
//    fun btnClick1(view: View) {
//        counter++
//        text1.text = "$counter"
//    }

//    override fun onClick(p0: View?){
//
//        when(p0?.id){
//            button1.id -> {
//                counter++
//                text1.text = "$counter"
//            }
//            text1.id -> {
//                counter = 0
//                text1.text = "$counter"
//            }
//        }

//        if(p0?.id == button1.id){
//            counter++
//            text1.text = "$counter"
//        }else if(p0?.id ==text1.id){
//            counter = 0
//            text1.text = "$counter"
//        }
//    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.e("MainActivity","onSaveInstanceState")
//        outState.putDouble("counter",counter)
//    }

//    override fun onStart(){
//        super.onStart()
//        Log.e("MainActivity","onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("MainActivity","onResume")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.e("MainActivity","onRestart")
//    }
//    override fun onPause() {
//        super.onPause()
//        Log.e("MainActivity","onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("MainActivity","onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("MainActivity","onDestroy")
//    }

}