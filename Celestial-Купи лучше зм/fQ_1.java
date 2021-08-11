/*
 * Decompiled with CFR 0.150.
 */
public final class fQ {
    private final /* synthetic */ String e;
    private /* synthetic */ String c;
    private /* synthetic */ d9 a;
    private /* synthetic */ String b;
    private static /* synthetic */ int d;

    public String f() {
        return this.c;
    }

    public fQ(String string, String string2, d9 d92) {
        this(string, string2, "", d92);
    }

    static {
        if (fQ.e() == 0) {
            fQ.b(32);
        }
    }

    public void b(String string) {
        this.b = string;
    }

    public fQ(String string, String string2) {
        this(string, string2, d9.Unchecked);
    }

    public static int d() {
        return d;
    }

    public void a(String string) {
        this.c = string;
    }

    public void a(d9 d92) {
        this.a = d92;
    }

    public static int e() {
        int n2 = fQ.d();
        if (n2 == 0) {
            return 108;
        }
        return 0;
    }

    public static void b(int n2) {
        d = n2;
    }

    public d9 a() {
        return this.a;
    }

    public String c() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public fQ(String string, String string2, String string3, d9 d92) {
        this.b = "";
        this.e = string;
        this.c = string2;
        this.b = string3;
        this.a = d92;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

