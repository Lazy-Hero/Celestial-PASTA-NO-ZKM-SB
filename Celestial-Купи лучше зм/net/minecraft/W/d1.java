/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.W.d6;
import net.minecraft.W.d9;
import net.minecraft.W.dE;
import net.minecraft.W.db;
import net.minecraft.W.dl;
import net.minecraft.W.dv;
import net.minecraft.W.dw;
import net.minecraft.Z.i;
import net.minecraft.ar.p;

public abstract class d1
extends Enum<d1>
implements p {
    public static final /* synthetic */ /* enum */ d1 CHISELED_STONEBRICK;
    public static final /* synthetic */ /* enum */ d1 COBBLESTONE;
    public static final /* synthetic */ /* enum */ d1 STONE;
    public static final /* synthetic */ /* enum */ d1 CRACKED_STONEBRICK;
    public static final /* synthetic */ /* enum */ d1 MOSSY_STONEBRICK;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String a;
    private static final /* synthetic */ d1[] b;
    private static final /* synthetic */ d1[] e;
    public static final /* synthetic */ /* enum */ d1 STONEBRICK;

    d1(int n3, String string2, String string3, db db2) {
        this(n3, string2, string3);
    }

    public String b() {
        return this.d;
    }

    public static d1 valueOf(String string) {
        return Enum.valueOf(d1.class, string);
    }

    private d1(int n3, String string2) {
        this(n3, string2, string2);
    }

    public String toString() {
        return this.a;
    }

    public static d1 a(i i2) {
        d1 d12;
        block4: {
            d1[] arrd1 = d1.values();
            boolean bl2 = cL.e();
            int n2 = arrd1.length;
            int n3 = 0;
            while (n3 < n2) {
                d12 = arrd1[n3];
                if (bl2) {
                    d1 d13 = d12;
                    if (bl2) {
                        if (i2 == d13.d()) {
                            return d13;
                        }
                        ++n3;
                    }
                    if (bl2) continue;
                }
                break block4;
            }
            d12 = STONE;
        }
        return d12;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static d1[] values() {
        return (d1[])e.clone();
    }

    @Override
    public String a() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    private d1(int n3, String string2, String string3) {
        this.c = n3;
        this.a = string2;
        this.d = string3;
    }

    static {
        STONE = new dw(0, "stone");
        COBBLESTONE = new dv(1, "cobblestone", "cobble");
        STONEBRICK = new dl(2, "stone_brick", "brick");
        MOSSY_STONEBRICK = new dE(3, "mossy_brick", "mossybrick");
        CRACKED_STONEBRICK = new d6(4, "cracked_brick", "crackedbrick");
        CHISELED_STONEBRICK = new d9(5, "chiseled_brick", "chiseledbrick");
        e = new d1[]{STONE, COBBLESTONE, STONEBRICK, MOSSY_STONEBRICK, CRACKED_STONEBRICK, CHISELED_STONEBRICK};
        b = new d1[d1.values().length];
        d1[] arrd1 = d1.values();
        int n2 = arrd1.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            d1 d12;
            d1.b[d12.c()] = d12 = arrd1[i2];
        }
    }

    d1(int n3, String string2, db db2) {
        this(n3, string2);
    }

    public static d1 a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    boolean bl2 = cL.b();
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < b.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return b[n2];
    }

    public abstract i d();
}

