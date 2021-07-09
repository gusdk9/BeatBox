package com.bignerdranch.android.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter

class SoundViewModel : BaseObservable() {
    fun onButtonClicked() {
        // TODO("Not yet implemented")
    }

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }

    @get:Bindable
    val title: String?
        get() = sound?.name
}