class Book{
    String name;
    Author author;
    double price;
    int qtyInStock;
    
    Book(Author author,String name, double price,int qtyInStock){
        this.author=author;
        this.name=name;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    
    public String getName(){
        return name;
    } 
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qtyInStock;
    }
    public Author getAuthor(){
        return author;
    }
    
}
