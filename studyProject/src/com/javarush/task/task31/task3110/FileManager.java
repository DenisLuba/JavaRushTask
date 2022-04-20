package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private Path rootPath;
    private List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        collectFileList(rootPath);
    }

    public List<Path> getFileList() {
        return fileList;
    }

    private void collectFileList(Path path) throws IOException {
        if (fileList == null) fileList = new ArrayList<>();
        if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
                for (Path entry : stream)
                    collectFileList(entry);
            } catch (Exception e) { }
        } else if (Files.isRegularFile(path) && !path.equals(rootPath)) {
            fileList.add(rootPath.relativize(path));
        } else fileList.add(path.getFileName());
    }
}
