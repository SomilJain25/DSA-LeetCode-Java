//Problem:  Group the People Given the Group Size They Belong To
//Link:
https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/
// Medium Level
//Approach: using HashMap;
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap <Integer,List<Integer>> map =new HashMap <>();
        List<List<Integer>> list=new ArrayList <>();

        for(int i=0; i<groupSizes.length; i++){
            int size=groupSizes[i];
            map.putIfAbsent(size,new ArrayList<>());
            map.get(size).add(i);

            if(map.get(size).size()==size){
                list.add(new ArrayList <>(map.get(size)));
                map.get(size).clear();
            }
        }
        return list;
    }
}
