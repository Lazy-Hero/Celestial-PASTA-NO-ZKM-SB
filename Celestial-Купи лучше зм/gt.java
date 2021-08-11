/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.DisplayMode
 */
import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

public class gt
implements Comparator {
    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int compare(Object object, Object object2) {
        DisplayMode displayMode = (DisplayMode)object;
        DisplayMode displayMode2 = (DisplayMode)object2;
        String string = K.d();
        int n2 = displayMode.getWidth();
        int n3 = displayMode2.getWidth();
        if (string == null) {
            if (n2 != n3) {
                return displayMode.getWidth() - displayMode2.getWidth();
            }
            n2 = displayMode.getHeight();
            n3 = displayMode2.getHeight();
        }
        if (string == null) {
            if (n2 != n3) {
                return displayMode.getHeight() - displayMode2.getHeight();
            }
            n2 = displayMode.getBitsPerPixel();
            n3 = displayMode2.getBitsPerPixel();
        }
        if (string == null) {
            if (n2 != n3) {
                return displayMode.getBitsPerPixel() - displayMode2.getBitsPerPixel();
            }
            n2 = displayMode.getFrequency();
            n3 = displayMode2.getFrequency();
        }
        if (string == null) {
            if (n2 == n3) return 0;
            n2 = displayMode.getFrequency();
            n3 = displayMode2.getFrequency();
        }
        int n4 = n2 - n3;
        return n4;
    }
}

