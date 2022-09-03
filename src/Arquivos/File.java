package Arquivos;

public class File {
    private String nameFile;
    private String extension;
    private float bytes;

    public File(String name, String extension, float bytes) {
        this.nameFile = name;
        this.extension = extension;
        this.bytes = bytes;
    }


    public float getBytes() {
        return bytes;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String name) {
        this.nameFile = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setBytes(float bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return String.format("%s.%s (%.2f bytes)", nameFile, extension, bytes);
    }

}