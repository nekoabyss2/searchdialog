package com.egci428.dialog

import ir.mirrajabi.searchdialog.core.Searchable

/**
 * Created by 6272user on 10/10/2017 AD.
 */
 class searchModel(private var mTitle:String?):Searchable
{
    override fun getTitle(): String{
        return mTitle!!
    }
}