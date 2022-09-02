package Arquivos;

public class File {
    private String name;
    private String extension;
    private float bytes;

    public File(String name, String extension, float bytes) {
        this.name = name;
        this.extension = extension;
        this.bytes = bytes;
    }


    public float getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.format("%s: %f", name, bytes);
    }

}
