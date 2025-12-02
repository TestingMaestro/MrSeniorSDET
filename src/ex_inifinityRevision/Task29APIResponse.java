package ex_inifinityRevision;

public class Task29APIResponse {
    static void main(String[] args) {

        String response = "{\"status\":\"success\",\"id\":456,\"role\":\"admin\"}";

        // Start Index
        int index = response.indexOf("\"id\":");
        System.out.println(index);

        //start
        int start = index + 5;

        // end
        int end = response.indexOf(",", start);

        //Extract substring
        String idValue = response.substring(start, end).trim();
        System.out.println("ID --> " + idValue);


    }
}
