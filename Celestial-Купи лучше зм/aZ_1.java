/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Font;
import net.minecraft.ar.v;
import net.minecraft.client.Q;

public class aZ {
    public static Font a(v v2, float f10, int n2) {
        try {
            Font font = Font.createFont(n2, Q.P().O().a(v2).c());
            font = font.deriveFont(f10);
            return font;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

