/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:

    


    ListNode* reverseList(ListNode* head) {

        ListNode* curr = head;
        ListNode* prev = NULL;
       
        while( curr != NULL){
             ListNode* forward = curr -> next;

        curr -> next = prev; // making the next pointer of the curr node point to the prev node
        prev = curr; // setting previous to current value
        

        curr = forward;

        }
        return prev;
        
    }
};
