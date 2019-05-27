package com.example.layoutinflater

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

// Var olan xml alınıp ilgili xml e dönüştürülür.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inflater erişme çeşitleri
        var inflater=layoutInflater
        //var inflater2=LayoutInflater.from(this@MainActivity)
        //var inflater3=getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        /**
         * var view=inflater.inflate(R.layout.layout_text_view,null)
         * iceridekiLayout.addView(view)

         * view nesnesinde textview var
         * root null
         * layoutparams null
         *
         * Dönüştürdüğümüz view'ı bir viewgroupa eklediğimizde, eklenilen view layoutparams yani genişlik yükseklik oriantation gibi
         * değerleri root Layoutundan yani eklendiği parenttan alır.
         * rootLayout.addView(view)
         *
         * Log.e("INFLATION",""+view.parent)
         * Log.e("INFLATION",""+view.layoutParams)
         *
         */
        //var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout,true) aynı şey alttakinle
        //var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout)

        var view=inflater.inflate(R.layout.layout_text_view,iceridekiLayout,false)
        Log.e("INFLATION",""+view.parent) //null geldi
        Log.e("INFLATION",""+view.layoutParams) //lineear Layout

        iceridekiLayout.addView(view)
    }
}
