/**
 * Enhanced interface for ScreenNavigator components.
 */
public interface ScreenNavigator extends ScreenNavigatorKernel {

    /**
     * Returns the current screen without removing it.
     *
     * @return current screen
     * @requires this is not empty
     * @ensures top is the most recent screen
     */
    String top();

    /**
     * Reports the number of screens in the navigation stack.
     *
     * @return number of screens
     * @ensures size = number of screens in this
     */
    int size();
}