package observer;

public class PixUser implements PixTransactionObserver{
    private String name;

    public PixUser(String name) {
        this.name = name;
    }

    @Override
    public void update(PixTransaction transaction) {
        System.out.println(name + " recebeu uma notificação de transação Pix:");
        System.out.println("Remetente: " + transaction.getSender());
        System.out.println("Destinatário: " + transaction.getReceiver());
        System.out.println("Valor: " + transaction.getAmount());
        System.out.println();
    }
}
