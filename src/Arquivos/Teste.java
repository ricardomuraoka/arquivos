package Arquivos;

import java.util.ArrayList;
import java.util.List;


public class Teste {
    public static void main(String[] args) {
        File file = new File("Joseph", "pdf", 24);
        Folder folder = new Folder ("Folder");
        Folder folder2 = new Folder("General Folder");

        folder.addFile(file);
        folder2.addFolder(folder);
        System.out.println(folder2);
        System.out.println(folder);
    }
}

