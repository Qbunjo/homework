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
		case "ON": {
			amountON -= amount;
			Double toPay = amount * priceON;
			System.out.println("You tanked "+amount+" liters of ON with price:"+priceON);
			return toPay;
		}
		case "PB": {
			amountPB -= amount;
			Double toPay = amount * pricePB;
			System.out.println("You tanked "+amount+" liters of ON with price:"+pricePB);
			return toPay;
		}
		case "LPG": {
			amountLPG -= amount;
			Double toPay = amount * priceLPG;
			System.out.println("You tanked "+amount+" liters of ON with price:"+priceLPG);
			return toPay;
		}

		default:
			return null;
		}
	}

	public void FillIn(String fuel, Double amount) {
		switch (fuel) {
		case "ON": {
			amountON = Double.sum(amountON, amount);
			System.out.println("ON tank filled. Now contains: " + amountON);
			break;
		}
		case "PB": {
			amountPB = Double.sum(amountPB, amount);
			System.out.println("PB tank filled. Now contains:" + amountPB);
			break;
		}
		case "LPG": {
			amountLPG = Double.sum(amountLPG, amount);
			System.out.println("LPG tank filled. Now contains:" + amountLPG);
			break;
		}
		}

	}

	public void SetPrice(String fuel, Double price) {
		switch (fuel) {
		case "ON": {
			setPriceON(price);
			System.out.println("New ON price set: " + price);
			break;
		}
		case "PB": {
			setPricePB(price);
			System.out.println("New PB price set: " + price);
			break;
		}
		case "LPG": {
			setPriceLPG(price);
			System.out.println("New ON price set: " + price);
			break;
		}
		}
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
