/*
 * Decompiled with CFR 0.150.
 */
public class aJ {
    private final /* synthetic */ R[] b;
    private final /* synthetic */ int a;

    public aJ(int n2, R[] arrr) {
        this.a = n2;
        this.b = arrr;
    }

    public int a() {
        return this.a;
    }

    public int[] b() {
        int[] arrn;
        block2: {
            int[] arrn2 = new int[this.b.length];
            String string = dB.i();
            for (int i2 = 0; i2 < arrn2.length; ++i2) {
                arrn = arrn2;
                if (string != null) {
                    arrn[i2] = this.b[i2].a();
                    if (string != null) continue;
                }
                break block2;
            }
            arrn = arrn2;
        }
        return arrn;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(int n2, int n3) {
        boolean bl2;
        block4: {
            int n4 = 0;
            String string = dB.i();
            while (n4 < this.b.length) {
                R r2 = this.b[n4];
                if (string != null) {
                    bl2 = r2.a(n2, n3);
                    if (string == null) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n4;
                }
                if (string != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }
}

