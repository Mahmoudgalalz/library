
package library;

class books {
    private int isbn,pagecount;
    private float price;
    private String title,type,publisher;

    public books(int isbn, int pagecount, float price, String title, String type, String publisher) {
        this.isbn = isbn;
        this.pagecount = pagecount;
        this.price = price;
        this.title = title;
        this.type = type;
        this.publisher = publisher;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPagecount() {
        return pagecount;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
