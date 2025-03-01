

class ElfLand{

    val hierarchy = mutableMapOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Trötter", "Tröger", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    fun getUnderlings(currentName : String, hierarchy : Map<String, List<String>>, result : MutableList<String>) : MutableList<String> {

        tailrec fun loop(result: MutableList<String>, index: Int): MutableList<String> {
            if (index == result.size) return result
            hierarchy[result[index]]?.let { result.addAll(it) }
            return loop(result, index + 1)
        }

        hierarchy[currentName]?.let { result.addAll(it) }
        return loop(result, 0)
    }

}

fun main() {

    //Exempel på anrop till den rekursiva funktionen getUnderlings,
    // här är tanken att hitta Tröger underlydande
    //listan fylls på successivt när vi rekurserar
    val ef = ElfLand()

    var list: MutableList<String> = mutableListOf()
    println(ef.getUnderlings("Tomten", ef.hierarchy, list))
}


//fun getUnderlingsD(currentName : String, hierarchy : Map<String, List<String>>, result : MutableList<String>) : MutableList<String> {
//
//    tailrec fun loop(result: MutableList<String>, index: Int): MutableList<String> {
//        if (index == result.size) return result
//        // det jag gjorde fel var att jag försökte lägga till från hierarkin med currentname
////        result.addAll(hierarchy[currentName]!!)
//        // när jag egentligen borde plockat ut namnen som lagts in i result med hjälp av index, sätta in det i hierarkin,
//        // därefter adderat de underliggande underlings till det namnet
//        hierarchy[result[index]]?.let { result.addAll(it) } // varv 1: plockar ut glader och lägger till --- trötter, tröger och blyger
//                                                            // varv 2: plockar ut butter och lägger till --- "Rådjuret", "Nyckelpigan", "Haren", "Räven"
//                                                            // varv 3: plockar ut trötter --- lägger till skumtomten
//                                                            // varv 4: plockar ut tröger, hittar inget
//                                                            // varv 5: plockar ut bluger, hittar inget
//                                                            // varv 6: plockar ut rådjuret, hittar inget
//                                                            // varv 7: plockar ut nyckelpigan, hittar inget
//                                                            // varv 8: plockar ut haren, hittar inget
//                                                            // varv 9: plockar ut räven --- lägger till "Gråsuggan", "Myran"
//                                                            // varv 10: plockar ut skumtomten --- lägger till dammråttan
//                                                            // varv 11: plockar ut gråsuggan, hittar inget
//                                                            // varv 12: plockar ut myran --- lägger till bladlusen
//                                                            // varv 13: plockar ut dammråttan, hittar inget
//        return loop(result, index + 1)
//    }
//    result.addAll(hierarchy[currentName]!!) // lägger till de första underlings till tomten, glader och butter
//    return loop(result, 0)
//}