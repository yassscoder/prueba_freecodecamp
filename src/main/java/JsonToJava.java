import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
    public static void main (String[] st) {
        String jsonStr = "{\r\n" +
                "\"name\":\"Pedro\"\r\n" + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
        Prueba prueba = ObjectMapper.readValue(jsonStr, Prueba.class);
        System.out.println("Name: " + prueba.getName() + "curso completado: " + prueba.getCompletedChallenges());
        }
        catch (JsonProcessingException e) {e.printStackTrace();
        }
    }
}
