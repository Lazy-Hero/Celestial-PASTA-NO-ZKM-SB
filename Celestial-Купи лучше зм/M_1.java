/*
 * Decompiled with CFR 0.150.
 */
public final class M
extends Enum<M> {
    private static /* synthetic */ boolean b;
    public static final /* synthetic */ /* enum */ M ADD;
    public static final /* synthetic */ /* enum */ M FIXED;
    public static final /* synthetic */ /* enum */ M NONE;
    public static final /* synthetic */ /* enum */ M RECODE;
    private static final /* synthetic */ M[] c;
    public static final /* synthetic */ /* enum */ M MOVED;
    public static final /* synthetic */ /* enum */ M IMPROVED;
    public static final /* synthetic */ /* enum */ M DELETE;
    public static final /* synthetic */ /* enum */ M NEW;

    public static M valueOf(String string) {
        return Enum.valueOf(M.class, string);
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static boolean c() {
        boolean bl2 = M.b();
        return !bl2;
    }

    public static M[] values() {
        return (M[])c.clone();
    }

    static {
        ADD = new M();
        DELETE = new M();
        IMPROVED = new M();
        M.b(true);
        RECODE = new M();
        FIXED = new M();
        NONE = new M();
        MOVED = new M();
        NEW = new M();
        c = new M[]{ADD, DELETE, IMPROVED, RECODE, FIXED, NONE, MOVED, NEW};
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static boolean b() {
        return b;
    }
}

