package LinkedList.Merge2LinkedList;


import CommonDataStructure.ListNode;

/**
 * 题目描述
 * 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution {

    /**
     * 非递归版本
     * @param list1
     * @param list2
     * @return
     */

//    public ListNode Merge(ListNode list1, ListNode list2) {
//        ListNode head, prev;
//        if(list1 == null)
//            return list2;
//        if(list2 == null)
//            return list1;
//        if(list1.val <= list2.val){
//            head = list1;
//            list1 = list1.next;
//        }else {
//            head = list2;
//            list2 = list2.next;
//        }
//        prev = head;
//        while(list1 != null && list2 != null){
//            if(list1.val <= list2.val){
//                prev.next = list1;
//                prev = list1;
//                list1 = list1.next;
//            }else{
//                prev.next = list2;
//                prev = list2;
//                list2 = list2.next;
//            }
//        }
//        prev.next = (list1 == null)? list2: list1;
//        return head;
//    }


    /**
     * 递归版本
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2){

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else {
            list2.next = Merge(list2.next, list2);
            return list2;
        }
    }


}
