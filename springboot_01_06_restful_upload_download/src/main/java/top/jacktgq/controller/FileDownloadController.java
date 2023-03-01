package top.jacktgq.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.MalformedURLException;

/**
 * @Author CandyWall
 * @Date 2022/1/17--19:14
 * @Description
 */
@RestController
@RequestMapping("/download")
public class FileDownloadController {
    @GetMapping("/file1")
    public ResponseEntity<File> getFile1(){
        File file = new File(".gitignore");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename=" + file.getName())
                .body(file);
    }

    @GetMapping("/file2")
    public ResponseEntity<Resource> getFile2(){
        File file = new File(".gitignore");
        Resource resource = null;
        try {
            resource = new UrlResource(file.toURI());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename=" + resource.getFilename())
                .body(resource);
    }
}
