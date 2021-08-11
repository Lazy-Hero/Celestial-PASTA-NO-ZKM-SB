/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.A.h;
import net.minecraft.Z.l;
import net.minecraft.client.j.c;

public class gc {
    public static boolean a(h h2, h[] arrh) {
        String string = K.d();
        if (arrh == null) {
            return true;
        }
        for (int i2 = 0; i2 < arrh.length; ++i2) {
            if (arrh[i2] != h2) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int n2, int[] arrn) {
        int n3;
        block4: {
            String string = K.d();
            if (arrn == null) {
                return true;
            }
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                n3 = arrn[i2];
                if (string == null) {
                    boolean bl2;
                    if (string == null) {
                        if (n3 != n2) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block4;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static boolean a(int n2, int n3, R[] arrr) {
        boolean bl2;
        block5: {
            String string = K.d();
            if (arrr == null) {
                return true;
            }
            int n4 = 0;
            while (n4 < arrr.length) {
                R r2 = arrr[n4];
                if (string == null) {
                    bl2 = r2.a(n2, n3);
                    if (string != null) break block5;
                    if (bl2) {
                        return true;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean a(c c10, c[] arrc) {
        String string = K.d();
        if (arrc == null) {
            return true;
        }
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            if (arrc[i2] != c10) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int n2, R[] arrr) {
        int n3;
        block5: {
            String string = K.d();
            if (arrr == null) {
                return true;
            }
            int n4 = 0;
            while (n4 < arrr.length) {
                R r2 = arrr[n4];
                if (string == null) {
                    n3 = r2.a();
                    if (string != null) break block5;
                    if (n3 == n2) {
                        return true;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static boolean a(l l2, R[] arrr) {
        boolean bl2;
        block5: {
            String string = K.d();
            if (arrr == null) {
                return true;
            }
            int n2 = 0;
            while (n2 < arrr.length) {
                R r2 = arrr[n2];
                if (string == null) {
                    bl2 = r2.a(l2);
                    if (string != null) break block5;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

