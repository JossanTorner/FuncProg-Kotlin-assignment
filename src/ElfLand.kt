

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
    val ef = ElfLand()
    val list: MutableList<String> = mutableListOf()
    println(ef.getUnderlings("Tröger", ef.hierarchy, list))
}