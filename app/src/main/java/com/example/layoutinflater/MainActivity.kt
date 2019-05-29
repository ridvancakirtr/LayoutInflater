package com.example.layoutinflater

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

// Var olan xml alınıp ilgili view e dönüştürülür.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Inflater Oluşturma Çeşitleri
        var inflater = layoutInflater
        //var inflater2=LayoutInflater.from(this@MainActivity)
        //var inflater3=getSystemService(Context.LAYOUT_INFLATER_SERVICE)

        //Geriye View Döndürür
        //var view=inflater.inflate(R.layout.layout_text_view,null)
        //rootLayout.addView(view) //root Layouta Ekledik ve root layoutun tüm özelliklerini kullanır yüksekli ve uzunluk değerleri gibi
        //iceridekiLayout.addView(view) // textview alıp bunun içene yapıştırmışız anlamına gelir. Burada İcerik layoutun tüm özelliklerini alır

        //Log.e("INFLATION", ""+view.parent) //rootLayout
        //Log.e("INFLATION", ""+view.layoutParams) //frameLayout | Framelayoutun özelliklerini tuttar. Genişlik Yükseklik Oriantation gibi.

        //---------------------

        //var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout)  -> Aynı
        //var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout,true)  -> Aynı


        var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout,false)
        //bu şekilde yaptığım zaman içinde linear layout yok sadece text_view mevcut
        Log.e("INFLATION", ""+view.parent) // null
        Log.e("INFLATION", ""+view.layoutParams) //linear layout

        iceridekiLayout.addView(view)  // layout_text_view si elle eklemek için kullanırız

    }
}
