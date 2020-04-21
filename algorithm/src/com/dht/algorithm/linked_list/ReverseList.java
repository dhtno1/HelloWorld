package com.dht.algorithm.linked_list;

/**
 * @Author: dht
 */

/**
 * 链表反转可以理解成三个指针在一个链表上向右进行平移操作链表的指针
 * 参考链接：https://www.javazhiyin.com/32787.html
 */
public class ReverseList {

    public Node reverseList(Node currentNode) {
        // 判空
        if (currentNode == null || currentNode.next == null) {
            return currentNode;
        }

        // 思考下，我们需要三个指针去反转这个链表，分别指向前一node、当前node和下一个node
        Node preNode = null;
        Node nextNode = null;

        while (currentNode != null) {
            // 第一步：记录三个指针node(其他两个指针已经记录好)
            nextNode = currentNode.next;

            // 第二步： 进行反转，当前node指上一个node
            currentNode.next = preNode;

            // 第三步： 当前node指向上一个Node
            preNode = currentNode;

            // 第四步：当前node指向
            currentNode = nextNode;
        }
        return preNode;
    }

}
