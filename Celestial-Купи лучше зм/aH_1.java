/*
 * Decompiled with CFR 0.150.
 */
public class aH {
    private final /* synthetic */ a6 a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @cL
    public void a(fO fO2) {
        block2: {
            int n2;
            String string;
            block1: {
                string = fO2.a();
                String string2 = e2.f();
                n2 = string.length();
                if (string2 != null) break block1;
                if (n2 <= 0) break block2;
                n2 = string.startsWith(".") ? 1 : 0;
            }
            if (n2 != 0) {
                fO2.a(this.a.a(string));
            }
        }
    }

    public aH(a6 a62) {
        this.a = a62;
    }
}

