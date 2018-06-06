package gson;

import com.google.gson.Gson;
import conversions.Marsh;
import conversions.Unmarsh;
import entity.Shop;


import javax.xml.bind.JAXBException;
import java.io.*;

public class LetsGoGson {

    public void jsonToXml(File json, File xml) throws IOException, JAXBException {
        Reader reader =  new FileReader(json);
        Gson gson = new Gson();
        Shop shop = gson.fromJson(reader,Shop.class);
        reader.close();

        Marsh marshalle = new Marsh();
        marshalle.marshall(shop,xml);
    }

    public void xmlToJson(File xml, File json) throws JAXBException, IOException {
        Writer writer = new FileWriter(json);
        Unmarsh unmarshall = new Unmarsh();
        Shop shop = unmarshall.unMarshall(xml);
        Gson gson = new Gson();
        gson.toJson(shop,writer);
        writer.close();
    }
}
