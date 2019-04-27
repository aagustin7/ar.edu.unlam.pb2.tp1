package ar.edu.unlam.pb2.disco;

public class Disco {
	
	//atributos
	private Integer radiointerior;
	private Integer radioexterior;
	
	//constructores	
	public Disco () {}
	
	public Disco (Integer pRadioInterior, Integer pRadioExterior) {	
		this.radiointerior = pRadioInterior;
		this.radioexterior = pRadioExterior;
	}
	
	//metodos
	public double getPerimetroInterior() {		
		return (radiointerior*2*3.14);
	}
	
	public double getPerimetroExterior() {		
		return (radioexterior*2*3.14);
	}
	
	public double getSuperficie() {	
		return (radioexterior*2*3.14) - (radiointerior*2*3.14);
	}
	
}
