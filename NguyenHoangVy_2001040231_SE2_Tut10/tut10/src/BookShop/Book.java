package BookShop;

public class Book {

    private String name;
    private String title;
    private double price;

    public Book(String name, String title, double price){
        this.name = name;
        this.title = title;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name) {
        if (name.contains("[1-9]")){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.name = name;
    }

    public void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Name: ").append(this.getName())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice());

        return sb.toString();

    }
}
