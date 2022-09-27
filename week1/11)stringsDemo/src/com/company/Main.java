package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj = ("  Bugün hava çok güzel.  ");
        System.out.println(mesaj);
        System.out.println("eleman sayısı:" + mesaj.length());//dizideki eleman sayısını yazdırır.
        System.out.println("5.eleman:" + mesaj.charAt(4));//dizideki belirtilen index de ki elemanı yazdırır.
        System.out.println(mesaj.concat("Yaşasın!"));//belirtilen diziye belirtilen diziyi ekler.
        System.out.println("başlangıç: " + mesaj.startsWith("B"));//belirtilen dizi belirtilen harfle başlıyor mu kontrol eder. büyük küçük harfi duyarlıdır.
        System.out.println("bitiş: " + mesaj.endsWith("."));//belirtilen dizi belirtilen harfle bitiyor mu kontrol eder. büyük küçük harfi duyarlıdır.
        char[] karakterler = new char[5];
        mesaj.getChars(2, 7, karakterler, 0);//belirtilen dizideki belirtilen kısmı başka bir diziye aktarır. Son indexi dahil etmez.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('v'));//(char) aramaya baştan başlar. saymaya 0'dan başlar.
        System.out.println(mesaj.indexOf("va"));//(string)
        System.out.println(mesaj.lastIndexOf('o'));//(char) aramaya sondan başlar.Numara verirken baştan kaçıncıysa onu verir.
        System.out.println(mesaj.lastIndexOf("ok"));//(string)
        System.out.println(mesaj.replace(" ", "-"));//belirtilen dizideki belirtilen karakterin tamamını başka bir karakterle değiştirir.
        System.out.println(mesaj.substring(2, 5));//belirtilen dizideki belirtilen index aralığındaki karakterleri bastırır. en son indexi dahil etmez.
        for (String kelime : mesaj.split(" ")) {//belirtilen dizideki belirtilen karaktere göre kelimeleri ayırır.
            System.out.println(kelime); // bütün kelimeleri yazdırmak için döngüye soktum.
        }
        System.out.println(mesaj.toLowerCase());//bütün harfleri küçük harf yapar.
        System.out.println(mesaj.toUpperCase());//bütün harfleri büyük harf yapar.
        System.out.println(mesaj.trim());//dizinin başındaki ve sonundaki fazla boşlukları alır.

        // bu tür fonksiyonlar yeni bir çıktı oluşturur asıl metni değiştirmez.
        // değiştirmek istiyorsak yeni bir değişken atamamız gerekir.
    }
}

