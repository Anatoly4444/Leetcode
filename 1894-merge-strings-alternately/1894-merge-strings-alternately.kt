class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val length = if(word1.length > word2.length) word1.length else word2.length
        val builder = StringBuilder(word1.length + word2.length)
        for(i in 0..<length) { 
            val w1 = word1.getOrNull(i)
            if(w1 != null)
                builder.append(w1)
            val w2 = word2.getOrNull(i)
            if(w2 != null)
                builder.append(w2)
        }
        return builder.toString()
    }
}