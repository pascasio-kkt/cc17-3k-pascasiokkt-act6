package com.example.a30dayspetcareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf(
            Tip(R.drawable.image_1, getString(R.string.D1), getString(R.string.Tip1)),
            Tip(R.drawable.image_2, getString(R.string.D2), getString(R.string.Tip2)),
            Tip(R.drawable.image_3, getString(R.string.D3), getString(R.string.Tip3)),
            Tip(R.drawable.image_4, getString(R.string.D4), getString(R.string.Tip4)),
            Tip(R.drawable.image_5, getString(R.string.D5), getString(R.string.Tip5)),
            Tip(R.drawable.image_6, getString(R.string.D6), getString(R.string.Tip6)),
            Tip(R.drawable.image_7, getString(R.string.D7), getString(R.string.Tip7)),
            Tip(R.drawable.image_8, getString(R.string.D8), getString(R.string.Tip8)),
            Tip(R.drawable.image_9, getString(R.string.D9), getString(R.string.Tip9)),
            Tip(R.drawable.image_10, getString(R.string.D10), getString(R.string.Tip10)),
            Tip(R.drawable.image_11, getString(R.string.D11), getString(R.string.Tip11)),
            Tip(R.drawable.image_12, getString(R.string.D12), getString(R.string.Tip12)),
            Tip(R.drawable.image_13, getString(R.string.D13), getString(R.string.Tip13)),
            Tip(R.drawable.image_14, getString(R.string.D14), getString(R.string.Tip14)),
            Tip(R.drawable.image_15, getString(R.string.D15), getString(R.string.Tip15)),
            Tip(R.drawable.image_16, getString(R.string.D16), getString(R.string.Tip16)),
            Tip(R.drawable.image_17, getString(R.string.D17), getString(R.string.Tip17)),
            Tip(R.drawable.iamge_18, getString(R.string.D18), getString(R.string.Tip18)),
            Tip(R.drawable.image_19, getString(R.string.D19), getString(R.string.Tip19)),
            Tip(R.drawable.image_20, getString(R.string.D20), getString(R.string.Tip20)),
            Tip(R.drawable.image_21, getString(R.string.D21), getString(R.string.Tip21)),
            Tip(R.drawable.image_22, getString(R.string.D22), getString(R.string.Tip22)),
            Tip(R.drawable.image_23, getString(R.string.D23), getString(R.string.Tip23)),
            Tip(R.drawable.image_24, getString(R.string.D24), getString(R.string.Tip24)),
            Tip(R.drawable.image_25, getString(R.string.D25), getString(R.string.Tip25)),
            Tip(R.drawable.image_26, getString(R.string.D26), getString(R.string.Tip26)),
            Tip(R.drawable.image_27, getString(R.string.D27), getString(R.string.Tip27)),
            Tip(R.drawable.image_28, getString(R.string.D28), getString(R.string.Tip28)),
            Tip(R.drawable.image_29, getString(R.string.D29), getString(R.string.Tip29)),
            Tip(R.drawable.image_30, getString(R.string.D30), getString(R.string.Tip30)),
        )

        val adapter = TipAdapter(itemList)
        recyclerView.adapter = adapter
    }
}

