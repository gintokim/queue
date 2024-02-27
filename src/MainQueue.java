//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainQueue {
    public static void main(String[] args) {
        // Создаем очередь размером 5
        Queue myQueue = new Queue(5);

        // Добавляем элементы в очередь
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        // Извлекаем элементы из очереди
        myQueue.dequeue();
        myQueue.dequeue();

        // Добавляем еще элементы
        myQueue.enqueue(40);
        myQueue.enqueue(50);

        // Извлекаем элемент из очереди
        myQueue.dequeue();
    }
}