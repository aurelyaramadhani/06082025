//Drive Class
public class FriendTest {
    public static void main(String[] args) {
        //membuat object
        Friend juju = new Friend("Juju", "SMPN 2 Ngancar", 'P', 15);
        juju.cetak();
        Friend najwa = new Friend("Najwa", "SMPN 1 Kapak", 'P', 16);
        najwa.cetak();
        Friend naura = new Friend("Naura", "SMPN 2 Tuban", 'P', 16);
        naura.cetak();
        Friend eka = new Friend("Eka", "SMPN 1 Srono", 'P', 15);
        eka.cetak();
        Friend abel = new Friend("Abel", "SMPN 16 Malang", 'P', 15);
        abel.cetak();
    }
}
