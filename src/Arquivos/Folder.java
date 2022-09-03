package Arquivos;

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

    @Override
    public String toString() {
        return "A pasta " + name + " possui " + files.size() +
                " arquivos e " + folders.size() + " pastas ";
    }

    public float tamanho() {
        float bytes = 0;
        for (int i = 0; i < files.size(); i++) {
            bytes += files.get(i).getBytes();
        }
        return bytes;
    }

    public float tamanhoTotal() {
        float bytes = 0;
        for (File h : files) {
            bytes += h.getBytes();
        }
        for (Folder y : folders) {
            for (File z : files) {
                bytes += z.getBytes();
            }
        }
        return bytes;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
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