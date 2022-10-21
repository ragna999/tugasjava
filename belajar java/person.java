public class person {
    private String nama;
    private String umur;
    private String jeniskelamin;

    /**
     * @param args
     */
    public static void main (String[]args) {
        //membuat object 
        person anton = new person ();

        /*memanggil atribut dan memberi nilai */
        anton.nama="anton";
        anton.umur = "18";
        anton.jeniskelamin = "laki laki";

        System.out.println("nama : " +anton.nama);
        System.out.println("umur :  " + anton.umur);
        System.out.println("jeniskelamin:" + anton.jeniskelamin);

     //membuat object 
     person riko = new person ();

     /*memanggil atribut dan memberi nilai */
     riko.nama="riko";
     riko.umur = "20";
     riko.jeniskelamin = "laki laki";
    System.out.println("nama :" +riko.nama);
     System.out.println("umur :  " + riko.umur);
     System.out.println("jeniskelamin:" + riko.jeniskelamin);

    }
}

        


