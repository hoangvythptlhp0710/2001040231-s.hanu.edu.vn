package BookShop;

public class GoldEditionBook extends Book{
    public GoldEditionBook(String name, String title, double price) {
        super(name, title, price);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + super.getPrice() * 0.3;
    }
}
