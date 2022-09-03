package arquivos;

import java.util.ArrayList;

public class Folder {


    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> folders;


    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public void addFolder(Folder y) {
        if (folders.contains(y)) {
            System.out.println("Esta pasta já foi adiconada");
        } else {
            this.folders.add(y);
        }
    }

    public void addFile(File x) {
        if (files.contains(x)) {
            System.out.println("Esta pasta já possui este arquivo");
        } else {
            this.files.add(x);
        }
    }

    public static final String PASTA = "A pasta";
    @Override
    public String toString() {
        return PASTA + " " + name + " possui " + files.size() +
                " arquivos e " + folders.size() + " pastas ";
    }

    public String tamanho() {
        float bytes = 0;
        for (File file : files) {
            bytes += file.getBytes();
        }
        return PASTA + " " + name + " possui " + bytes + " bytes";
    }

    public double tamanhoDouble() {
        float bytes = 0;
        for (File file : files) {
            bytes += file.getBytes();
        }
        return bytes;
    }



        public String tamanhoTotal() {
        float bytes = 0;
            for (Folder folder : folders) {
                bytes += folder.tamanhoDouble();
            }
        return PASTA + " " + name + " possui " + bytes + " bytes";
    }

    public void removeFiles(String nomeDoArquivo, ArrayList<Folder> folders) {
        for (File file : files) {
            if (nomeDoArquivo == file.getNameFile()) {
                files.remove(file);
            }
        }

    }

    public boolean possuiSubpastas() {
        if (folders.size() > 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean compareName(String param) {
        for (File files : files) {
            if (files.getNameFile() == param);
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles(Folder folder) {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }


}