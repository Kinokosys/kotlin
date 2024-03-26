import java.util.Scanner
class Personne {
    var nom = ""
    var taille = 0.0
    var poids = 0.0

    constructor(nom: String, taille: Double, poids: Double) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }

    fun IMC(): Double = this.poids / (this.taille * this.taille)

    fun classement(): String {
        var res: String = ""
        if (this.IMC() < 18.5) {
            res = "Poids inférieur à la normale."
        } else if (this.IMC() < 24.9) {
            res = "Poids normal."
        } else if (this.IMC() < 29.9) {
            res = "Surpoids."
        } else {
            res = "Obesite."
        }
        return res
    }
}

