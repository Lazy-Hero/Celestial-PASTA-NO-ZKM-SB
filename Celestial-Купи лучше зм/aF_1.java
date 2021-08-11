/*
 * Decompiled with CFR 0.150.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aF
extends a7 {
    public static final /* synthetic */ String[] i;
    public static final /* synthetic */ String[] h;

    public boolean c() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public aF(String string, String string2, int n2) {
        super(string, i, string2, h, n2);
    }

    static {
        i = new String[]{"default", "true", "false"};
        h = new String[]{"Default", "ON", "OFF"};
    }

    public boolean b() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String c() {
        String string;
        aF aF2;
        block8: {
            boolean bl2;
            block7: {
                String string2 = dB.i();
                bl2 = this.c();
                if (string2 != null) {
                    if (bl2) {
                        return gl.b();
                    }
                    bl2 = this.b();
                }
                if (string2 == null) break block7;
                if (bl2) {
                    return gl.e();
                }
                aF2 = this;
                if (string2 == null) break block8;
                bl2 = aF2.a();
            }
            if (bl2) {
                string = gl.f();
                return string;
            }
            aF2 = this;
        }
        string = super.c();
        return string;
    }

    public boolean a() {
        String string = dB.i();
        boolean bl2 = this.a();
        if (string != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

