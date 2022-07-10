package com.example.marinejanken.ui.screens

import com.example.marinejanken.components.ui.screens.BattleResultCheck
import com.example.marinejanken.components.ui.screens.battleResult
import com.example.marinejanken.components.ui.screens.myHandCheck
import com.example.marinejanken.components.ui.screens.oppHandCheck
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BattleResultScreenKtTest {
    @Test
    fun JankenResultTest(){
        myHandCheck = "gu"
        oppHandCheck = "choki"
        BattleResultCheck()
        assertEquals("win", battleResult)
    }

    @Test
    fun sampleTest(){
        assertEquals(1,1)
    }
    @Test
    fun sampleTest2(){
        assertEquals(2,1)
    }
}