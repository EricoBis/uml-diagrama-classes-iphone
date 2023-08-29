import audioplayer.*;
import internet.*;
import phone.*;

public class App {
    
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new IPod();
        NavegadorInternet navegador = new Safari();
        Telefone telefone = new TelefoneCelular();

        IPhone iphone = new IPhone(reprodutorMusical, navegador, telefone) ;
    }
}
