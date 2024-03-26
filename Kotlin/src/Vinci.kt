fun prixTotal(type: String, carburant: String, km: Int) {
    var pT: Double = when (type) {
        "Citadine" -> 80.0
        "Berline" -> 100.0
        "Sportive" -> 130.0
        else -> 0.0
    }

    var pC: Double = if (carburant == "Essence") 1.93 else if (carburant == "Diesel") 1.89 else 0.0

    var pTotal: Double = pT + pC * km

    fun main() {
        prixTotal("Citadine", "Essence", 5)
    }
}

