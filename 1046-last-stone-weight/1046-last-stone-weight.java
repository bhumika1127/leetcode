class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            q.add(i);
        }
        while(q.size()>1){
            int y=q.remove();
            int x=q.remove();
            int dif=y-x;
            if (dif!=0){
                q.add(dif);
            }
        }
        if(q.size()==0){
            return 0;
        }
        return q.peek();
    }
}