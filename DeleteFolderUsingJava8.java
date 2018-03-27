package coding_problems;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class DeleteFolderUsingJava8 {

	public static void main(String[] args) {

		Path rootPath = Paths.get("C:\\Users\\Saidesh kilaru\\Desktop\\folder1");
		try {
			Files.walk(rootPath, FileVisitOption.FOLLOW_LINKS).sorted(Comparator.reverseOrder()).map(Path::toFile)
					.peek(System.out::println).forEach(File::delete);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}