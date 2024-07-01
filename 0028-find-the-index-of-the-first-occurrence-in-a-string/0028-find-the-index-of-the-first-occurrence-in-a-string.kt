class Solution {
    // function indexOf() can solve that
    fun strStr(haystack: String, needle: String): Int {
        if(!haystack.contains(needle))
            return -1
        if(haystack == needle)
            return 0
        for(i in haystack.indices) {
            val symbol = haystack[i]
            if(needle.startsWith(symbol)) {
                val endIndex = i + needle.length
                if(endIndex > haystack.length)
                    return -1
                val substring = haystack.substring(i, endIndex)
                if(needle == substring)
                    return i
            }
        }
        return -1
    }
}