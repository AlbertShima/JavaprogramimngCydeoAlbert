package day37_Inheritance.cryptoToken;

/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)
			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
					2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge
 */
public class CryptoToken {
    public double price, quantity;
    public String marketCap, volume, circulatingSupply;
    public boolean isMineable;

    public CryptoToken(double price, double quantity, String marketCap, String volume, String circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice() {
        return price * quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap='" + marketCap + '\'' +
                ", volume='" + volume + '\'' +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*



	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */