//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    elements()
    indexTerre()
    filter()

    val p1 = Personne("lulu",1.80, 70.0)
    println(p1.IMC())
    println(p1.classement())

    prixTotal("Citadine", "Essence", 5)
}