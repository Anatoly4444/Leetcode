class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minLength = strs.minOf { it.length }
        if(minLength == 0)
            return ""
        val builder  = StringBuilder()
        for(i in 0..< minLength) {
            val e1 = strs.get(0).get(i)
            val allMatch = strs.asSequence().all { it.get(i) == e1 }
            if(allMatch)
                builder.append(e1)
            else
                break
        }
        return builder.toString()
    }
}