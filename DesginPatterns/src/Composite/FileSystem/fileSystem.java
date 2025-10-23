package Composite.FileSystem;

public interface fileSystem {

    void ls(int indent);
    void openAll(int indent);
    int getsize();
    fileSystem cd(String name);
    String getName();
    boolean isFolder();

}
