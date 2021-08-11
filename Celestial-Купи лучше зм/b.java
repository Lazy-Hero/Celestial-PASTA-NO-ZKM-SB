/*
 * Decompiled with CFR 0.150.
 */
public class b {
    public static final /* synthetic */ int i;
    private final /* synthetic */ String b;
    private final /* synthetic */ String e;
    private final /* synthetic */ String c;
    public static final /* synthetic */ int h;
    private final /* synthetic */ int a;
    public static final /* synthetic */ int f;
    public static final /* synthetic */ int d;
    public static final /* synthetic */ int g;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, boolean bl2) {
        String string2 = dB.i();
        boolean bl3 = this.e(string);
        if (string2 != null) {
            if (!bl3) return false;
            bl3 = this.b();
        }
        if (string2 == null) return bl3;
        if (bl3 != bl2) return false;
        return true;
    }

    public boolean h() {
        String string = dB.i();
        boolean bl2 = this.a;
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, String string2, String string3, boolean bl2) {
        String string4 = dB.i();
        boolean bl3 = this.a(string, string2, string3);
        if (string4 != null) {
            if (!bl3) return false;
            bl3 = this.b();
        }
        if (string4 == null) return bl3;
        if (bl3 != bl2) return false;
        return true;
    }

    public boolean e() {
        String string = dB.i();
        boolean bl2 = this.a;
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(String string, String string2) {
        String string3 = dB.i();
        boolean bl2 = this.c(string);
        if (string3 != null) {
            if (!bl2) return false;
            bl2 = string2.equals(this.c);
        }
        if (string3 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e(String string) {
        String string2 = dB.i();
        boolean bl2 = this.e();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = string.equals(this.b);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d(String string) {
        String string2 = dB.i();
        boolean bl2 = this.c();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = string.equals(this.b);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public b(int n2, String string, String string2, String string3) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.e = string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f(String string) {
        String string2 = dB.i();
        boolean bl2 = this.e();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = this.b.endsWith(string);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(String string, boolean bl2) {
        String string2 = dB.i();
        boolean bl3 = this.f(string);
        if (string2 != null) {
            if (!bl3) return false;
            bl3 = this.b();
        }
        if (string2 == null) return bl3;
        if (bl3 != bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, String string2, boolean bl2) {
        String string3 = dB.i();
        boolean bl3 = this.a(string, string2);
        if (string3 != null) {
            if (!bl3) return false;
            bl3 = this.b();
        }
        if (string3 == null) return bl3;
        if (bl3 != bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(String string) {
        String string2 = dB.i();
        boolean bl2 = this.h();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = this.b.endsWith(string);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(String string) {
        String string2 = dB.i();
        boolean bl2 = this.j();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = string.equals(this.b);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public String i() {
        return this.c;
    }

    public String g() {
        return this.b;
    }

    static {
        f = 2;
        g = 4;
        d = 5;
        i = 1;
        h = 3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        String string = this.c.toLowerCase();
        String string2 = dB.i();
        boolean bl2 = string.equals("true");
        if (string2 == null) return bl2;
        if (!bl2) {
            bl2 = string.equals("false");
            if (string2 == null) return bl2;
            if (!bl2) {
                throw new RuntimeException("Invalid boolean: " + this.c + ", line: " + this.e);
            }
        }
        bl2 = Boolean.valueOf(this.c);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string) {
        String string2 = dB.i();
        boolean bl2 = this.h();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = string.equals(this.b);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, String string2, String string3) {
        String string4 = dB.i();
        boolean bl2 = this.e(string);
        if (string4 == null) return bl2;
        if (bl2) return true;
        bl2 = this.e(string2);
        if (string4 == null) return bl2;
        if (bl2) return true;
        bl2 = this.e(string3);
        if (string4 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string, String string2) {
        String string3 = dB.i();
        boolean bl2 = this.e(string);
        if (string3 == null) return bl2;
        if (bl2) return true;
        bl2 = this.e(string2);
        if (string3 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public boolean c() {
        String string = dB.i();
        boolean bl2 = this.a;
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public boolean j() {
        String string = dB.i();
        boolean bl2 = this.a;
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public int d() {
        try {
            return Integer.parseInt(this.c);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid integer: " + this.c + ", line: " + this.e);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g(String string) {
        String string2 = dB.i();
        boolean bl2 = this.a();
        if (string2 != null) {
            if (!bl2) return false;
            bl2 = string.equals(this.b);
        }
        if (string2 == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public float f() {
        try {
            return Float.parseFloat(this.c);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid float: " + this.c + ", line: " + this.e);
        }
    }

    public int k() {
        return this.a;
    }

    public boolean a() {
        String string = dB.i();
        boolean bl2 = this.a;
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }
}

