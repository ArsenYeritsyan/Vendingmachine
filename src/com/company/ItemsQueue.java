package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ItemsQueue {
    private Item item;
    private Queue<Item> itemQueue = new LinkedList<>();

    public ItemsQueue(Item item) {
        this.item = item;
        for (int i = 0; i < 10; i++) {
            itemQueue.add(item);
        }
    }

    void removeFirst() {
        itemQueue.remove();
    }

    int getProductCountity() {
        return itemQueue.size();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LinkedList<Item> getItemQueue() {
        return ( LinkedList<Item> ) itemQueue;
    }

    public void setItemQueue(LinkedList<Item> itemQueue) {
        this.itemQueue = itemQueue;
    }

}
