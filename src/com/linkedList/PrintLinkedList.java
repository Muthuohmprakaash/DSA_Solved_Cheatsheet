package com.linkedList;

public class PrintLinkedList {
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5};
        Node31 head = createLinkedList(arr);
        int[] printLL = printLL(head);
        for(int i =0 ;i<printLL.length;i++){
            System.out.println(printLL[i]);
        }

        // while(head != null){
        //     System.out.println(head.val);
        //     head = head.next;
        // }

        
    
    }
    public static int[] printLL(Node31 head){
        Node31 temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int ans[] = new int[count];
        Node31 temp2 = head;
        int i =0;
        while(temp2 !=null){
            ans[i] = temp2.val;
            temp2 = temp2.next;
            i++;
        }
        return ans;
    }
    public static Node31 createLinkedList(int[] arr){
        Node31 head = new Node31(arr[0]);
        Node31 mover = head;

        for(int i =1;i<arr.length;i++){
            mover.next = new Node31(arr[i]);  
            mover= mover.next;                                                                                                                                                                                                   
        }
        return head;
    }
}
class Node31{
    int val;
    Node31 next;

    public Node31(int val , Node31 next){
        this.next = next;
        this.val = val;
    }
    public Node31(int val){
        this.val = val;
    }

    
}
