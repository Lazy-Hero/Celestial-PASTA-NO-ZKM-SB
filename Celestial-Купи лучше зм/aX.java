/*
 * Decompiled with CFR 0.150.
 */
public class aX
extends a7 {
    public static final /* synthetic */ String[] h;
    public static final /* synthetic */ String[] i;

    public boolean b() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        h = new String[]{"default", "fast", "fancy", "off"};
        i = new String[]{"Default", "Fast", "Fancy", "OFF"};
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean d() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public boolean a() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public aX(String string, String string2, int n2) {
        super(string, h, string2, i, n2);
    }

    @Override
    public boolean a(String string) {
        String string2 = dB.i();
        boolean bl2 = fU.a((Object)string, (Object)"none");
        if (string2 != null) {
            if (bl2) {
                string = "off";
            }
            bl2 = super.a(string);
        }
        return bl2;
    }

    public boolean c() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }
}

