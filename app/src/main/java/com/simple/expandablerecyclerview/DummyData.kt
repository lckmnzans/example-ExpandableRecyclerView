package com.simple.expandablerecyclerview

object DummyData {
    private val parentData: Array<String> = arrayOf("Vegetable", "Fruit", "Grain", "Poultry")
    private val childDataData1: MutableList<ChildData> = mutableListOf(
        ChildData("Artichoke"),
        ChildData("Broccoli"),
        ChildData("Cabbage")
    )
    private val childDataData2: MutableList<ChildData> = mutableListOf(
        ChildData("Apple"),
        ChildData("Banana"),
        ChildData("Cherry"),
        ChildData("Dragon Fruit")
    )
    private val childDataData3: MutableList<ChildData> = mutableListOf(
        ChildData("Oats"),
        ChildData("Rice")
    )

    private val parentObj1 = ParentData(parentTitle = parentData[0], subList = childDataData1)
    private val parentObj2 = ParentData(parentTitle = parentData[1], subList = childDataData2)
    private val parentObj3 = ParentData(parentTitle = parentData[2])
    private val parentObj4 = ParentData(parentTitle = parentData[3], subList = childDataData3)

    val dummyData = ArrayList<ParentData>().apply {
        add(parentObj1)
        add(parentObj2)
        add(parentObj3)
        add(parentObj4)
    }
}