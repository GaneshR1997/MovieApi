package com.movie.api.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {

        //getting file name
        String fileName = file.getOriginalFilename();

        //getting Filepath
        String filePath = path + File.pathSeparator + fileName;

        //Creating a file Object
         File f = new File(path);
         if(!f.exists())
             f.mkdir();

         //copy the created file to target location
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
        return fileName;

    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {

        String filePath = path + File.pathSeparator + fileName;
        return new FileInputStream(filePath);
    }
}
