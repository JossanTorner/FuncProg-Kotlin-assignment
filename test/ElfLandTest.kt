import org.junit.jupiter.api.Assertions.*
import java.util.*

import org.junit.jupiter.api.Test


class ElfLandTest{


    var tl: ElfLand = ElfLand()


    var uTomten: List<String> = mutableListOf(
        "Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
        "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"
    )
    var uGlader: List<String> = mutableListOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")
    var uButter: List<String> = mutableListOf(
        "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
        "Bladlusen"
    )
    var uTrötter: List<String> = mutableListOf("Dammråttan", "Skumtomten")
    var uSkumtomten: List<String> = mutableListOf("Dammråttan")
    var uRäven: List<String> = mutableListOf("Gråsuggan", "Myran", "Bladlusen")
    var uMyran: List<String> = mutableListOf("Bladlusen")


    @Test
    fun getUnderlingsBladlusenTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Bladlusen", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsTrögerTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Tröger", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsBlygerTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Blyger", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsDammråttanTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Dammråttan", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsGråsugganTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Gråsuggan", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsHarenTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Haren", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsNyckelpiganTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Nyckelpigan", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsRådjuretTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Rådjuret", tl.hierarchy, list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsMyranTest() {
        val list: MutableList<String> = ArrayList()
        val underlings: MutableList<String> = tl.getUnderlings("Myran", tl.hierarchy, list)
        assertEquals(underlings.size, uMyran.size)
        assertFalse(underlings.retainAll(uMyran))
    }

    @Test
    fun getUnderlingsRävenTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Räven", tl.hierarchy, list)
        assertEquals(underlings.size, uRäven.size)
        assertFalse(underlings.retainAll(uRäven))
    }

    @Test
    fun getUnderlingsSkumtomtenTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Skumtomten", tl.hierarchy, list)
        assertEquals(underlings.size, uSkumtomten.size)
        assertFalse(underlings.retainAll(uSkumtomten))
    }

    @Test
    fun getUnderlingsTrötterTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Trötter", tl.hierarchy, list)
        assertEquals(underlings.size, uTrötter.size)
        assertFalse(underlings.retainAll(uTrötter))
    }


    @Test
    fun getUnderlingsButterTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Butter", tl.hierarchy, list)
        assertEquals(underlings.size, uButter.size)
        assertFalse(underlings.retainAll(uButter))
    }

    @Test
    fun getUnderlingsGladerTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Glader", tl.hierarchy, list)
        assertEquals(underlings.size, uGlader.size)
        assertFalse(underlings.retainAll(uGlader))
    }

    @Test
    fun getUnderlingsTomtenTest() {
        val list: MutableList<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Tomten", tl.hierarchy, list)
        assertEquals(underlings.size, uTomten.size)
        assertFalse(underlings.retainAll(uTomten))
    }
 }