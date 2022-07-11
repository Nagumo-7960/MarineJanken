package com.example.marinejanken.ui.screens

import com.example.marinejanken.components.ui.screens.*
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class BattleResultScreenKtTest {
    @Test
    fun JankenResultTest(){
        myHandCheck = "gu"
        oppHandCheck = "choki"
        battleResultCheck()
        assertEquals("win", battleResult)
    }

    @Test
    fun PhraseResultTest(){
        battleResult = "win"
        battleResultCheck()
        assertEquals(oppResultPhrase, oppResultPhraseList.get(2))
        assertEquals(myResultPhrase, myResultPhraseList.get(0))
        battleResult = "draw"
        battleResultCheck()
        assertEquals(oppResultPhrase, oppResultPhraseList.get(1))
        assertEquals(myResultPhrase, myResultPhraseList.get(1))
        battleResult = "lose"
        battleResultCheck()
        assertEquals(oppResultPhrase, oppResultPhraseList.get(0))
        assertEquals(myResultPhrase, myResultPhraseList.get(2))
    }

}