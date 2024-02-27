package com.example.testproject_android
import androidx.annotation.StringRes

data class Question(@StringRes val textResId:Int, val answer:Boolean) {
}