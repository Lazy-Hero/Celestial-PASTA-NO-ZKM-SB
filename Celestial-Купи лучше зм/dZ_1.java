/*
 * Decompiled with CFR 0.150.
 */
public class dZ {
    private final /* synthetic */ int a;
    private /* synthetic */ int[] b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2) {
        String string = K.d();
        if (this.b == null) return false;
        boolean bl2 = fU.a(n2, this.b);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public int b() {
        return this.a;
    }

    public boolean b(int n2) {
        String string = K.d();
        dZ dZ2 = this;
        if (string == null) {
            if (dZ2.b == null) {
                this.b = new int[]{n2};
                return true;
            }
            dZ2 = this;
        }
        boolean bl2 = dZ2.a(n2);
        if (string == null) {
            if (bl2) {
                return false;
            }
            this.b = fU.a(this.b, n2);
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3) {
        String string = K.d();
        dZ dZ2 = this;
        if (string == null) {
            if (dZ2.a != n2) {
                return false;
            }
            dZ2 = this;
        }
        if (dZ2.b == null) return true;
        boolean bl2 = fU.a(n3, this.b);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public String toString() {
        return this.b == null ? "" + this.a : "" + this.a + ":" + fU.a(this.b);
    }

    public dZ(int n2, int[] arrn) {
        this.a = n2;
        this.b = arrn;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public dZ(int n2, int n3) {
        this(n2, new int[]{n3});
    }

    public int[] a() {
        return this.b;
    }

    public dZ(int n2) {
        this(n2, null);
    }
}

