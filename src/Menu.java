import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Piatti> piattiList;
    private TipoEnum tipoMenu;
    private String nome;
    private String descrizione;

    public Menu(String nome, String descrizione, TipoEnum tipoMenu) {
        this.piattiList = new ArrayList<>();
        this.nome = nome;
        this.descrizione = descrizione;
        this.tipoMenu = tipoMenu;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void addPiatto(Piatti piatti){
        piattiList.add(piatti);
    }

    public void removePiatto(Piatti piatti){
        piattiList.remove(piatti);
    }

    public void stampaMenu(TipoColori coloreAntipasti, TipoColori colorePrimi, TipoColori coloreSecondi){
        System.out.println("Nome menu: " + this.nome +
                "\nDescrizione menu: " + this.descrizione +
                "\nTipo menu: " + this.tipoMenu + "\n"
        );

            System.out.println(coloreAntipasti + "Antipasti:\n" + TipoColori.RESET);
            for(Piatti antipasti : piattiList){
                if(antipasti instanceof Antipasti) {
                    antipasti.stampaInfo();
                }
            }

            System.out.println(colorePrimi + "\nPrimi Piatti:\n" + TipoColori.RESET);
            for(Piatti primi : piattiList){
                if(primi instanceof PrimiPiatti) {
                    primi.stampaInfo();
                }
            }

            System.out.println(coloreSecondi + "\nSecondi Piatti:\n" + TipoColori.RESET);
            for(Piatti secondi : piattiList){
                if(secondi instanceof SecondiPiatti) {
                    secondi.stampaInfo();
                }
            }
    }
}
