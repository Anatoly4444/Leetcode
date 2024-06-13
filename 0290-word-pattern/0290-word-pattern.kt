class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        val numbersOfPattern = mutableListOf<Int>()
        val numbersOfWords = mutableListOf<Int>()
        val map1 = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<String, Int>()
        var counter = 0
        pattern.forEach{v ->
            map1.putIfAbsent(v, counter++)
            map1.get(v)?.let { numbersOfPattern.add(it) }
        }
        counter = 0
        words.forEach{v ->
            map2.putIfAbsent(v, counter++)
            map2.get(v)?.let { numbersOfWords.add(it) }
        }
        return arrayOf(numbersOfPattern).contentDeepEquals(arrayOf(numbersOfWords))
    }
}