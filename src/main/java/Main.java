
import gson.LetsGoGson;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {




        File testFileXml = new File("C:\\Users\\prota\\IdeaProjects\\xml_json\\src\\main\\java\\xmls\\test.xml");
        File testFileJson = new File("C:\\Users\\prota\\IdeaProjects\\xml_json\\src\\main\\java\\xmls\\json.json");
        File testFileXml2 = new File("C:\\Users\\prota\\IdeaProjects\\xml_json\\src\\main\\java\\xmls\\marshal_test.xml");


        LetsGoGson letsGoGson = new LetsGoGson();

        letsGoGson.xmlToJson(testFileXml,testFileJson);
        letsGoGson.jsonToXml(testFileJson,testFileXml2);





        }


    }


