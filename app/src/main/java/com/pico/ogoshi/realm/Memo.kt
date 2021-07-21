package com.pico.ogoshi.realm

import io.realm.RealmObject

open class Memo (
    open var title:String = "",
    open var content:String = "",
    open var sae:String="haa" 
):RealmObject()

