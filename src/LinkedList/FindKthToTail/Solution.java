package LinkedList.FindKthToTail;


import CommonDataStructure.ListNode;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 */

public class Solution {
    /**
     * My solution:
     * By using a limited sized queue ( ArrayBlockingQueue)
     *
     */
//    public ListNode FindKthToTail(ListNode head,int k) {
//        if(k < 1) return null;
//        int counter = 0;    //count the number of nodes in the queue;
//        ArrayBlockingQueue<ListNode> abQueue = new ArrayBlockingQueue<ListNode>(k);
//        ListNode currentNode = head;
//        while(currentNode != null){
//            if(!abQueue.offer(currentNode)){
//                abQueue.poll();
//                abQueue.offer(currentNode);
//            }
//            currentNode = currentNode.next;
//        }
//        if(abQueue.size() == k)
//            return abQueue.peek();
//        else
//            return null;
//    }

    /**
     * Better solution: using two pointers;
     */
    public ListNode FindKthToTail(ListNode head, int k){

        ListNode preNode = head;
        ListNode laterNode = head;
        int counter = 0;
        while(laterNode != null) {
            if(counter < k)
                counter ++;
            else
                preNode = preNode.next;
            laterNode = laterNode.next;
        }

        return counter < k ? null : preNode;

    }
}
