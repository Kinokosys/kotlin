class Personnes {
        var nom = ""
        var taille = 0.0
        var poids = 0

        constructor()
        constructor(nom: String, taille: Double, poids: Int) {
            this.nom = nom
            this.taille = taille
            this.poids = poids
        }
        override fun toString(personne: Personnes): String {
            return "Personne(nom='$nom', taille=$taille, poids=$poids)"
        }

        var lesPersonnes = mutableListOf<Personnes>()
    }