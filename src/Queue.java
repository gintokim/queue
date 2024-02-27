public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    // Конструктор для инициализации очереди
    public Queue(int size) {
        maxSize = size + 1; // Увеличиваем размер на 1 для избежания переполнения
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Метод для добавления элемента в конец очереди
    public void enqueue(int value) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1; // Циклический перенос, если достигнут конец массива
            }
            queueArray[++rear] = value;
            System.out.println("Enqueued " + value + " to the queue");
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    // Метод для извлечения элемента из начала очереди
    public int dequeue() {
        if (!isEmpty()) {
            int dequeuedValue = queueArray[front++];
            if (front == maxSize) {
                front = 0; // Циклический перенос, если достигнут конец массива
            }
            System.out.println("Dequeued " + dequeuedValue + " from the queue");
            return dequeuedValue;
        } else {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1; // Возвращаем значение по умолчанию в случае пустой очереди
        }
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        return (rear + 1 == front) || (front + maxSize - 1 == rear);
    }

    // Метод для проверки, полна ли очередь
    public boolean isFull() {
        return (rear + 2 == front) || (front + maxSize - 2 == rear);
    }
}