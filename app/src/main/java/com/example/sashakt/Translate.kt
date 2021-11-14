package com.example.sashakt

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.sashakt.R
import com.example.sashakt.TranslationCodes
import com.mannan.translateapi.Language.AUTO_DETECT
import com.mannan.translateapi.Language.ENGLISH
import org.intellij.lang.annotations.Language
import com.mannan.translateapi.TranslateAPI
import com.mannan.translateapi.TranslateAPI.TranslateListener
import java.awt.font.NumericShaper.TAMIL
import com.mannan.translateapi.Language.TAMIL as TAMIL


class Translate : AppCompatActivity() {
    lateinit var  translateAPI:TranslateAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)
        when(intent.getStringExtra(TranslationCodes.langCode)){
            "en" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.ENGLISH,
                    "This is in English"
                )
            }
            "hi" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.HINDI,
                    "This is in Hindi"
                )
            }
            "gu" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.GUJARATI,
                    "This is in Gujarati"
                )
            }
            "ta" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.TAMIL,
                    "This is in Tamil"
                )
            }
            "te" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.TELUGU,
                    "This is in Telugu"
                )
            }
            "ur" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.URDU,
                    "This is in Urdu"
                )
            }
            "bn" -> {
                translateAPI = TranslateAPI(

                    ENGLISH,  //Source Language
                    com.mannan.translateapi.Language.BENGALI,
                    "This is in Bengali"
                )
            }
        }


        val textView:TextView=findViewById(R.id.textView)
        translateAPI.setTranslateListener(object : TranslateListener {
            override fun onSuccess(translatedText: String) {
                Log.d(TAG, "onSuccess: $translatedText")
                textView.text="$translatedText"
            }

            override fun onFailure(ErrorText: String) {
                Log.d(TAG, "onFailure: $ErrorText")
            }
        })
    }
}