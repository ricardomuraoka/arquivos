package arquivos;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println("Esta pasta já foi adicionada");
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

    public static final String PASTA = "A pasta ";
    public static final String POSSUI = " possui ";
    @Override
    public String toString() {
        return PASTA + name + POSSUI + files.size() +
                " arquivos e " + folders.size() + " pastas ";
    }

    public String tamanho() {
        float bytes = 0;
        for (File file : files) {
            bytes += file.getBytes();
        }
        return PASTA + name + POSSUI + bytes + " bytes";
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
        return PASTA + name + POSSUI + bytes + " bytes";
    }

    public void removeFiles(String nomeDoArquivo, List<Folder> folders) {
        if (possuiSubpastas()) {
            for (int i = 0; i < folders.size(); i++) {
                for (Folder folder : folders) {
                    for (int j = 0; j < folder.getFiles().size(); j++) {
                        File file = folder.getFiles().get(j);
                        if (nomeDoArquivo.equals(file.getNameFile())) {
                            files.remove(file);
                        }
                    }
                }
            }
        } else {
            files.removeIf(file -> nomeDoArquivo.equals(file.getNameFile()));
        }

    }


    public boolean possuiSubpastas() {
        return !folders.isEmpty();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = (ArrayList<File>) files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = (ArrayList<Folder>) folders;
    }


}