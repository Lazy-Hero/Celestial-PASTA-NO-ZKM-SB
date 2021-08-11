/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.io.Serializable;

public class W
extends U
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -1861792981817493659L;

    public W(Color color) {
        super((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
    }

    public W() {
    }

    public final Color a() {
        int n2 = Math.round(this.c * 255.0f);
        int n3 = Math.round(this.a * 255.0f);
        int n4 = Math.round(this.b * 255.0f);
        return new Color(n2, n3, n4);
    }

    public W(W w2) {
        super(w2);
    }

    public W(U u2) {
        super(u2);
    }

    public W(float[] arrf) {
        super(arrf);
    }

    public W(o o2) {
        super(o2);
    }

    public final void a(Color color) {
        this.c = (float)color.getRed() / 255.0f;
        this.a = (float)color.getGreen() / 255.0f;
        this.b = (float)color.getBlue() / 255.0f;
    }

    public W(float f10, float f11, float f12) {
        super(f10, f11, f12);
    }
}

