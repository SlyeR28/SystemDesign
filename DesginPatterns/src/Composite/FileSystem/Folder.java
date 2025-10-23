package Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements fileSystem {

    private String name;

    private List<fileSystem>childerns;

    public Folder(String name) {
        this.name = name;
        childerns = new ArrayList<>();
    }

    public void add(fileSystem system){
        childerns.add(system);
    }

    @Override
    public void ls(int indent) {
        String indentSpaces = " ".repeat(indent);
        for (fileSystem child : childerns) {
            if (child.isFolder()) {
                System.out.println(indentSpaces + "+ " + child.getName());
            } else {
                System.out.println(indentSpaces + child.getName());
            }
        }

    }

    @Override
    public void openAll(int indent) {
        String indentSpaces =   " ".repeat(indent);
        System.out.println(indentSpaces + " + " + name);
        for (fileSystem child : childerns) {
            child.openAll(indent + 4);
        }
    }

    @Override
    public int getsize() {
        int total = 0;
        for(fileSystem child : childerns){
            total += child.getsize();
        }
        return total;
    }

    @Override
    public fileSystem cd(String name) {
        for(fileSystem system : childerns){
            if(system.isFolder() && system.getName().equals(name)){
                return system;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
