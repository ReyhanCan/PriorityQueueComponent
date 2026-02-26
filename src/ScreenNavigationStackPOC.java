import java.util.ArrayList;

public class ScreenNavigationStackPOC {

    /**
     * Proof of Concept for ScreenNavigationStack
     *
     * @author Reyhan Can
     */

    // representation (field)
    private ArrayList<String> screens;

    // constructor
    public ScreenNavigationStackPOC() {
        this.screens = new ArrayList<>();
    }

    // push screen
    public void push(String screen) {
        this.screens.add(screen);
    }

    // pop screen
    public String pop() {
        if (!this.isEmpty()) {
            return this.screens.remove(this.screens.size() - 1);
        }
        return null;
    }

    // top screen
    public String top() {
        if (!this.isEmpty()) {
            return this.screens.get(this.screens.size() - 1);
        }
        return null;
    }

    // size
    public int size() {
        return this.screens.size();
    }

    // is empty
    public boolean isEmpty() {
        return this.screens.isEmpty();
    }

    // clear navigation
    public void clear() {
        this.screens.clear();
    }

    // contains screen
    public boolean contains(String screen) {
        return this.screens.contains(screen);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        ScreenNavigationStackPOC nav = new ScreenNavigationStackPOC();

        nav.push("Home");
        nav.push("Profile");
        nav.push("Settings");

        System.out.println("Top Screen: " + nav.top());

        nav.pop();

        System.out.println("After Pop Top: " + nav.top());

        System.out.println("Contains Home? " + nav.contains("Home"));

        System.out.println("Size: " + nav.size());

        nav.clear();

        System.out.println("Is Empty? " + nav.isEmpty());
    }

}
