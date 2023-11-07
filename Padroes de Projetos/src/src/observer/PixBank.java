package observer;

import java.util.ArrayList;
import java.util.List;

public class PixBank {
    private List<PixTransactionObserver> observers = new ArrayList<>();

    public void addObserver(PixTransactionObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PixTransactionObserver observer) {
        observers.remove(observer);
    }

    public void performTransaction(PixTransaction transaction) {
        // Simular uma transação Pix
        System.out.println("Realizando transação Pix...");
        System.out.println("Remetente: " + transaction.getSender());
        System.out.println("Destinatário: " + transaction.getReceiver());
        System.out.println("Valor: " + transaction.getAmount());
        System.out.println();

        // Notificar todos os observadores
        for (PixTransactionObserver observer : observers) {
            observer.update(transaction);
        }
    }
}
