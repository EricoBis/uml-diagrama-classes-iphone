import audioplayer.ReprodutorMusical;
import internet.NavegadorInternet;
import phone.Telefone;

public class IPhone {
    
    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegador;
    private Telefone telefone;

    public IPhone(ReprodutorMusical reprodutorMusical, NavegadorInternet navegador, Telefone telefone) {
        this.reprodutorMusical = reprodutorMusical;
        this.navegador = navegador;
        this.telefone = telefone;
    }
}
