/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.M;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.o.j;
import net.minecraft.d.D;
import net.minecraft.d.K;

public class N
extends M {
    @Override
    public void r() {
        super.r();
        this.t.add(new s(1, h / 2 - 100, w - 40, net.minecraft.client.D.h.a("multiplayer.stopSleeping", new Object[0])));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private void a() {
        j j2 = this.m.s.c9;
        j2.a(new D(this.m.s, K.STOP_SLEEPING));
    }

    @Override
    protected void a(s s2) throws IOException {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = q.b();
                    if (arrstring == null) break block0;
                    if (s2.g != 1) break block1;
                    this.a();
                }
                if (arrstring != null) break block2;
            }
            super.a(s2);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block7: {
            String[] arrstring;
            block9: {
                int n3;
                int n4;
                block8: {
                    block5: {
                        block6: {
                            arrstring = q.b();
                            n4 = n2;
                            n3 = 1;
                            if (arrstring == null) break block5;
                            if (n4 != n3) break block6;
                            this.a();
                            if (arrstring != null) break block7;
                        }
                        n4 = n2;
                        n3 = 28;
                    }
                    if (arrstring == null) break block8;
                    if (n4 == n3) break block9;
                    n4 = n2;
                    n3 = 156;
                }
                if (n4 == n3) break block9;
                super.a(c10, n2);
                if (arrstring != null) break block7;
            }
            String string = this.y.n().trim();
            if (arrstring != null) {
                if (!string.isEmpty()) {
                    this.m.s.b(string);
                }
                this.y.a("");
            }
            this.m.n.f().g();
        }
    }
}

