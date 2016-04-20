/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author fabian.giraldo
 */
public class Libro extends Soporte{
    private int paginas;
    private String isbn;
    
    public Libro(String isbn, String titulo,int paginas) {
        super(titulo);
        this.isbn = isbn;
        this.paginas=paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() +", paginas=" + paginas + ", isbn=" + isbn +  '}';
    }
    
    
    
}
