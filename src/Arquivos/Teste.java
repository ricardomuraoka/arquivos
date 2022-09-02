package Arquivos;

import java.util.ArrayList;
import java.util.List;


public class Teste {
    public static void main(String[] args) {
        File file = new File("Joseph", "pdf", 24);
        Folder folder = new Folder ("Files");
        Folder folder2 = new Folder("Genederal Folder");

        folder.addFile(file);
        folder2.addFolder(folder);
        folder2.size();
        System.out.println(folder2);
    }
}

