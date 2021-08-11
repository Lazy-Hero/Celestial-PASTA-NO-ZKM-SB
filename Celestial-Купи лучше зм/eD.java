/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class eD
implements Cloneable,
Serializable {
    static final /* synthetic */ long serialVersionUID = -8226727741811898211L;
    public /* synthetic */ byte c;
    public /* synthetic */ byte a;
    public /* synthetic */ byte d;
    public /* synthetic */ byte b;

    public final void a(byte[] arrby) {
        this.c = arrby[0];
        this.a = arrby[1];
        this.d = arrby[2];
        this.b = arrby[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        byte by2;
        byte by3;
        block12: {
            eD eD2;
            int n2;
            block11: {
                block10: {
                    n2 = ae.g();
                    eD2 = (eD)object;
                    by3 = this.c;
                    by2 = eD2.c;
                    if (n2 != 0) break block10;
                    if (by3 != by2) return 0 != 0;
                    by3 = this.a;
                    by2 = eD2.a;
                }
                if (n2 != 0) break block11;
                if (by3 != by2) return 0 != 0;
                by3 = this.d;
                by2 = eD2.d;
            }
            if (n2 != 0) break block12;
            if (by3 != by2) return 0 != 0;
            by3 = this.b;
            if (n2 != 0) return by3 != 0;
            by2 = eD2.b;
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

    public final void b(byte by2) {
        this.b = by2;
    }

    public final void c(byte by2) {
        this.c = by2;
    }

    public String toString() {
        return "(" + (this.c & 0xFF) + ", " + (this.a & 0xFF) + ", " + (this.d & 0xFF) + ", " + (this.b & 0xFF) + ")";
    }

    public final void a(eD eD2) {
        eD2.c = this.c;
        eD2.a = this.a;
        eD2.d = this.d;
        eD2.b = this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(eD eD2) {
        byte by2;
        byte by3;
        block11: {
            int n2;
            block10: {
                block9: {
                    n2 = ae.g();
                    try {
                        by3 = this.c;
                        by2 = eD2.c;
                        if (n2 != 0) break block9;
                        if (by3 != by2) return 0 != 0;
                    }
                    catch (NullPointerException nullPointerException) {
                        return false;
                    }
                    by3 = this.a;
                    by2 = eD2.a;
                }
                if (n2 != 0) break block10;
                if (by3 != by2) return 0 != 0;
                by3 = this.d;
                by2 = eD2.d;
            }
            if (n2 != 0) break block11;
            if (by3 != by2) return 0 != 0;
            by3 = this.b;
            if (n2 != 0) return by3 != 0;
            by2 = eD2.b;
        }
        if (by3 != by2) return 0 != 0;
        return 1 != 0;
    }

    public eD() {
        this.c = 0;
        this.a = 0;
        this.d = 0;
        this.b = 0;
    }

    public final byte a() {
        return this.c;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public eD(byte[] arrby) {
        this.c = arrby[0];
        this.a = arrby[1];
        this.d = arrby[2];
        this.b = arrby[3];
    }

    public final void a(byte by2) {
        this.d = by2;
    }

    public final void b(byte[] arrby) {
        arrby[0] = this.c;
        arrby[1] = this.a;
        arrby[2] = this.d;
        arrby[3] = this.b;
    }

    public final byte c() {
        return this.b;
    }

    public final void c(eD eD2) {
        this.c = eD2.c;
        this.a = eD2.a;
        this.d = eD2.d;
        this.b = eD2.b;
    }

    public final byte d() {
        return this.a;
    }

    public final void d(byte by2) {
        this.a = by2;
    }

    public eD(byte by2, byte by3, byte by4, byte by5) {
        this.c = by2;
        this.a = by3;
        this.d = by4;
        this.b = by5;
    }

    public int hashCode() {
        return (this.c & 0xFF) << 0 | (this.a & 0xFF) << 8 | (this.d & 0xFF) << 16 | (this.b & 0xFF) << 24;
    }

    public eD(eD eD2) {
        this.c = eD2.c;
        this.a = eD2.a;
        this.d = eD2.d;
        this.b = eD2.b;
    }

    public final byte b() {
        return this.d;
    }
}

