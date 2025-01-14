public class SecondiPiatti {
    private String nome;
    private String descrizione;
    private double prezzo;

    public SecondiPiatti(String nome, String descrizione, double prezzo) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    void stampaInfo(){

            System.out.println(" ~ "+nome+"che sarebbe "+descrizione+" al prezzo di "+prezzo);
        }
    }

