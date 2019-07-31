package com.codeclan.example.FileService;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.repository.FileRepository;
import com.codeclan.example.FileService.repository.FolderRepository;
import com.codeclan.example.FileService.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileServiceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void createUser() {
//		User sarab = new User("Sarabjeet");
//		userRepository.save(sarab);
//	}

	@Test
	public void canCreateFolderAndUser() {
		User user1 = new User("Raj");
		userRepository.save(user1);

		Folder folder1 = new Folder("Java", user1);
		folderRepository.save(folder1);

	}

	@Test
	public void canCreateFileFolderAndUser(){
		User user1 = new User("Sarab");
		userRepository.save(user1);

		Folder folder1 = new Folder("Java", user1);
		folderRepository.save(folder1);

		File file1 = new File("Employees", ".java", 15, folder1);
		fileRepository.save(file1);


	}

}
