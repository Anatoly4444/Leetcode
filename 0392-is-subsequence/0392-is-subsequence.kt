class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if(s == "" || t.contains(s))
            return true   
        val sLength = s.length
        var c = 0
        val result = StringBuilder()
        loop@ for(v in t) {
            if( v == s[c] ) {
                result.append(v)
                c++
            }
            if( c == sLength)
                break@loop
        }
        return result.toString() == s
    }
}