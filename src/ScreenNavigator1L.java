import java.util.Stack;

/**
 * ScreenNavigator implementation using a Stack.
 *
 * Convention: rep is not null.
 *
 * Correspondence: this = the sequence of screens stored in rep, where the top
 * of the stack represents the most recent screen.
 */
public final class ScreenNavigator1L extends ScreenNavigatorSecondary {

    /*
     * Private members
     */
    private Stack<String> rep;

    /**
     * Creates initial representation.
     */
    private void createNewRep() {
        this.rep = new Stack<>();
    }

    /*
     * Constructors
     */
    public ScreenNavigator1L() {
        this.createNewRep();
    }

    /*
     * Standard methods
     */
    @Override
    public final ScreenNavigator newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(ScreenNavigator source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof ScreenNavigator1L : "Violation of: source is of dynamic type ScreenNavigator1L";

        ScreenNavigator1L localSource = (ScreenNavigator1L) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods
     */

    @Override
    public final void push(String screen) {
        assert screen != null : "Violation of: screen is not null";
        this.rep.push(screen);
    }

    @Override
    public final String pop() {
        assert !this.rep.isEmpty() : "Violation of: this is not empty";
        return this.rep.pop();
    }

    @Override
    public final boolean isEmpty() {
        return this.rep.isEmpty();
    }
}