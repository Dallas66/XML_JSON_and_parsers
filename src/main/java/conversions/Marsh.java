package conversions;

import entity.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Marsh {

    public void marshall(Shop shop, File file) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Shop.class);
        Marshaller ma = jc.createMarshaller();
        ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        ma.marshal(shop, file);
    }
}
