package Arquivos;

import java.util.ArrayList;
import java.util.List;


public class Teste {
    public static void main(String[] args) {
        File file = new File("Joseph", "pdf", 24);
        File file2 = new File("Mary", "jpg", 1024);
        File file3 = new File("That Guy", "mpeg", 2048);
        Folder folder = new Folder ("Folder");
        Folder folder2 = new Folder("General Folder");

        folder.addFile(file);
        folder2.addFolder(folder);
        folder.addFile(file2);
        folder.addFile(file3);
        folder.addFile(file3);
        System.out.println(folder2);
        System.out.println(folder);
        System.out.println(folder.tamanho());
        System.out.println(folder2.tamanho());
    }
}

