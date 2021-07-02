package com.bignerdranch.android.beatbox

import android.content.res.AssetManager
import java.lang.Exception

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager) {

    fun loadSounds(): List<String> {
        try {
            val soundNames = assets.list(SOUNDS_FOLDER)!!
            return soundNames.asList()
        } catch (e: Exception) {
            return emptyList()
        }
    }

}