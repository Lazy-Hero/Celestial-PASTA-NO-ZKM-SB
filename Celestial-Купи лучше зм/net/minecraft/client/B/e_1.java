/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import javax.annotation.Nullable;
import net.minecraft.client.Q;
import net.minecraft.client.b.H;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class e
implements aJ {
    private final /* synthetic */ q d;
    private final /* synthetic */ q b;
    private final /* synthetic */ Q a;
    private /* synthetic */ q c;

    private void a(aq aq2, int n2, boolean bl2) {
        block3: {
            aq aq3;
            block2: {
                String[] arrstring = q.b();
                aq3 = aq2;
                if (arrstring == null) break block2;
                aq3.o = n2;
                if (bl2) break block3;
                aq3 = aq2;
            }
            aq3.d();
        }
    }

    public e(@Nullable q q2, @Nullable q q3) {
        this.a = Q.P();
        this.b = q2;
        this.d = q3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q b() {
        return this.d;
    }

    static q c(e e10) {
        return e10.b;
    }

    private boolean b(q q2, int n2, int n3, int n4) {
        String[] arrstring = q.b();
        q q3 = q2;
        if (arrstring != null) {
            if (q3 == null) {
                return false;
            }
            q3 = q2;
        }
        boolean bl2 = q3 instanceof s;
        if (arrstring != null) {
            if (bl2) {
                return this.a((s)q2, n2, n3, n4);
            }
            bl2 = q2 instanceof aq;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a((aq)q2, n2, n3, n4);
            }
            bl2 = false;
        }
        return bl2;
    }

    private void a(s s2, int n2, int n3, int n4, boolean bl2, float f10) {
        block3: {
            s s3;
            block2: {
                String[] arrstring = q.b();
                s3 = s2;
                if (arrstring == null) break block2;
                s3.r = n2;
                if (bl2) break block3;
                s3 = s2;
            }
            s3.a(this.a, n3, n4, f10);
        }
    }

    private void a(H h2, int n2, int n3, int n4, boolean bl2) {
        block3: {
            H h3;
            block2: {
                String[] arrstring = q.b();
                h3 = h2;
                if (arrstring == null) break block2;
                h3.l = n2;
                if (bl2) break block3;
                h3 = h2;
            }
            h3.a(this.a, n3, n4);
        }
    }

    private boolean a(s s2, int n2, int n3, int n4) {
        boolean bl2 = s2.a(this.a, n2, n3);
        String[] arrstring = q.b();
        boolean bl3 = bl2;
        if (arrstring != null) {
            if (bl3) {
                this.c = s2;
            }
            bl3 = bl2;
        }
        return bl3;
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
        this.a(this.b, n4, 0, 0, true, f10);
        this.a(this.d, n4, 0, 0, true, f10);
    }

    public q a() {
        return this.b;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a(this.b, n3, n4, n5);
        this.a(this.d, n3, n4, n5);
    }

    private void a(q q2, int n2, int n3, int n4) {
        block2: {
            q q3;
            block1: {
                String[] arrstring = q.b();
                q3 = q2;
                if (arrstring == null) break block1;
                if (q3 == null) break block2;
                q3 = q2;
            }
            if (q3 instanceof s) {
                this.b((s)q2, n2, n3, n4);
            }
        }
    }

    static q b(e e10) {
        return e10.c;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        this.a(this.b, n4, n7, n8, false, f10);
        this.a(this.d, n4, n7, n8, false, f10);
    }

    static q a(e e10) {
        return e10.d;
    }

    private void a(aq aq2, int n2, int n3, int n4) {
        block0: {
            aq2.a(n2, n3, n4);
            if (!aq2.b()) break block0;
            this.c = aq2;
        }
    }

    private void b(s s2, int n2, int n3, int n4) {
        s2.b(n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2 = this.b(this.b, n3, n4, n5);
        String[] arrstring = q.b();
        boolean bl3 = this.b(this.d, n3, n4, n5);
        boolean bl4 = bl2;
        if (arrstring == null) return bl4;
        if (bl4) return true;
        bl4 = bl3;
        if (arrstring == null) return bl4;
        if (!bl4) return false;
        return true;
    }

    private void a(q q2, int n2, int n3, int n4, boolean bl2, float f10) {
        block2: {
            boolean bl3;
            block5: {
                block6: {
                    String[] arrstring;
                    block3: {
                        block4: {
                            q q3;
                            block1: {
                                arrstring = q.b();
                                q3 = q2;
                                if (arrstring == null) break block1;
                                if (q3 == null) break block2;
                                q3 = q2;
                            }
                            bl3 = q3 instanceof s;
                            if (arrstring == null) break block3;
                            if (!bl3) break block4;
                            this.a((s)q2, n2, n3, n4, bl2, f10);
                            if (arrstring != null) break block2;
                        }
                        bl3 = q2 instanceof aq;
                    }
                    if (arrstring == null) break block5;
                    if (!bl3) break block6;
                    this.a((aq)q2, n2, bl2);
                    if (arrstring != null) break block2;
                }
                bl3 = q2 instanceof H;
            }
            if (bl3) {
                this.a((H)q2, n2, n3, n4, bl2);
            }
        }
    }
}

