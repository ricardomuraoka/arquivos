package Arquivos;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Object> file;
    private ArrayList<Object> folder;


    public Folder(String name) {
        this.name = name;
        this.file = new ArrayList<>(file);
        this.folder = new ArrayList<>(folder);
    }

    public void addFolder(Folder folder) {
        this.folder.add(folder);
    }

    public void addFile(File file) {
        this.folder.add(file);
    }
        

}
