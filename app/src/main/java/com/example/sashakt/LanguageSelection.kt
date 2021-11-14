package com.example.sashakt//package com.example.sashakt
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.sashakt.TranslationCodes.langCode
//import com.example.sashakt.databinding.ActivityLanguageSelectionBinding
//
//class LanguageSelection : AppCompatActivity() {
//    private var binding:ActivityLanguageSelectionBinding?=null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding= ActivityLanguageSelectionBinding.inflate(layoutInflater)
//        setContentView(binding?.root)
//        binding?.English?.setOnClickListener {
//            langCode="en"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Hindi?.setOnClickListener {
//            langCode="hi"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Bengali?.setOnClickListener {
//            langCode="bn"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Urdu?.setOnClickListener {
//            langCode="ur"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Telugu?.setOnClickListener {
//            langCode="te"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Tamil?.setOnClickListener {
//            langCode="ta"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//        binding?.Gujarati?.setOnClickListener {
//            langCode="gu"
//            val intent= Intent(this, Translate::class.java)
//            intent.putExtra(TranslationCodes.langCode, langCode)
//            startActivity(intent)
//        }
//    }
//
//
//
//    override fun onDestroy() {
//        super.onDestroy()
//        binding=null
//    }
//}