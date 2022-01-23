package com.handroid.dependencyinjectionstart.example_1

import javax.inject.Inject

class Activity {

/*    val component = DaggerNewComponent.create()
    val keyboard: Keyboard = component.getKeyboard()
    private val monitor: Monitor = component.getMonitor()
    private val mouse: Mouse = component.getMouse()*/

    /*    @Inject
        lateinit var keyboard: Keyboard
        @Inject
        lateinit var monitor: Monitor
        @Inject
        lateinit var mouse: Mouse*/
    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

}