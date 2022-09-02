package Arquivos;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Folder {
    private String name;
    private ArrayList<Object> files;
    private ArrayList<Object> folders;


    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }

    public void addFile(File file) {
        this.folders.add(file);
    }
/*
    @Override
    public String toString() {
        return name + " contains " + files.size() + " file(s) and " + folders.size() + " folder(s).";
    }
 */
/*
    public void size() {

        ArrayList<Object> Folder = file.stream()
                .map(File::getBytes)
                .collect(Collectors.toCollection(ArrayList::new));
    }

 */
}
