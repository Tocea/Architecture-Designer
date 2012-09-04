import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuildManifestTest {

	public void testManifest() throws IOException {
		final BufferedReader originalManifest = new BufferedReader(new FileReader(new File("src/test/resources/MANIFEST.MF")));
		final BufferedWriter bw = new BufferedWriter(new FileWriter(new File("../META-INF/MANIFEST.MF")));

		String line = "";
		while((line = originalManifest.readLine())!=null) {
			bw.write(line);
			bw.write("\n");
		}
		originalManifest.close();

		final File dependencies = new File("target/dependency");
		final File[] listFiles = dependencies.listFiles();

		bw.write("Bundle-Classpath: .,\n");
		for(int i=0;i<listFiles.length;i++) {
			File jarFile = listFiles[i];
			if(!jarFile.getName().endsWith("jar"))
				continue;
			bw.write(" binding-bundle/target/dependency/"+jarFile.getName());
			if(i<listFiles.length-1)
				bw.write(",\n");
			else
				bw.write("\n");
		}
		bw.close();
	}

}