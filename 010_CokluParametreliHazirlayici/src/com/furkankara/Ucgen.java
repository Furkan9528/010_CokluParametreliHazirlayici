package com.furkankara;

public class Ucgen {

	private String cesit;
	private int yukseklik;
	private double taban;
	

	/**
	 * @return the cesit
	 * @author furkankara
	 * @since 04.09.2019
	 */
	public Ucgen( String cesit , int yukseklik) {
		this.cesit =  cesit;
		this.yukseklik=yukseklik;
	}
	
	public Ucgen( String cesit , int yukseklik ,double taban) {
		this.cesit =  cesit;
		this.yukseklik=yukseklik;
		this.taban = taban;
	}

	public Ucgen( String cesit) {
		this.cesit =  cesit;
	}
	
	public Ucgen( int yukseklik) {
		this.yukseklik=yukseklik;
	}
	
	public Ucgen( double taban ) {
		this.taban = taban ;
	}



	public double getTaban() {
		return taban;
	}


	public void setTaban(double taban) {
		this.taban = taban;
	}


	public String getCesit() {
		return cesit;
	}


	public void setCesit(String cesit) {
		this.cesit = cesit;
	}
	
	/**
	 * @return the yukseklik
	 */
	public int getYukseklik() {
		return yukseklik;
	}


	/**
	 * @param yukseklik the yukseklik to set
	 */
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	


	public void ciz(){
		System.out.println("Taban : "+getTaban() + " Yükseklik : "+getYukseklik() + " Cesit : " + getCesit() );
		
	}


	
	
	
	
	
}
