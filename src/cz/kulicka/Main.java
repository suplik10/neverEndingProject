package cz.kulicka;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "input.json";

        File jsonFile = new File("input.json");

        final String[] content = {""};

        //read file into stream, try-with-resources
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//            stream.forEach((v)-> content[0] +=v);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        ObjectMapper objectMapper = new ObjectMapper();

        Market result = null;
        try {
             result = objectMapper.readValue(jsonFile, Market.class);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }

        Market v = result;

//        try {
//
//            URL url = new URL("http://www.worldcoinindex.com/apiservice/json?key=gqbd0KQ7dBQHkfQacCunQF3zA3AHhO");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.setRequestProperty("Accept", "application/json");
//
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//
//            String output;
//            System.out.println("Output from Server .... \n");
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//            }
//
//            conn.disconnect();
//
//        } catch (MalformedURLException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
    }
}
