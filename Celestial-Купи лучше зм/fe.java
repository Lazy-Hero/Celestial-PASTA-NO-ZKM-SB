/*
 * Decompiled with CFR 0.150.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class fe
implements du,
an {
    private static /* synthetic */ int b;
    private /* synthetic */ boolean a;

    @Override
    public void a(boolean bl2) {
        this.a = bl2;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        int n2 = fe.b();
        if (n2 == 0) {
            return 39;
        }
        return 0;
    }

    static {
        if (fe.b() == 0) {
            fe.b(121);
        }
    }

    protected fe() {
    }

    @Override
    public boolean a() {
        return this.a;
    }

    public static void b(int n2) {
        b = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

