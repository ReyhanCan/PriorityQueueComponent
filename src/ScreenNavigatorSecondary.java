/**
 * Secondary methods for ScreenNavigator.
 */
public abstract class ScreenNavigatorSecondary implements ScreenNavigator {

    @Override
    public String top() {
        assert !this.isEmpty() : "Violation of: this is not empty";

        String topScreen = this.pop();
        this.push(topScreen);
        return topScreen;
    }

    @Override
    public int size() {
        int count = 0;
        ScreenNavigator temp = this.newInstance();

        while (!this.isEmpty()) {
            temp.push(this.pop());
            count++;
        }

        while (!temp.isEmpty()) {
            this.push(temp.pop());
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ScreenNavigator temp = this.newInstance();

        result.append("<");
        boolean first = true;

        while (!this.isEmpty()) {
            String screen = this.pop();

            if (!first) {
                result.append(", ");
            }
            result.append(screen);

            temp.push(screen);
            first = false;
        }

        while (!temp.isEmpty()) {
            this.push(temp.pop());
        }

        result.append(">");
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ScreenNavigator)) {
            return false;
        }

        ScreenNavigator other = (ScreenNavigator) obj;

        ScreenNavigator tempThis = this.newInstance();
        ScreenNavigator tempOther = other.newInstance();

        boolean isEqual = true;

        while (!this.isEmpty() && !other.isEmpty()) {
            String thisScreen = this.pop();
            String otherScreen = other.pop();

            if (!thisScreen.equals(otherScreen)) {
                isEqual = false;
            }

            tempThis.push(thisScreen);
            tempOther.push(otherScreen);
        }

        if (!this.isEmpty() || !other.isEmpty()) {
            isEqual = false;
        }

        while (!tempThis.isEmpty()) {
            this.push(tempThis.pop());
        }

        while (!tempOther.isEmpty()) {
            other.push(tempOther.pop());
        }

        return isEqual;
    }
}
