class Adresse  {
    var rue = ""
    var ville = ""
    var codePostal = 0

    constructor()
    constructor(rue: String, ville: String, codePostal: Int) {
        this.rue = rue
        this.ville = ville
        this.codePostal = codePostal
    }

    override fun toString(adresse: Adresse): String {
        return "Personne(nom='$rue', taille=$ville, poids=$codePostal)"
    }
}