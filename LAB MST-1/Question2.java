import java.util.HashMap;

public class Question2 {
    private HashMap<Integer, String> map = new HashMap<>();

    // inner custom exception
    class NotFound extends Exception {
        NotFound(String msg) {
            super(msg);
        }
    }

    // add human
    public void addHuman(int id, String name) {
        map.put(id, name);
    }

    // get human
    public String getHuman(int id) throws NotFound {
        if (!map.containsKey(id)) throw new NotFound("ID " + id + " not found");
        return map.get(id);
    }

    public static void main(String[] args) {
        Question2 h = new Question2();
        h.addHuman(1, "Ram");
        h.addHuman(2, "Shyam");

        try {
            System.out.println(h.getHuman(1));
            System.out.println(h.getHuman(3));
        } catch (Question2.NotFound e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
