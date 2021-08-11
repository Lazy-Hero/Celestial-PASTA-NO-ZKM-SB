/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.ac.a;
import net.minecraft.ar.p;

public enum cM implements p
{
    STONE(0, net.minecraft.ac.a.T, "stone", true),
    GRANITE(1, net.minecraft.ac.a.ad, "granite", true),
    GRANITE_SMOOTH(2, net.minecraft.ac.a.ad, "smooth_granite", "graniteSmooth", false),
    DIORITE(3, net.minecraft.ac.a.V, "diorite", true),
    DIORITE_SMOOTH(4, net.minecraft.ac.a.V, "smooth_diorite", "dioriteSmooth", false),
    ANDESITE(5, net.minecraft.ac.a.T, "andesite", true),
    ANDESITE_SMOOTH(6, net.minecraft.ac.a.T, "smooth_andesite", "andesiteSmooth", false);

    private static final /* synthetic */ cM[] e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String c;
    private final /* synthetic */ int g;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ a a;

    public boolean e() {
        return this.d;
    }

    public String b() {
        return this.f;
    }

    static {
        e = new cM[cM.values().length];
        cM[] arrcM = cM.values();
        int n2 = arrcM.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cM cM2;
            cM.e[cM2.d()] = cM2 = arrcM[i2];
        }
    }

    private cM(int n3, a a10, String string2, String string3, boolean bl2) {
        this.g = n3;
        this.c = string2;
        this.f = string3;
        this.a = a10;
        this.d = bl2;
    }

    private cM(int n3, a a10, String string2, boolean bl2) {
        this(n3, a10, string2, string2, bl2);
    }

    public static cM a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    boolean bl2 = cL.e();
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (!bl2) break block2;
                    if (n3 < e.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return e[n2];
    }

    public int d() {
        return this.g;
    }

    @Override
    public String a() {
        return this.c;
    }

    public a c() {
        return this.a;
    }

    public String toString() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

