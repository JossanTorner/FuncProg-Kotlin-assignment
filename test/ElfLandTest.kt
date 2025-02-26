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
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Bladlusen", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsTrögerTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Tröger", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsBlygerTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Blyger", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsDammråttanTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Dammråttan", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsGråsugganTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Gråsuggan", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsHarenTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Haren", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsNyckelpiganTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Nyckelpigan", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsRådjuretTest() {
        val list: List<String> = ArrayList()
        val underlings: List<String> = tl.getUnderlings("Rådjuret", list)
        assertEquals(underlings.size, 0)
    }

    @Test
    fun getUnderlingsMyranTest() {
        val list: List<String> = ArrayList()
        val underlings: MutableList<String> = tl.getUnderlings("Myran", list)
        assertEquals(underlings.size, uMyran.size)
        assertFalse(underlings.retainAll(uMyran))
    }

    @Test
    fun getUnderlingsRävenTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Räven", list)
        assertEquals(underlings.size, uRäven.size)
        assertFalse(underlings.retainAll(uRäven))
    }

    @Test
    fun getUnderlingsSkumtomtenTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Skumtomten", list)
        assertEquals(underlings.size, uSkumtomten.size)
        assertFalse(underlings.retainAll(uSkumtomten))
    }

    @Test
    fun getUnderlingsTrötterTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Trötter", list)
        assertEquals(underlings.size, uTrötter.size)
        assertFalse(underlings.retainAll(uTrötter))
    }


    @Test
    fun getUnderlingsButterTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Butter", list)
        assertEquals(underlings.size, uButter.size)
        assertFalse(underlings.retainAll(uButter))
    }

    @Test
    fun getUnderlingsGladerTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Glader", list)
        assertEquals(underlings.size, uGlader.size)
        assertFalse(underlings.retainAll(uGlader))
    }

    @Test
    fun getUnderlingsTomtenTest() {
        val list: List<String> = LinkedList()
        val underlings: MutableList<String> = tl.getUnderlings("Tomten", list)
        assertEquals(underlings.size, uTomten.size)
        assertFalse(underlings.retainAll(uTomten))
    }
 }