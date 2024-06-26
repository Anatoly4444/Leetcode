class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
        val map = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<Char, Int>()
        for(i in s.indices) {
            map.compute(s[i]) { _,v -> if(v == null) 1 else v + 1}
            map2.compute(t[i]) { _,v -> if(v == null) 1 else v + 1}
        }
        for(i in map) {
            if(i.value != map2.get(i.key))
                return false
        }
        return true
    }
}