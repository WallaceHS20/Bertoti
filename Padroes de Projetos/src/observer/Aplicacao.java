package observer;

public class Aplicacao {
    public static void main(String[] args) {
        // Criar um banco Pix
        PixBank pixBank = new PixBank();

        // Criar alguns usuários que desejam observar transações
        PixUser user1 = new PixUser("Wallace");
        PixUser user2 = new PixUser("Ana Clara");

        // Adicionar os observadores ao banco Pix
        pixBank.addObserver(user1);
        pixBank.addObserver(user2);

        // Simular uma transação Pix
        PixTransaction transaction = new PixTransaction("João", "Maria", 100.0);
        pixBank.performTransaction(transaction);
    }
}
