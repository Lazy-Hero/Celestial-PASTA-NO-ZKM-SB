/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.io.Serializable;

public class eT
extends eD
implements Serializable {
    static final /* synthetic */ long serialVersionUID = -105080578052502155L;

    public eT(byte[] arrby) {
        super(arrby);
    }

    public eT(Color color) {
        super((byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue(), (byte)color.getAlpha());
    }

    public final void a(Color color) {
        this.c = (byte)color.getRed();
        this.a = (byte)color.getGreen();
        this.d = (byte)color.getBlue();
        this.b = (byte)color.getAlpha();
    }

    public eT(eT eT2) {
        super(eT2);
    }

    public eT() {
    }

    public eT(byte by2, byte by3, byte by4, byte by5) {
        super(by2, by3, by4, by5);
    }

    public eT(eD eD2) {
        super(eD2);
    }

    public final Color a() {
        int n2 = this.c & 0xFF;
        int n3 = this.a & 0xFF;
        int n4 = this.d & 0xFF;
        int n5 = this.b & 0xFF;
        return new Color(n2, n3, n4, n5);
    }
}

