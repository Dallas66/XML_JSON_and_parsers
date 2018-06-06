package conversions;

import entity.Category;
import entity.Product;
import entity.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class Unmarsh {

    public Shop unMarshall(File file) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Shop.class);
        Unmarshaller ju = jc.createUnmarshaller();
        Shop shop =(Shop) ju.unmarshal(file);


        return shop;
    }
}
