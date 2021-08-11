/*
 * Decompiled with CFR 0.150.
 */
public class ax {
    private /* synthetic */ K[] d;
    private final /* synthetic */ Class c;
    private /* synthetic */ int a;
    private final /* synthetic */ aI b;

    public int c() {
        return this.a;
    }

    public ax(aI aI2, Class class_, int n2) {
        this.b = aI2;
        this.c = class_;
        if (aI2.c() && class_ != null) {
            this.d = new K[n2];
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                this.d[i2] = new K(aI2, class_, i2);
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public K a(int n2) {
        String string = K.d();
        int n3 = n2;
        if (string == null) {
            if (n3 < 0) return null;
            n3 = n2;
        }
        if (n3 >= this.d.length) return null;
        K k2 = this.d[n2];
        return k2;
    }

    public Class a() {
        return this.c;
    }

    public aI b() {
        return this.b;
    }
}

