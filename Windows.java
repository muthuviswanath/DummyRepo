public class Windows {
    public static void main(String[] args) {
        Photoshop p = new Photoshop();
        JpegFile jpg = new JpegFile();
        jpg.filename = "MyPic";
        jpg.fileext = ".jpg";
        p.open(jpg);

        PsdFile psd = new PsdFile();
        psd.filename = "MyFlyer";
        psd.fileext = ".psd";

        p.open(psd);

    }
}
