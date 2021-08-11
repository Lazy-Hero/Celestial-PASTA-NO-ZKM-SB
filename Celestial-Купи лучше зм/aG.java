/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.io.Serializable;

public class aG
extends ae
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 8577680141580006740L;

    public aG(Color color) {
        super((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public aG(ae ae2) {
        super(ae2);
    }

    public aG(float f10, float f11, float f12, float f13) {
        super(f10, f11, f12, f13);
    }

    public aG(float[] arrf) {
        super(arrf);
    }

    public aG(aG aG2) {
        super(aG2);
    }

    public aG(gS gS2) {
        super(gS2);
    }

    public final void a(Color color) {
        this.c = (float)color.getRed() / 255.0f;
        this.a = (float)color.getGreen() / 255.0f;
        this.b = (float)color.getBlue() / 255.0f;
        this.d = (float)color.getAlpha() / 255.0f;
    }

    public aG() {
    }

    public final Color a() {
        int n2 = Math.round(this.c * 255.0f);
        int n3 = Math.round(this.a * 255.0f);
        int n4 = Math.round(this.b * 255.0f);
        int n5 = Math.round(this.d * 255.0f);
        return new Color(n2, n3, n4, n5);
    }
}

