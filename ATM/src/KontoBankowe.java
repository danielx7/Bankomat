import java.util.List;

public class KontoBankowe {
    private String creationDate;
    private String numerKlienta;
    private double saldo;
    private String waluta;
    private String typKonta; // oszczednosciowe / zwykle / inwestycyjne, walutowe
    private List<Transakcja> listaTransakcji;

    public KontoBankowe(String _nazwisko, String _numer) {
        // TODO:
    }

    /**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	/**
     * @return the listaTransakcji
     */
    public List<Transakcja> getListaTransakcji() {
        return listaTransakcji;
    }

    /**
     * @param listaTransakcji the listaTransakcji to set
     */
    public void setListaTransakcji(List<Transakcja> listaTransakcji) {
        this.listaTransakcji = listaTransakcji;
    }

    /**
     * @return the typKonta
     */
    public String getTypKonta() {
        return typKonta;
    }

    /**
     * @param typKonta the typKonta to set
     */
    public void setTypKonta(String typKonta) {
        this.typKonta = typKonta;
    }

    /**
     * @return the numerKlienta
     */
    public String getNumerKlienta() {
        return numerKlienta;
    }

    /**
     * @param numerKlienta the numerKlienta to set
     */
    public void setNumerKlienta(String numerKlienta) {
        this.numerKlienta = numerKlienta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the waluta
     */
    public String getWaluta() {
        return waluta;
    }

    /**
     * @param waluta the waluta to set
     */
    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

}