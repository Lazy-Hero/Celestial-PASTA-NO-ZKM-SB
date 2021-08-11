/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.C;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.ah.e;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.ak.p;

public class q
extends p {
    private /* synthetic */ int j;
    private /* synthetic */ int i;

    public q(C c10) {
        super(c10);
        this.j = -1;
    }

    @Override
    public void a() {
        super.a();
        this.i = 0;
    }

    @Override
    public boolean c() {
        q q2;
        String string;
        block7: {
            boolean bl2;
            block6: {
                string = net.minecraft.ak.h.h();
                bl2 = super.c();
                if (string != null) break block6;
                if (!bl2) {
                    return false;
                }
                q2 = this;
                if (string != null) break block7;
                bl2 = q2.e.aG.M().c("mobGriefing");
            }
            if (!bl2) {
                return false;
            }
            q2 = this;
        }
        aB aB2 = q2.h;
        boolean bl3 = aB.c(this.e.aG, this.c);
        if (string == null) {
            bl3 = !bl3;
        }
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        double d10 = this.e.b(this.c);
        String string = net.minecraft.ak.h.h();
        int n2 = this.i;
        if (string != null) return n2 != 0;
        if (n2 > 240) return 0 != 0;
        aB aB2 = this.h;
        n2 = aB.c(this.e.aG, this.c);
        if (string != null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        double d11 = d10 - 4.0;
        n2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (string != null) return n2 != 0;
        if (n2 >= 0) return 0 != 0;
        return true;
    }

    @Override
    public void b() {
        block8: {
            z z2;
            block9: {
                q q2;
                String string;
                block7: {
                    int n2;
                    int n3;
                    block6: {
                        int n4;
                        String string2 = net.minecraft.ak.h.h();
                        super.b();
                        string = string2;
                        int n5 = this.e.f().nextInt(20);
                        if (string == null) {
                            if (n5 == 0) {
                                this.e.aG.b(1019, this.c, 0);
                            }
                            ++this.i;
                            n5 = (int)((float)this.i / 240.0f * 10.0f);
                        }
                        n3 = n4 = n5;
                        n2 = this.j;
                        if (string != null) break block6;
                        if (n3 != n2) {
                            this.e.aG.c(this.e.W(), this.c, n4);
                            this.j = n4;
                        }
                        q2 = this;
                        if (string != null) break block7;
                        n3 = q2.i;
                        n2 = 240;
                    }
                    if (n3 != n2) break block8;
                    q2 = this;
                }
                z2 = q2.e.aG;
                if (string != null) break block9;
                if (z2.g() != net.minecraft.ah.e.HARD) break block8;
                this.e.aG.v(this.c);
                this.e.aG.b(1021, this.c, 0);
                z2 = this.e.aG;
            }
            z2.b(2001, this.c, K.b(this.h));
        }
    }

    @Override
    public void g() {
        super.g();
        this.e.aG.c(this.e.W(), this.c, -1);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

