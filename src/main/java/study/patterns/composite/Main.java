package study.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory music = new Directory("music");
        Directory downLoad = new Directory("Download");

        File song1 = new File("song1", 10);
        File song2 = new File("song2", 10);

        File zip1 = new File("zip1", 15);
        File zip2 = new File("zip2", 23);

        music.add(song1);
        music.add(song2);
        root.add(music);

        downLoad.add(zip1);
        downLoad.add(zip2);
        root.add(downLoad);

        System.out.println("RootFolderSize: " + root.getSize());
        System.out.println("DownLoadSize: " + downLoad.getSize());
        System.out.println("MusicFolderSize: " + music.getSize());

        PrintUtils.printList(downLoad);
    }
}
