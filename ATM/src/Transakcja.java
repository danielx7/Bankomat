class Transakcja
{
    private int id;
    private String data;
    private String numerKonta;
    private double sumaTransakcji;
    private String typTransakcji;// gotowka, przelew?
    public Transakcja(int _id, String numerKonta, double sumaTransakcji ){}

    public Transakcja(){}
	/**
	 * @return the typTransakcji
	 */
	public String getTypTransakcji() {
		return typTransakcji;
	}
	/**
	 * @param typTransakcji the typTransakcji to set
	 */
	public void setTypTransakcji(String typTransakcji) {
		this.typTransakcji = typTransakcji;
	}
	/**
	 * @return the sumaTransakcji
	 */
	public double getSumaTransakcji() {
		return sumaTransakcji;
	}
	/**
	 * @param sumaTransakcji the sumaTransakcji to set
	 */
	public void setSumaTransakcji(double sumaTransakcji) {
		this.sumaTransakcji = sumaTransakcji;
	}
	/**
	 * @return the numerKonta
	 */
	public String getNumerKonta() {
		return numerKonta;
	}
	/**
	 * @param numerKonta the numerKonta to set
	 */
	public void setNumerKonta(String numerKonta) {
		this.numerKonta = numerKonta;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

    


}