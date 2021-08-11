/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.z;

import net.minecraft.k.m;

public final class d
extends Enum<d> {
    private static final /* synthetic */ d[] a;
    public static final /* synthetic */ /* enum */ d CREATIVE_ONLY;
    public static final /* synthetic */ /* enum */ d DISALLOWED;
    public static final /* synthetic */ /* enum */ d ALLOWED;
    private static /* synthetic */ m[] b;

    public static d[] values() {
        return (d[])a.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    static {
        DISALLOWED = new d();
        ALLOWED = new d();
        CREATIVE_ONLY = new d();
        d.b(null);
        a = new d[]{DISALLOWED, ALLOWED, CREATIVE_ONLY};
    }

    public static m[] b() {
        return b;
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public static d a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    m[] arrm = d.b();
                    n3 = n2;
                    if (arrm != null) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (arrm != null) break block2;
                    if (n3 <= d.values().length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return d.values()[n2];
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

