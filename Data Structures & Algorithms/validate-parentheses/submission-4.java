class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(Character c: s.toCharArray()){
            if(c =='(' || c == '[' || c == '{' ){
                System.out.print(" add "+c);
                stack.push(c);
            } else if(c ==')' || c == ']' || c == '}' ){

                if(stack.isEmpty()){
                    return false;
                }
                Character p = stack.peek();
                if(p == '(' && c ==')'  || p == '{' && c =='}' || p == '[' && c ==']'){
                    System.out.print(" remove  "+c);
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
