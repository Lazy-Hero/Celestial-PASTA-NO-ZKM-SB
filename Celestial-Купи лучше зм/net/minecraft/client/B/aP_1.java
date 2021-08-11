/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.b.B;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.f;

public class aP
implements aJ {
    private final /* synthetic */ Q c;
    private final /* synthetic */ s b;
    private final /* synthetic */ s a;

    public aP(s s2, s s3) {
        this.c = Q.P();
        this.b = s2;
        this.a = s3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        String[] arrstring = q.b();
        s s2 = this.b;
        if (arrstring != null) {
            if (s2.a(this.c, n3, n4)) {
                boolean bl2 = this.b instanceof B;
                if (arrstring == null) return bl2;
                if (!bl2) return true;
                this.c.ac.b(((B)this.b).b(), 1);
                this.b.m = this.c.ac.c(f.a(this.b.g));
                return true;
            }
            s2 = this.a;
        }
        if (arrstring != null) {
            if (s2 == null) return false;
            s2 = this.a;
        }
        boolean bl3 = s2.a(this.c, n3, n4);
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        boolean bl4 = this.a instanceof B;
        if (arrstring == null) return bl4;
        if (!bl4) return true;
        this.c.ac.b(((B)this.a).b(), 1);
        this.a.m = this.c.ac.c(f.a(this.a.g));
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        block6: {
            s s2;
            block5: {
                String[] arrstring = q.b();
                s2 = this.b;
                if (arrstring != null) {
                    if (s2 != null) {
                        this.b.r = n4;
                        this.b.a(this.c, n7, n8, f10);
                    }
                    s2 = this.a;
                }
                if (arrstring == null) break block5;
                if (s2 == null) break block6;
                this.a.r = n4;
                s2 = this.a;
            }
            s2.a(this.c, n7, n8, f10);
        }
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        block6: {
            s s2;
            block5: {
                String[] arrstring = q.b();
                s2 = this.b;
                if (arrstring != null) {
                    if (s2 != null) {
                        this.b.b(n3, n4);
                    }
                    s2 = this.a;
                }
                if (arrstring == null) break block5;
                if (s2 == null) break block6;
                s2 = this.a;
            }
            s2.b(n3, n4);
        }
    }
}

