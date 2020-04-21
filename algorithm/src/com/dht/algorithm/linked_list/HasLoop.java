package com.dht.algorithm.linked_list;

/**
 * @Author: dht
 */

import java.util.HashMap;

/**
 * 链表中环的检测
 */
public class HasLoop {

    /**
     * 快慢指针检测链表中是否有环
     *
     * @param node
     * @return
     */
    public boolean hasLoopV1(Node node) {
        // 边接处理
        if (node == null) {
            return false;
        }

        // 快慢指针
        Node slow = node;
        Node fast = node.next;

        // 相当于两个人跑步，一个人跑的快，一个人跑的慢，如果有环，总有一刻两人会相会
        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == null) {
                return false;
            } else if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 足迹法检测链表是否有环
     *
     * @param node
     * @return
     */
    public boolean hasLoopV2(Node node) {
        if (node == null || node.next == null) {
            return false;
        }
        // 保存所有节点
        HashMap<Node, Object> nodeMap = new HashMap();
        while (node.next != null) {
            if (nodeMap.containsKey(node)) {
                return true;
            }
            nodeMap.put(node, null);
            node = node.next;
        }
        return false;
    }


}
