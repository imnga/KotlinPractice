package ru.synergy.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    // отличия в переменных 
    // объявляются через val or var далее имя_переменной: тип_переменной (в java наоборот)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int //val является неизменной переменной , var изменяемая
        age = 23
        println(age)

        age = 17

        //var example: String ="""lorem
        //|ipsum
        //|10 """.trimMargin()

        // шаблоны строк
        val firstName: String = "Tom"
        val secondName: String = "Smith"
        val welcome: String = "Hello, $firstName $secondName"
        println(welcome)

        //позволяет выводить типы переменных
        var welcomeDuplicate = welcome
        // var welomeDuplicate: Any = "String"

        //чтение с консоли
        //readLine ()//читает строку и позволяет ее парсить

        //логические выражения
        val a = true
        val b = false
        var c = a and b//хотя написать && как на java тоже можно
        c = a or b // instead ||
        c = a xor b //xor - возвращает true , когда один из показателей true
        c= a.not() //с = != a

        val d = 5
        val e = d in 1..6// очень удобная конструкция массива


       // if (a == b) {
       //     return d } else {return e}

        //есть switch case
      //  when (объект ) {
      //      значение1 -> дейсвие1
      //      значение2 -> дейсвие2
      //  }

       // val isEnabled = true
       // when (isEnabled){
       //     true-> println("isEnabled on")
       //     false-> println("isEnabled off")// и все готово
       //     else-> println("undefined variable")
       // }

        val param = 10
        when (param){
            in 1..10-> println("isEnabled on")
            11,12-> println("isEnabled off")// и все готово
            else-> println("undefined variable")
        }

        val firstArg = 15
        val secondArg = 6
        when{
            (firstArg > 10)-> println("firstArg больше десяти ")// or use return like that: (firstArg > 10)-> firstArg and that'll work
            (secondArg> 10)-> println("secondArg больше десяти")
            else ->  println("first или second меньше десяти")
        }
        // for in Kotlin

        for (n in 1..9){
            println("${n*n}\t")

        }

        // последовательности - они в котлине достаточно умные , можно исп-ть в отладочных целях

            //val range 1..5 //[1,2,3,4,5] увидим на выводе  и мы видим что 1..5 - это оператор, формирует массив
        var range: Any = 1..5
        range = "a".."d" //сгененировали последовательность букв
        //но если нужно от большего к меньшему в обратном полядке
        range = 5 downTo 1 //все [5,4,3,2,1]
        // если хотим делать с шагами через 2,3,4 числа
        range = 5 downTo 1 step 2 //[5,3,1]

        //не включать верхнюю границу
        range = 1 until 9 //[1,2,3,4,5,6,7,8] не включая 9ку
        range = 1..9 step 2 // не включая 9ку [1,3,5,7]

        //проверять наличие внутри каких-то элементов
        range = 2 in 1..9 step 2// false.

        // перебирать последовательности с помощью for
        for (c in 1..9) print(c)
        // при этом массив может хранить данные только одного типа и в котлин это не поменялось это стринг или наследники стринг или использовать тип эни, но это не очень хорошо
        val numbers: Array<Int> = arrayOf(1,2,3,4,5,6)
        val n = numbers[1]
        numbers[3]= 7
        print("numbers[2]= ${numbers[2]++}")// полноценное лямбдовыражение
        // or
        var i= 0
        val numbers2 = Array ( 3, {i++ *2})//[2,4,6]

        // перебирать массивы
        for (number in numbers) print ("$number \t")

        // посмотри еще примеры циклов в котлин
        val people = arrayOf("Tom", "Sam", "Bob")
        for (person in people)
            print("$person\t")

        while (i in people.indices){ // тут может быть отрицание !i
            print ("${people[i]} \t" )
            i++
        }
        // or for instead of while
        for  (i in people.indices){ // тут не может быть отрицания !i
            print ("${people[i]} \t" )
        } // более короткий сспособ перечисления индексов // но так почти никто не пишет

        // инициализация через методы
        var integers : IntArray = intArrayOf(1,2,3,4,5)
        var doubles: DoubleArray = doubleArrayOf( 1.3, 1.8, 1.9)

        // но можем инициализировать и через конструктор
        integers = IntArray(3, {5})
        doubles= DoubleArray(3, {1.7})


        // блок переменные println("Hello Kotlin")
        //; ставим только если представление будет выглядеть следующим образом
       // println("Hello Kotlin"); println("Hello Kotlin");println("Hello Kotlin"); потому что разделаем стейтмент
    }
}