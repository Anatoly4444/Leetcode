class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = s.indices.associateBy({ s[it] }, { t[it] })  
        val map2 = t.indices.associateBy({ t[it] }, { s[it] })
        
        for(i in s.indices) {
            if(map.get(s[i]) != t[i] || map2.get(t[i]) != s[i])
                return false
        }
        return true
    }
}