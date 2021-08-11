/*
 * Decompiled with CFR 0.150.
 */
public class e3 {
    private final /* synthetic */ int b;
    private final /* synthetic */ int a;

    public int a() {
        return this.b;
    }

    public String toString() {
        return "min: " + this.a + ", max: " + this.b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(int n2) {
        int n3;
        block5: {
            int n4;
            block4: {
                String string = K.d();
                n3 = n2;
                n4 = this.a;
                if (string != null) break block4;
                if (n3 < n4) {
                    return false;
                }
                n3 = n2;
                if (string != null) break block5;
                n4 = this.b;
            }
            n3 = n3 <= n4 ? 1 : 0;
        }
        return n3 != 0;
    }

    public e3(int n2, int n3) {
        this.a = Math.min(n2, n3);
        this.b = Math.max(n2, n3);
    }

    public int b() {
        return this.a;
    }
}

