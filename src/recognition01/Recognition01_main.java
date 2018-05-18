package recognition01;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition01_main {
	public static void main(String[]orgs){
	VisualRecognition service = new VisualRecognition("2018-03-19");
	service.setApiKey("1b184fdfa1b1641d657f68330ab436b8aa7097e9");

	DetectFacesOptions detectFacesOptions = null;
	try {
		detectFacesOptions = new DetectFacesOptions.Builder()
		  .imagesFile(new File("img/prez.jpg"))
		  .build();
	} catch (FileNotFoundException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
	}
	DetectedFaces result = service.detectFaces(detectFacesOptions).execute();
	System.out.println(result);
	}
}
