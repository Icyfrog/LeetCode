import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /*HashMap<Integer,Integer> map = new HashMap();

        map.put(1,100);

        map.put(2,200);

        map.put(1,300);

        System.out.println(map.containsValue(100));
*/
        int[] nums={5,5,3,3,5};
        int target = 6;
        int[] res = new int[2];
        int size = nums.length;
        HashMap<Integer, Integer> hash_map = new HashMap();
        for (int i = 0; i < size; i++) {
            hash_map.put(nums[i], i);
        }
        for (int i = 0; i < size; i++) {
            int b = target - nums[i];
            if (hash_map.containsKey(b) && i != hash_map.get(b)) {
                res[0] = i;
                res[1] = hash_map.get(b);
                break;
            }
        }

        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
