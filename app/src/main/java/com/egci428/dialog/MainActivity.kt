package com.egci428.dialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.core.SearchResultListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchBtn.setOnClickListener{
            SimpleSearchDialogCompat(this@MainActivity,"Search","What are you looking for..?",null,initStat(), SearchResultListener{baseSearchDialogCompat, item, position ->
                Toast.makeText(this@MainActivity,item.title,Toast.LENGTH_LONG).show()
                baseSearchDialogCompat.dismiss()
            }).show()
        }
    }

    private fun initStat(): ArrayList<searchModel> {
        val item = ArrayList<searchModel>()

        item.add(searchModel("kai kak"))
        item.add(searchModel("top kak"))
        item.add(searchModel("big kak"))
        item.add(searchModel("praew kak"))
        item.add(searchModel("jj kak"))
        item.add(searchModel("jif kak"))
        item.add(searchModel("toei kak"))
        return item
    }
}
