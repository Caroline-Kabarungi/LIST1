fun main() {
    var fix= numb(listOf("Mark","Elizabeth","Jackline","katrinah","Joy","Kate","Hellen","Tom","Unice","Ingrid"))
    println(fix)
    var z=people(listOf(1,34,5,45,33,3))
    println(z)
    var y=person("Betty",23,45,74F)
    var f=person("Carol",12,45,67F)
    var all= listOf(y.age,f.age,)
    var sorted=all.sortedDescending()
    println(sorted)
    var track=car("Ug 237",500.0)
    var toyota=car("Ky 235",490.0)
    var matatu=car("Nj2600",500.0)
    println( good(listOf(track,toyota,matatu)))


}
fun numb(names:List<String>):List<String> {
    var themList= mutableListOf<String>()
    names.forEachIndexed { index, i ->
        if (index % 2 == 0)
            themList.add(i)
    }
    return themList
}
fun people(persons:List<Int>):String{
    var y=persons.average()
    var x=persons.sum()
    var v="average is $y the sum is $x"
    return v
}
class person(var name:String,var age:Int,var height:Int, var weight:Float)

data class car(var registration:String,var mileage:Double)
fun good(taikunz:List<car>):Double{
    var sum=0.0
    var x=taikunz.count()
    var t=taikunz.forEach{e->
        sum+=e.mileage

    }
    return sum/x
}
