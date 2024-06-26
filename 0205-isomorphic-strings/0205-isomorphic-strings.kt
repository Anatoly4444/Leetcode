class Solution {
fun isIsomorphic(s: String, t: String): Boolean {
    val map = HashMap<Char, Char>()
    val map2 = HashMap<Char, Char>()
    for (i in s.indices) {
        map.put(s[i], t[i])
        map2.put(t[i], s[i])
    }
    for(i in s.indices) {
        if(map.get(s[i]) != t[i])
            return false
        if(map2.get(t[i]) != s[i])
            return false    
    }
    return true
}
}