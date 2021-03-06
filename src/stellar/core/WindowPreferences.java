package stellar.core;

import javax.swing.JFrame;
import java.awt.Component;

public class WindowPreferences {

    private boolean resizable = false, focusable = true;
    private Component relativeLocation = null;
    private int closeOperation = JFrame.EXIT_ON_CLOSE;

    /**
     * Initialize the frame.
     *
     * @param resizable        resizable or not.
     * @param focusable        focusable or not.
     * @param relativeLocation relative starting location.
     * @param closeOperation   close operation.
     */
    public WindowPreferences(boolean resizable, boolean focusable, Component relativeLocation, int closeOperation) {
        this.resizable = resizable;
        this.focusable = focusable;
        this.relativeLocation = relativeLocation;
        this.closeOperation = closeOperation;
    }

    /**
     * Initialize the frame.
     *
     * @param resizable resizable or not.
     * @param focusable focusable or not.
     */
    public WindowPreferences(boolean resizable, boolean focusable) {
        this(resizable, focusable, null, JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @return if the window is resizable.
     */
    public boolean isResizable() {
        return resizable;
    }

    /**
     * @return if the window is focusable.
     */
    public boolean isFocusable() {
        return focusable;
    }

    /**
     * @return the default relative starting location, (usually null)
     */
    public Component getRelativeLocation() {
        return relativeLocation;
    }

    /**
     * @return the default close operation.
     */
    public int getCloseOperation() {
        return closeOperation;
    }

    /**
     * Set if the frame is resizable or not.
     */
    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    /**
     * Set if the frame is focusable or not.
     */
    public void setFocusable(boolean focusable) {
        this.focusable = focusable;
    }

    /**
     * Set the relative frame location.
     */
    public void setRelativeLocation(Component relativeLocation) {
        this.relativeLocation = relativeLocation;
    }

    /**
     * Set the default close operation.
     */
    public void setCloseOperation(int closeOperation) {
        this.closeOperation = closeOperation;
    }

    /**
     * Generate a default template.
     *
     * @return a new instance of this class.
     */
    public static WindowPreferences defaultTemplate() {
        return new WindowPreferences(false, true);
    }

}
