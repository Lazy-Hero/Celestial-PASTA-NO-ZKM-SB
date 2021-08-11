/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import javax.annotation.Nullable;
import net.minecraft.E.s;
import net.minecraft.k.m;

public enum d {
    SUCCESS_COUNT(0, "SuccessCount"),
    AFFECTED_BLOCKS(1, "AffectedBlocks"),
    AFFECTED_ENTITIES(2, "AffectedEntities"),
    AFFECTED_ITEMS(3, "AffectedItems"),
    QUERY_RESULT(4, "QueryResult");

    final /* synthetic */ int b;
    final /* synthetic */ String c;

    private d(int n3, String string2) {
        this.b = n3;
        this.c = string2;
    }

    public static String[] b() {
        String[] arrstring;
        block2: {
            String[] arrstring2 = new String[d.values().length];
            int n2 = 0;
            d[] arrd = d.values();
            m[] arrm = s.b();
            for (d d10 : arrd) {
                arrstring = arrstring2;
                if (arrm != null) {
                    arrstring[n2++] = d10.a();
                    if (arrm != null) continue;
                }
                break block2;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    @Nullable
    public static d a(String string) {
        d[] arrd = d.values();
        m[] arrm = s.b();
        int n2 = arrd.length;
        int n3 = 0;
        while (n3 < n2) {
            d d10 = arrd[n3];
            if (arrm != null) {
                if (d10.a().equals(string)) {
                    return d10;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        return null;
    }

    public int c() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

