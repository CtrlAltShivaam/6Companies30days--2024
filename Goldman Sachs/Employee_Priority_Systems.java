import java.util.*;

class Employee_Priority_Systems{
    public static void main(String[] args) {
        List<List<String>> access_times = List.of(
                List.of("d", "0002"),
                List.of("c", "0808"),
                List.of("c", "0829"),
                List.of("e", "0215"),
                List.of("d", "1508"),
                List.of("d", "1444"),
                List.of("d", "1410"),
                List.of("c", "0809")
        );
        List<List<String>> access_times1 = List.of(
                List.of("Shivam", "1025"),
                List.of("ab", "1025"),
                List.of("Shivam", "1046"),
                List.of("Shivam", "1055"),
                List.of("ab", "1124"),
                List.of("ab", "1120")
        );
        Solution1 obj = new Solution1();
        List<String> ans = obj.findHighAccessEmployees(access_times1);
        System.out.println(ans);
    }
}

class Solution1 {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for(List<String> curr: access_times){
            String emp= curr.get(0);
            String Time = curr.get(1);

            if(!map.containsKey(emp)) map.put(emp,new ArrayList<>());

            int t=Integer.parseInt(Time);
            map.get(emp).add(t);
        }

        for(String emp: map.keySet()){
            List<Integer> times = map.get(emp);
            Collections.sort(times);
            if(isHighAccess(times)){
                ans.add(emp);
            }
        }
        return ans;
    }
    private boolean isHighAccess(List<Integer> times){
        int n= times.size();
        for(int i=2;i<n;i++){
            int currTime = times.get(i);
            int prevPrev = times.get(i-2);
            if(prevPrev+ 99>= currTime) return true;
        }
        return false;
    }
}