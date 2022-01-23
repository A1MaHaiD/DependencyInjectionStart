package com.handroid.dependencyinjectionstart.example_1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

/*    fun getKeyboard(): Keyboard

    fun getMonitor(): Monitor

    fun getMouse(): Mouse*/

    fun inject(activity: Activity)
}