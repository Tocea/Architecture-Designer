import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuildPropertiesTest {

	public void testProperties() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/test/resources/build.properties")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("../build.properties")));

		String line = "";
		boolean first = true;
		while((line=br.readLine())!=null) {
			if(first)
				first = false;
			else
				bw.write("\n");
			bw.write(line);
		}

		final File dependencies = new File("target/dependency");
		final File[] listFiles = dependencies.listFiles();

		for(File jarFile : listFiles) {
			bw.write(",\\\n               binding-bundle/target/dependency/");
			bw.write(jarFile.getName());
		}

		br.close();
		bw.close();
	}

}
