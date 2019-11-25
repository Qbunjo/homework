package pl.homework.meeting03.e02;

public class FuelStation {

	private String StationName;
	private Double priceON;
	private Double pricePB;
	private Double priceLPG;
	private Double amountON;
	private Double amountPB;
	private Double amountLPG;

	public FuelStation(String stationName, Double priceON, Double pricePB, Double priceLPG) {
		StationName = stationName;
		this.priceON = priceON;
		this.pricePB = pricePB;
		this.priceLPG = priceLPG;
		amountON = 100.00;
		amountLPG = 100.00;
		amountPB = 100.00;

	}

	public Double FuelCar(String fuel, Double amount) {
		switch (fuel) {
		case "ON":{
			amountON -= amount;
			return amountON;}
		case "PB":{
			amountPB -= amount;
			return amountPB;}
		case "LPG":{
			amountLPG -= amount;
			return amountLPG;}
		}
		return null;
	}

	public void FillIn(String fuel, Double amount) {
		switch (fuel) {
		case "ON":{
			amountON = Double.sum(amountON, amount);}
			case "PB":{
			amountPB =Double.sum(amountPB, amount);}
			case "LPG":{
			amountLPG = Double.sum(amountLPG,amount);
			}
		}
		
	}

	public void SetPrice(String fuel, Double price) {

	}

	public void PrintPrices() {
		// for (fuelSt:FuelStation) {
		// System.out.println(fuelSt.toString);
	}
	// }

	@Override
	public String toString() {
		return "FuelStation [StationName=" + StationName + ", priceON=" + priceON + ", pricePB=" + pricePB
				+ ", priceLPG=" + priceLPG + "]";
	}

	public Double getPriceON() {
		return priceON;
	}

	public void setPriceON(Double priceON) {
		this.priceON = priceON;
	}

	public Double getPricePB() {
		return pricePB;
	}

	public void setPricePB(Double pricePB) {
		this.pricePB = pricePB;
	}

	public Double getPriceLPG() {
		return priceLPG;
	}

	public void setPriceLPG(Double priceLPG) {
		this.priceLPG = priceLPG;
	}

	public String getStationName() {
		return StationName;
	}

}
