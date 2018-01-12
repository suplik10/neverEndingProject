package cz.kulicka.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.kulicka.entities.AllPrice;
import org.junit.Assert;
import org.junit.Test;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class AllPriceTest {

    @Test
    public void allPriceJsonMapper() throws IOException {

        File jsonFile = new File("allPrices.json");

        final String[] content = {""};
        ObjectMapper objectMapper = new ObjectMapper();

        List<AllPrice> result = null;
        try {
            result = objectMapper.readValue(jsonFile, new TypeReference<List<AllPrice>>(){});
            //result = objectMapper.readValue(jsonFile, AllPrice.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(result);

    }
}
