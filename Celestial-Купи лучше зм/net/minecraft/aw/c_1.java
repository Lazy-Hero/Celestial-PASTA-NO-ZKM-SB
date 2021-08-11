/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.ab.a;
import net.minecraft.ah.s;
import net.minecraft.ar.aD;
import net.minecraft.aw.w;

public class c
implements Comparable<c> {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ s d;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ int f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ String i;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String h;

    public boolean d() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String g() {
        String string;
        String[] arrstring = w.d();
        c c10 = this;
        if (arrstring != null) {
            if (aD.a(c10.a)) {
                string = net.minecraft.ab.a.a("selectWorld.versionUnknown");
                return string;
            }
            c10 = this;
        }
        string = c10.a;
        return string;
    }

    public boolean k() {
        String[] arrstring = w.d();
        boolean bl2 = this.f;
        if (arrstring != null) {
            bl2 = bl2 > BADBOOL 1343;
        }
        return bl2;
    }

    public s h() {
        return this.d;
    }

    public long j() {
        return this.g;
    }

    public boolean b() {
        return this.k();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean i() {
        return this.k;
    }

    public c(w w2, String string, String string2, long l2, boolean bl2) {
        this.h = string;
        this.i = string2;
        this.b = w2.J();
        this.g = l2;
        this.d = w2.g();
        this.k = bl2;
        this.j = w2.a();
        this.c = w2.F();
        this.a = w2.e();
        this.f = w2.C();
        this.e = w2.c();
    }

    public boolean e() {
        return this.j;
    }

    public String c() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(c c10) {
        c c11;
        block6: {
            long l2;
            block5: {
                String[] arrstring = w.d();
                long l3 = this.b - c10.b;
                l2 = l3 == 0L ? (byte)0 : (l3 < 0L ? (byte)-1 : 1);
                if (arrstring == null) break block5;
                if (l2 < 0) {
                    return 1;
                }
                c11 = this;
                if (arrstring == null) break block6;
                long l4 = c11.b - c10.b;
                l2 = l4 == 0L ? (byte)0 : (l4 < 0L ? (byte)-1 : 1);
            }
            if (l2 > 0) {
                return -1;
            }
            c11 = this;
        }
        int n2 = c11.h.compareTo(c10.h);
        return n2;
    }

    public long f() {
        return this.b;
    }

    public String a() {
        return this.h;
    }
}

