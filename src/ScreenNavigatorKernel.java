
import components.standard.Standard;

/**
 * Kernel interface for ScreenNavigator components.
 */
public interface ScreenNavigatorKernel extends Standard<ScreenNavigator> {

    /**
     * Adds a screen to the navigation stack.
     *
     * @param screen
     *            the screen to add
     * @updates this
     * @ensures screen is added to this
     */
    void push(String screen);

    /**
     * Removes and returns the most recent screen.
     *
     * @return the removed screen
     * @updates this
     * @requires this is not empty
     * @ensures pop is the last screen added
     */
    String pop();

    /**
     * Reports whether the navigation stack is empty.
     *
     * @return true if empty
     * @ensures isEmpty = (this has no screens)
     */
    boolean isEmpty();
}
