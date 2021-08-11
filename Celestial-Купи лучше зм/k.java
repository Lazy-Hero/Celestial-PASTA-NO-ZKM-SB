/*
 * Decompiled with CFR 0.150.
 */
public class k {
    private final /* synthetic */ int c;
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ int d;

    public int c() {
        return this.a;
    }

    public int a() {
        return this.c;
    }

    public k(int n2, int n3) {
        this(n2, n3, 0);
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        String string = K.d();
        String string2 = this.b;
        if (string == null) {
            string2 = string2 == null ? "" + this.c + "." + this.d + "." + this.a : "" + this.c + "." + this.d + "." + this.a + this.b;
        }
        return string2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k(int n2, int n3, int n4, String string) {
        this.c = n2;
        this.d = n3;
        this.a = n4;
        this.b = string;
    }

    public k(int n2, int n3, int n4) {
        this(n2, n3, n4, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        int n2;
        String string = K.d();
        int n3 = this.d;
        int n4 = 9;
        if (string == null) {
            if (n3 > n4) {
                return this.c * 100 + this.d;
            }
            n3 = this.a;
            n4 = 9;
        }
        if (string == null) {
            if (n3 > n4) {
                n2 = this.c * 100 + this.d * 10 + 9;
                return n2;
            }
            n3 = this.c * 100 + this.d * 10;
            n4 = this.a;
        }
        n2 = n3 + n4;
        return n2;
    }
}

