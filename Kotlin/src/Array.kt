val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
        "Uranus", "Neptune")


fun elements () {
    println(planetes.first())
    println(planetes.last())

    println(planetes[0])
    println(planetes[7])
}

fun indexTerre () {
    val item = "terre"
    val index = planetes.indexOf(item)
    println(index)
}

fun filter () {

    val filterPlanete = (planetes.filter { it.uppercase().startsWith(char = 'm')})
    println(filterPlanete)
}

fun main () {
    elements()
    indexTerre()
    filter()
}


