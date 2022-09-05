package arquivos;


public class Teste {
    public static void main(String[] args) {
        File file = new File("Joseph", "pdf", 24);
        File file2 = new File("Mary", "jpg", 1024);
        File file3 = new File("That Guy", "mpeg", 2048);
        Folder folder = new Folder ("Folder");
        Folder folder2 = new Folder("General Folder");
        Folder folder3 = new Folder("Pasta com 1 arquivo");

        folder.addFile(file);
        folder2.addFolder(folder);
        folder2.addFolder(folder);
        folder.addFile(file2);
        folder.addFile(file3);
        folder.addFile(file3);
        folder3.addFile(file2);
        folder2.addFolder(folder3);
        System.out.println(folder2);
        System.out.println(folder);
        System.out.println(folder.tamanho());
        System.out.println(folder2.tamanhoTotal());
        folder2.removeFiles("Mary",folder2.getFolders());
        System.out.println(folder);
        System.out.println(folder.getFiles());
    }
}

