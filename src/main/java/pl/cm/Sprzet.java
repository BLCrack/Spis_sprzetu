package pl.cm;

public class Sprzet
{
    private int nrInwentarzowy;
    private String nrSeryjny;
    private String Nazwa;
    private String Lokalizacja;
    private String PoprzedniWlasciciel;
    private String akcesoria;
    private String dodatkoweInformacje;

    public int getNrInwentarzowy() {
        return nrInwentarzowy;
    }

    public void setNrInwentarzowy(int nrInwentarzowy) {
        this.nrInwentarzowy = nrInwentarzowy;
    }

    public String getNrSeryjny() {
        return nrSeryjny;
    }

    public void setNrSeryjny(String nrSeryjny) {
        this.nrSeryjny = nrSeryjny;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getLokalizacja() {
        return Lokalizacja;
    }

    public void setLokalizacja(String lokalizacja) {
        Lokalizacja = lokalizacja;
    }

    public String getPoprzedniWlasciciel() {
        return PoprzedniWlasciciel;
    }

    public void setPoprzedniWlasciciel(String poprzedniWlasciciel) {
        PoprzedniWlasciciel = poprzedniWlasciciel;
    }

    public String getAkcesoria() {
        return akcesoria;
    }

    public void setAkcesoria(String akcesoria) {
        this.akcesoria = akcesoria;
    }

    public String getDodatkoweInformacje() {
        return dodatkoweInformacje;
    }

    public void setDodatkoweInformacje(String dodatkoweInformacje) {
        this.dodatkoweInformacje = dodatkoweInformacje;
    }


}
