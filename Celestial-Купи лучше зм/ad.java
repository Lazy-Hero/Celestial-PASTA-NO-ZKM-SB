/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.io.Serializable;

public class ad
extends ai
implements Serializable {
    static final /* synthetic */ long serialVersionUID = 6632576088353444794L;

    public final void a(Color color) {
        this.a = (byte)color.getRed();
        this.b = (byte)color.getGreen();
        this.c = (byte)color.getBlue();
    }

    public ad(ai ai2) {
        super(ai2);
    }

    public ad(Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue());
    }

    public ad(byte[] arrby) {
        super(arrby);
    }

    public ad(byte by2, byte by3, byte by4) {
        super(by2, by3, by4);
    }

    public final Color a() {
        int n2 = this.a & 0xFF;
        int n3 = this.b & 0xFF;
        int n4 = this.c & 0xFF;
        return new Color(n2, n3, n4);
    }

    public ad(ad ad2) {
        super(ad2);
    }

    public ad() {
    }
}

