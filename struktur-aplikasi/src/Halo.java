package belajar.java.fundamental.hari1;

import java.util.Date;
import training.internet.banking.Nasabah;

public class Halo {

  private Date sekarang = new Date();

  public void sapa(String nama){
    System.out.println("Halo " + nama);
  }

  public void tampilkanWaktu(){
    System.out.println("Waktu sekarang : " + sekarang);
  }

  public static void main(String[] x){
    System.out.println("Menjalankan method main");

    Nasabah n = new Nasabah("endy");
    System.out.println("Halo "+ n.getNama());
  }
}