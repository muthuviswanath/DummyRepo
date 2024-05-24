public class Photoshop {
    void open (File f){
        System.out.println("File Name:" + f.filename);
        System.out.println("File Extn:" + f.fileext);
        f.behave();
    }
}

class File{
    String filename;
    String fileext;

    void behave(){
        System.out.println("File Behaviour");
    }
}

class JpegFile extends File{
    @Override
    void behave() {
        System.out.println("Flattened Image");
    }
}
class PsdFile extends File{
    @Override
    void behave() {
        System.out.println("Layered Image");
    }
}