package DesignPattern.CompositePattern;

import java.util.ArrayList;

public interface FileSystem {
    public int getSize();
    public void remove();
}

class File implements FileSystem{
private String name;
private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        System.out.println(name+"파일크기 :" +size);
        return size;
    }

    @Override
    public void remove() {
        System.out.println(name + "파일 삭제");
    }
}

class Folder implements FileSystem{
    private  String name;
    private ArrayList<FileSystem> includeds = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem){
        includeds.add(fileSystem);
    }

    @Override
    public int getSize() {
        int total = 0;
        for(FileSystem included : includeds){
            total  = total + included.getSize();
        }
        System.out.println("name" + "폴더 크기 :" + total);
        System.out.println("-------------------");
        return  total;
    }

    @Override
    public void remove() {
        for(FileSystem included : includeds){
            included.remove();
        }
        System.out.println(name+"폴더 삭제");
        System.out.println("-------------------");
    }
}
