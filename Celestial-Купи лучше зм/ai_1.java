/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class ai
implements Serializable,
Cloneable {
    public /* synthetic */ byte b;
    public /* synthetic */ byte c;
    public /* synthetic */ byte a;
    static final /* synthetic */ long serialVersionUID = -483782685323607044L;

    public final byte c() {
        return this.a;
    }

    public final void a(byte by2) {
        this.a = by2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(ai ai2) {
        byte by2;
        byte by3;
        block8: {
            int n2;
            block7: {
                n2 = ae.g();
                try {
                    by3 = this.a;
                    by2 = ai2.a;
                    if (n2 != 0) break block7;
                    if (by3 != by2) return 0 != 0;
                }
                catch (NullPointerException nullPointerException) {
                    return false;
                }
                by3 = this.b;
                by2 = ai2.b;
            }
            if (n2 != 0) break block8;
            if (by3 != by2) return 0 != 0;
            by3 = this.c;
            if (n2 != 0) return by3 != 0;
            by2 = ai2.c;
        }
        if (by3 != by2) return 0 != 0;
        return 1 != 0;
    }

    public final byte a() {
        return this.b;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public ai(byte by2, byte by3, byte by4) {
        this.a = by2;
        this.b = by3;
        this.c = by4;
    }

    public ai(ai ai2) {
        this.a = ai2.a;
        this.b = ai2.b;
        this.c = ai2.c;
    }

    public final void a(byte[] arrby) {
        this.a = arrby[0];
        this.b = arrby[1];
        this.c = arrby[2];
    }

    public String toString() {
        return "(" + (this.a & 0xFF) + ", " + (this.b & 0xFF) + ", " + (this.c & 0xFF) + ")";
    }

    public final void b(byte[] arrby) {
        arrby[0] = this.a;
        arrby[1] = this.b;
        arrby[2] = this.c;
    }

    public final void c(byte by2) {
        this.b = by2;
    }

    public ai() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        byte by2;
        byte by3;
        block9: {
            ai ai2;
            int n2;
            block8: {
                n2 = ae.g();
                ai2 = (ai)object;
                by3 = this.a;
                by2 = ai2.a;
                if (n2 != 0) break block8;
                if (by3 != by2) return 0 != 0;
                by3 = this.b;
                by2 = ai2.b;
            }
            if (n2 != 0) break block9;
            if (by3 != by2) return 0 != 0;
            by3 = this.c;
            if (n2 != 0) return by3 != 0;
            by2 = ai2.c;
        }
        try {
            if (by3 != by2) return 0 != 0;
            return 1 != 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        return (this.a & 0xFF) << 0 | (this.b & 0xFF) << 8 | (this.c & 0xFF) << 16;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public ai(byte[] arrby) {
        this.a = arrby[0];
        this.b = arrby[1];
        this.c = arrby[2];
    }

    public final void a(ai ai2) {
        this.a = ai2.a;
        this.b = ai2.b;
        this.c = ai2.c;
    }

    public final byte b() {
        return this.c;
    }

    public final void b(byte by2) {
        this.c = by2;
    }

    public final void b(ai ai2) {
        ai2.a = this.a;
        ai2.b = this.b;
        ai2.c = this.c;
    }
}

