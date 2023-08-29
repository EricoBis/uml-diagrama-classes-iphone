package phone;

public class TelefoneCelular implements Telefone{

    @Override
    public void ligar() {
        System.out.println("Ligando para o número");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o número");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
