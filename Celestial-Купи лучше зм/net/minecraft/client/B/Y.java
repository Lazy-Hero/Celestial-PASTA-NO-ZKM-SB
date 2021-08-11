/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.c;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class Y
extends L {
    private final /* synthetic */ k z;
    private /* synthetic */ int y;

    @Override
    public void r() {
        Y y2;
        String[] arrstring;
        block8: {
            block7: {
                block5: {
                    boolean bl2;
                    block6: {
                        String[] arrstring2 = q.b();
                        this.t.clear();
                        arrstring = arrstring2;
                        this.y = 0;
                        bl2 = this.m.e.b().a();
                        if (arrstring == null) break block5;
                        if (!bl2) break block6;
                        this.t.add(new s(0, h / 2 - 100, w / 4 + 72, net.minecraft.client.D.h.a("deathScreen.spectate", new Object[0])));
                        this.t.add(new s(1, h / 2 - 100, w / 4 + 96, net.minecraft.client.D.h.a("deathScreen." + (this.m.n() ? "deleteWorld" : "leaveServer"), new Object[0])));
                        if (arrstring != null) break block7;
                    }
                    this.t.add(new s(0, h / 2 - 100, w / 4 + 72, net.minecraft.client.D.h.a("deathScreen.respawn", new Object[0])));
                    bl2 = this.t.add(new s(1, h / 2 - 100, w / 4 + 96, net.minecraft.client.D.h.a("deathScreen.titleScreen", new Object[0])));
                }
                y2 = this;
                if (arrstring == null) break block8;
                if (y2.m.aR() == null) {
                    ((s)this.t.get((int)1)).h = false;
                }
            }
            y2 = this;
        }
        for (s s2 : y2.t) {
            s2.h = false;
            if (arrstring != null) continue;
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block9: {
            Y y2;
            block6: {
                block7: {
                    int n4;
                    int n5;
                    String[] arrstring;
                    block8: {
                        k k2;
                        block5: {
                            String[] arrstring2 = q.b();
                            boolean bl2 = this.m.e.b().a();
                            this.a(0, 0, (double)h, (double)w, 0x60500000, -1602211792);
                            net.minecraft.client.a.v.M();
                            net.minecraft.client.a.v.d(2.0f, 2.0f, 2.0f);
                            arrstring = arrstring2;
                            this.b(this.v, net.minecraft.client.D.h.a(bl2 ? "deathScreen.title.hardcore" : "deathScreen.title", new Object[0]), h / 2 / 2, 30, 0xFFFFFF);
                            net.minecraft.client.a.v.B();
                            k2 = this.z;
                            if (arrstring == null) break block5;
                            if (k2 != null) {
                                this.b(this.v, this.z.a(), h / 2, 85, 0xFFFFFF);
                            }
                            this.b(this.v, net.minecraft.client.D.h.a("deathScreen.score", new Object[0]) + ": " + (Object)((Object)net.minecraft.at.l.YELLOW) + this.m.s.ad(), h / 2, 100, 0xFFFFFF);
                            y2 = this;
                            if (arrstring == null) break block6;
                            k2 = y2.z;
                        }
                        if (k2 == null) break block7;
                        n5 = n3;
                        n4 = 85;
                        if (arrstring == null) break block8;
                        if (n5 <= n4) break block7;
                        n5 = n3;
                        n4 = 85 + this.v.p;
                    }
                    if (n5 >= n4) break block7;
                    k k3 = this.a(n2);
                    if (arrstring == null) break block9;
                    if (k3 != null && k3.e().d() != null) {
                        this.a(k3, n2, n3);
                    }
                }
                y2 = this;
            }
            super.a(n2, n3, f10);
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        block7: {
            block5: {
                block6: {
                    String[] arrstring = q.b();
                    if (arrstring == null) break block5;
                    if (!bl2) break block6;
                    Q q2 = this.m;
                    if (arrstring != null) {
                        if (q2.e != null) {
                            this.m.e.N();
                        }
                        this.m.a((net.minecraft.client.E.l)null);
                        q2 = this.m;
                    }
                    q2.a(new a1());
                    if (arrstring != null) break block7;
                }
                this.m.s.n();
            }
            this.m.a((L)null);
        }
    }

    @Nullable
    public k a(int n2) {
        block9: {
            int n3;
            int n4;
            String[] arrstring;
            block8: {
                arrstring = q.b();
                Y y2 = this;
                if (arrstring != null) {
                    if (y2.z == null) {
                        return null;
                    }
                    y2 = this;
                }
                int n5 = y2.m.a6.e(this.z.a());
                int n6 = h / 2 - n5 / 2;
                int n7 = h / 2 + n5 / 2;
                int n8 = n6;
                n4 = n2;
                n3 = n6;
                if (arrstring == null) break block8;
                if (n4 < n3) break block9;
                n4 = n2;
                n3 = n7;
            }
            if (n4 <= n3) {
                for (k k2 : this.z) {
                    if ((n8 += this.m.a6.e(net.minecraft.client.b.c.a(k2.b(), false))) > n2) {
                        return k2;
                    }
                    if (arrstring != null) continue;
                }
                return null;
            }
        }
        return null;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        var2_2 = q.b();
        if (var2_2 == null) ** GOTO lbl7
        switch (var1_1.g) {
            case 0: {
                this.m.s.n();
                this.m.a((L)null);
lbl7:
                // 2 sources

                if (var2_2 != null) return;
            }
            case 1: {
                v0 = this.m;
                if (var2_2 == null) ** GOTO lbl13
                if (!v0.e.b().a()) ** GOTO lbl15
                v0 = this.m;
lbl13:
                // 2 sources

                v0.a(new a1());
                if (var2_2 != null) return;
lbl15:
                // 2 sources

                var3_3 = new ao(this, net.minecraft.client.D.h.a("deathScreen.quit.confirm", new Object[0]), "", net.minecraft.client.D.h.a("deathScreen.titleScreen", new Object[0]), net.minecraft.client.D.h.a("deathScreen.respawn", new Object[0]), 0);
                this.m.a(var3_3);
                var3_3.a(20);
                return;
            }
        }
    }

    @Override
    public void e() {
        block4: {
            Y y2;
            String[] arrstring;
            block3: {
                String[] arrstring2 = q.b();
                super.e();
                arrstring = arrstring2;
                ++this.y;
                y2 = this;
                if (arrstring == null) break block3;
                if (y2.y != 20) break block4;
                y2 = this;
            }
            for (s s2 : y2.t) {
                s2.h = true;
                if (arrstring != null) continue;
            }
        }
    }

    public Y(@Nullable k k2) {
        this.z = k2;
    }
}

