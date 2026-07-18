class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<>();
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
            word=word+s.charAt(i);

        }else{
       
        if(!word.isEmpty()){
            stack.push(word);
            word="";
        }
        
    }
}

        if (!word.isEmpty()) {
            stack.push(word);
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {

            ans.append(stack.pop());

            if (!stack.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
