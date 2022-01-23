package com.handroid.dependencyinjectionstart.example_1

class Activity {

   lateinit var computer:Computer
   lateinit var keyboard: Keyboard

   init {
       Component().inject(this)
   }
}