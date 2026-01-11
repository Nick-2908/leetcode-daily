class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int []answer=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=n-1;i>=0;i--){
            int curr=temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]<=curr){
                stack.pop();
            }
            answer[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return answer;

    }
}

//very much similar to nextGreaterElement.java