class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val listOpen = listOf( '(', '[', '{' )
        val listClosed = listOf( ')', ']' ,'}')

        s.forEach{ v -> 
            if(v in listOpen) {
              stack.push(v)
            }
            if(v in listClosed) {
                if(stack.isEmpty())
                    return false
                if( listClosed.indexOf(v) == listOpen.indexOf(stack.peek()) )
                    stack.pop()
                else
                    return false    
            }
        }
        if(!stack.isEmpty())
            return false
        return true
    }
}