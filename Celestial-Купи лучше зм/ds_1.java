/*
 * Decompiled with CFR 0.150.
 */
public class ds {
    public static dB a(String string, dB[] arrdB) {
        String string2 = dB.i();
        if (arrdB == null) {
            return null;
        }
        int n2 = 0;
        while (n2 < arrdB.length) {
            dB dB2 = arrdB[n2];
            if (string2 != null) {
                if (dB2.l().equals(string)) {
                    return dB2;
                }
                ++n2;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(aC aC2, dB[] arrdB, boolean bl2) {
        String string = dB.i();
        if (aC2 == null) {
            return false;
        }
        if (arrdB == null) {
            return false;
        }
        String[] arrstring = aC2.c();
        int n2 = 0;
        do {
            if (n2 >= arrstring.length) return true;
            String string2 = arrstring[n2];
            dB dB2 = ds.a(string2, arrdB);
            if (string == null) continue;
            if (dB2 != null) {
                String string3 = bl2 ? dB2.j() : dB2.k();
                String string4 = aC2.a(string2);
                if (string == null) continue;
                if (!fU.a((Object)string3, (Object)string4)) {
                    return false;
                }
            }
            ++n2;
        } while (string != null);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static aC a(aC[] arraC, dB[] arrdB, boolean bl2) {
        String string = dB.i();
        if (arraC == null) {
            return null;
        }
        int n2 = 0;
        while (n2 < arraC.length) {
            aC aC2 = arraC[n2];
            if (string != null) {
                if (ds.a(aC2, arrdB, bl2)) {
                    return aC2;
                }
                ++n2;
            }
            if (string != null) continue;
        }
        return null;
    }
}

