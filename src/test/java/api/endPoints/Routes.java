package api.endPoints;

public class Routes {
    public static String baseUri = "https://petstore.swagger.io/v2";
    public static String apiKey = "special-key";

    // User Module
    public static String post_url = baseUri + "/user";
    public static String get_url = baseUri + "/user/{username}";
    public static String update_url = baseUri + "/user/{username}";
    public static String delete_url = baseUri + "/user/{username}";

    // Store Module

    // Pet Module
    public static String add_pet_url = baseUri + "/pet";
    public static String get_pet_uri = baseUri + "/pet/{petId}";
    public static String get_pet_byStatus_uri = baseUri + "/pet/findByStatus";
    public static String updatePet_uri = baseUri + "/pet";
}
