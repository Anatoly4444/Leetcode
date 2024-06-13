class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s == "" || t.contains(s))
            return true   
        val sLength = s.length
        var c = 0
        val result = StringBuilder()
        t.forEachIndexed { i ,v ->
            if( c >= sLength)
                return result.toString() == s
            if( v == s[c] ) {
                result.append(v)
                c++
            }
        }
        return result.toString() == s
    }
}