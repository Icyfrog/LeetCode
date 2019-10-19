*/
class Solution {
    
    public int getListVal(ListNode l, int index, int sum) {
        if (l.next == null) {
            return sum + l.val;
        }
        else {
            sum = sum + l.val * index ;
            index = index * 10;
            return getListVal(l.next,index,sum);
        }
    }
    
    public int getWeiShu(int val) {
        int n = 0;
        while (val>0) {
            n++;
                        val = val / 10;
        }
        return n;
    }
    
    public ListNode valToListNode(int val) {
        int n = getWeiShu(val);
        if(n==1) {
            ListNode ss = new ListNode(val);
            return ss;
        }
        else {
            int this_num = val/(10^n);
            ListNode this_node = new ListNode(this_num);
            ListNode last_node = new ListNode(val - this_num*(10^n));
            last_node.next = this_node;
            return last_node;
                
        }
        
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = getListVal(l1,1,0);
        int num2 = getListVal(l2,1,0);
        return valToListNode(num1+num2);
    }
}