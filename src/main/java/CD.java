
public class CD {
    String id;
    String title;
    String artist;
    String country;
    String company;
    String price;
    String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public CD(String id,String title, String artist,String country,String company,String price,String year){
        this.id = id;
        this.title=title;
        this.artist = artist;
        this.country = country;
        this.company = company;
        this.price=price;
        this.year=year;
    }
}