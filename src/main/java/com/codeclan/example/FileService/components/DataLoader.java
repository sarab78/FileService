package com.codeclan.example.FileService.components;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.repository.FileRepository;
import com.codeclan.example.FileService.repository.FolderRepository;
import com.codeclan.example.FileService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User user1 = new User("Sarab");
        userRepository.save(user1);

        User user2 = new User("Sirjan");
        userRepository.save(user2);

        User user3 = new User("Jap");
        userRepository.save(user3);

        User user4 = new User("Raj");
        userRepository.save(user4);

        Folder folder1 = new Folder("Ruby", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("JavaScript", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Java", user2);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("VisualBasics", user3);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("C++", user4);
        folderRepository.save(folder5);

        File file1 = new File("Employees", ".java", 15, folder1);
        fileRepository.save(file1);

        File file2 = new File("User", ".rb", 10, folder2);
        fileRepository.save(file2);

        File file3 = new File("Homework", ".md", 25, folder3);
        fileRepository.save(file3);

        File file4 = new File("River", ".rb", 18, folder4);
        fileRepository.save(file4);

        File file5 = new File("JurrasicPark", ".js", 10, folder5);
        fileRepository.save(file5);

        File file6 = new File("Ships", ".java", 20, folder1);
        fileRepository.save(file6);

        File file7 = new File("Student", ".rb", 15, folder2);
        fileRepository.save(file7);

    }
}
