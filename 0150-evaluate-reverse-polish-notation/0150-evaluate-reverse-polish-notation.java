class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
            String str = tokens[i];
            if(str.matches("-?\\d+")){
                stack.push(str);
            }else{
                int second =Integer.valueOf(stack.pop());
                int first = Integer.valueOf(stack.pop());
                int res = 0;
                if(str.equals("+")){
                    res = first + second;
                } else if(str.equals("-")){
                    res = first - second;
                } else if(str.equals("*")){
                    res = first * second;
                } else if(str.equals("/")){
                    res = first / second;
                }
                
                stack.push(Integer.toString(res));
            }
        }
        return Integer.parseInt(stack.pop());
        
    }
}