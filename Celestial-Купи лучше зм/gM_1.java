/*
 * Decompiled with CFR 0.150.
 */
public final class gM
extends Enum<gM> {
    public static final /* synthetic */ /* enum */ gM SEND;
    private static /* synthetic */ int b;
    public static final /* synthetic */ /* enum */ gM POST;
    private static final /* synthetic */ gM[] c;
    public static final /* synthetic */ /* enum */ gM RECEIVE;
    public static final /* synthetic */ /* enum */ gM PRE;

    public static int b() {
        return b;
    }

    public static gM valueOf(String string) {
        return Enum.valueOf(gM.class, string);
    }

    public static int c() {
        int n2 = gM.b();
        if (n2 == 0) {
            return 63;
        }
        return 0;
    }

    public static void b(int n2) {
        b = n2;
    }

    static {
        PRE = new gM();
        POST = new gM();
        gM.b(59);
        SEND = new gM();
        RECEIVE = new gM();
        c = new gM[]{PRE, POST, SEND, RECEIVE};
    }

    public static gM[] values() {
        return (gM[])c.clone();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

