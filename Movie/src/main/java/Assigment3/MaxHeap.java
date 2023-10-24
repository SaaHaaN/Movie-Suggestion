package Assigment3;


public class MaxHeap<T extends Comparable<T>> {

    T[] heap;
    int size;

    public MaxHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    int parent(int idx) {
        return (idx - 1) / 2;
    }

    void swap(int idx_1, int idx_2) {
        T temp = heap[idx_1];
        heap[idx_1] = heap[idx_2];
        heap[idx_2] = temp;
    }

    void insert(T data) {
        if (size < heap.length) {
            heap[size] = data;
            int current = size++;

            while (heap[current].compareTo(heap[parent(current)]) > 0) {
                swap(current, parent(current));
                current = parent(current);
            }
        } else {
            System.out.println("Heap is full!");
        }
    }

    void deleteAll() {
        size = 0;
    }
    
    void topDownHeapify(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int max = idx;

        if (left < size && heap[left].compareTo(heap[max]) > 0) {
            max = left;
        }
        if (right < size && heap[right].compareTo(heap[max]) > 0) {
            max = right;
        }
        if (max != idx) {
            swap(max, idx);
            topDownHeapify(max);
        }
    }
    
    T getMax() {
        return heap[0];
    }

    T deleteMax() {
        T deletedNode = heap[0];
        heap[0] = heap[size - 1];
        size--;
        topDownHeapify(0);
        return deletedNode;
    }

    void decreaseKey(int key, int amount) {
        for (int i = 0; i < size; i++) {
            if (heap[i].equals(key)) {
                heap[i] = (T) Integer.valueOf(key - amount);
                
                while (heap[i].compareTo(heap[parent(i)]) > 0) {
                    swap(i, parent(i));
                    i = parent(i);
                }
                return;
            }
        }
    }
    
    void increaseKey(int key, int amount) {
        for (int i = 0; i < size; i++) {
            if (heap[i].equals(key)) {
                heap[i] = (T) Integer.valueOf(key + amount);
                topDownHeapify(i);
                return;
            }
        }
    }

    void print() {
        for (int i = 0; i <= parent(size - 1); i++) {
            int level = (int) (Math.log(i + 1) / Math.log(2));
            System.out.println("Level:" + level);
            System.out.print("  Parent: " + heap[i]);
            
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size) {
                System.out.print("\t\tLeft Child: " + heap[left]);
            } else {
                System.out.print("\t\tLeft Child: - ");
            }

            if (right < size) {
                System.out.print("\t\tRight Child: " + heap[right]);
            } else {
                System.out.print("\t\tRight Child: - ");
            }

            System.out.println("");
        }

    }
}