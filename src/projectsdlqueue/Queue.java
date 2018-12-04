package projectsdlqueue;

import java.util.ArrayList;

public class Queue {

    private int front, rear, size;
    private antrian antri;
    private int[] data;

    public Queue() {
    }

    public Queue(int jumlahdata) {
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.data = new int[jumlahdata];
    }

    public void enqueue(int input) {
        if (!isFull()) {
            data[rear] = input;
            System.out.println("Angka " + input + " berhasil di enqueue");
            rear++;
            size++;
        } else {
            System.out.println("Queue sudah penuh");
        }
    }

    public int dequeue() {
        if (rear != front) {
            int tampil = data[front];
            for (int i = front; i < rear; i++) {
                if (i == rear - 1) {
                    System.out.println(data[i]);
                    data[i] = 0;
                    System.out.println("Angka Berhasil di Dequeue");
                    
                } else {
                    data[i] = data[i + 1];
                }
            }
            rear--;
            size--;
            return tampil;
        } else {
            System.out.println("Queue sudah Kosong");
            return 0;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == data.length) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String tampil = "";
        for (int i = front; i < rear; i++) {
            tampil += data[i] + " ";

        }
        return tampil;
    }

    public ArrayList hasil() {
        ArrayList angka = new ArrayList();
        for (int i = front; i < rear; i++) {
            angka.add(data[i]);
        }
        return angka;
    }

    public antrian getAntri() {
        return antri;
    }

    public void setAntri(antrian antri) {
        this.antri = antri;
    }

}
