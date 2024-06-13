class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineCopy = magazine.toMutableList()
        var result = false
        ransomNote.toList().forEach{ v ->
            if(magazineCopy.contains(v)) {
                result = true
                magazineCopy.remove(v)
            } else
                return false
        }
        return result
    }
}