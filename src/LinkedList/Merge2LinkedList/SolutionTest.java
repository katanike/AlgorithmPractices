package com.company.steve.Merge2LinkedList;

import com.company.steve.CommonDataStructure.ListNode;

public class SolutionTest {

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        node1.next = node3;
        node3.next = node5;
        node5.next = node7;
        node2.next = node4;
        node4.next = node6;
        node6.next = node8;

        Solution solution = new Solution();
        System.out.println(solution.Merge(node1, node2).val);



    }






}
