package ru.synergy.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    // отличия в переменных 
    // объявляются через val or var далее имя_переменной: тип_переменной (в java наоборот)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age: Int //val является неизменной переменной , var изменяемая
        age = 23
        println(age)


        // блок переменные println("Hello Kotlin")
        //; ставим только если представление будет выглядеть следующим образом
       // println("Hello Kotlin"); println("Hello Kotlin");println("Hello Kotlin"); потому что разделаем стейтмент
    }
}