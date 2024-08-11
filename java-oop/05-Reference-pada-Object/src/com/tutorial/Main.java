package com.tutorial;

class Buku{
  String judul;
  String penulis;

  Buku(String judul, String penulis){
    this.judul = judul;
    this.penulis = penulis;
  }

  void display(){
    System.out.println("Judul\t : " + judul);
    System.out.println("Penulis\t : " + penulis);
  }

}

public class Main {
  public static void main(String[] args) {
    Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami");

    buku1.display();
    
    String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
    System.out.println("Address buku1 : " + addressBuku1);
    
    Buku buku2 = buku1;
    buku2.display();
    String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
    System.out.println("Address buku2 : " + addressBuku2);

    // karena buku1 dan buku2 berada pada address atau referensi yang sama 
    buku2.judul = "Membunuh komandantur";
    buku1.display();
    buku2.display();

    // kita akan memasukan object kedalam methods
    fungsi(buku2);
    buku1.display();
    buku2.display();
  }
  
  public static void fungsi(Buku dataBuku){
      String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
      System.out.println("address dalam fungsi " + addressDataBuku);
      dataBuku.penulis = "Haruki Mahalkami";
  }
}