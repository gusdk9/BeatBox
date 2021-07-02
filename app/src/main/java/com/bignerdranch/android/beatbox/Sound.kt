package com.bignerdranch.android.beatbox

private const val WAV = ".wav"

/**
 * 음원 파일 정보를 유지하고 관리하는 클래스
 * */
class Sound(val assetPath: String) {

    val name = assetPath.split("/").last().removeSuffix(WAV)
}