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

    public void addFolder(Folder folders) {
        this.folders.add(folders);
    }

    public void addFile(File files) { this.files.add(files); }

    @Override
    public String toString() {
        return "A pasta " + name + " possui " + files.size() +
                " arquivos e " + folders.size() + " pastas ";

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

