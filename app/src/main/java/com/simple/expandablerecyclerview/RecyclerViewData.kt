package com.simple.expandablerecyclerview

data class ParentData(
    val parentTitle: String? = null,
    var type: Int = Constants.PARENT,
    var subList: MutableList<ChildData> = ArrayList(),
    var isExpanded: Boolean = false
)

data class ChildData(val childTitle: String)