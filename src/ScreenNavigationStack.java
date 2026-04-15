import java.util.ArrayList;

public class ScreenNavigationStack extends ScreenNavigatorSecondary {

    private ArrayList<String> screens;

    public ScreenNavigationStack() {
        this.screens = new ArrayList<>();
    }

    @Override
    public void push(String screen) {
        this.screens.add(screen);
    }

    @Override
    public String pop() {
        assert !this.isEmpty() : "Violation of: this is not empty";
        return this.screens.remove(this.screens.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.screens.isEmpty();
    }

    @Override
    public ScreenNavigator newInstance() {
        return new ScreenNavigationStack();
    }

    @Override
    public void clear() {
        this.screens.clear();
    }

    @Override
    public void transferFrom(ScreenNavigator source) {
        ScreenNavigationStack localSource = (ScreenNavigationStack) source;
        this.screens = localSource.screens;
        localSource.screens = new ArrayList<>();
    }
}
