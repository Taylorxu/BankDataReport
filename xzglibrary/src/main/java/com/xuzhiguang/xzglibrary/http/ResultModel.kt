package com.xuzhiguang.xzglibrary.http

/**
 * Created by 徐志广 on 2018/4/13.
 */
data class ResultModel<T>(val status:Int,val message:String ,var data:T )