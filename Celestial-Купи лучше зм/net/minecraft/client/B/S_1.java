/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.b.x;
import net.minecraft.client.l.f;
import net.minecraft.i.a;

public class S
extends L {
    private /* synthetic */ String y;
    private final /* synthetic */ L z;

    static String a(S s2, a a10) {
        return s2.a(a10);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            s s3;
            block8: {
                int n2;
                block6: {
                    String[] arrstring;
                    block7: {
                        int n3;
                        block4: {
                            block5: {
                                block2: {
                                    arrstring = q.b();
                                    n2 = s2.h;
                                    if (arrstring == null) break block2;
                                    if (n2 == 0) break block3;
                                    n2 = s2.g;
                                }
                                n3 = 200;
                                if (arrstring == null) break block4;
                                if (n2 != n3) break block5;
                                this.m.ac.e();
                                this.m.a(this.z);
                                if (arrstring != null) break block3;
                            }
                            n2 = s2.g;
                            if (arrstring == null) break block6;
                            n3 = 199;
                        }
                        if (n2 != n3) break block7;
                        this.m.ac.b(net.minecraft.client.l.f.MAIN_HAND, 1);
                        s2.m = this.m.ac.c(net.minecraft.client.l.f.MAIN_HAND);
                        this.m.ac.k();
                        if (arrstring != null) break block3;
                    }
                    s3 = s2;
                    if (arrstring == null) break block8;
                    n2 = s3 instanceof x;
                }
                if (n2 == 0) break block3;
                s3 = s2;
            }
            a a10 = net.minecraft.client.b.x.a((x)s3);
            this.m.ac.a(a10);
            s2.m = this.a(a10);
        }
    }

    public S(L l2) {
        this.z = l2;
    }

    @Override
    public void r() {
        String[] arrstring;
        int n2;
        block4: {
            n2 = 0;
            this.y = net.minecraft.client.D.h.a("options.skinCustomisation.title", new Object[0]);
            arrstring = q.b();
            for (a a10 : net.minecraft.i.a.values()) {
                this.t.add(new x(this, a10.a(), h / 2 - 155 + n2 % 2 * 160, w / 6 + 24 * (n2 >> 1), 150, 20, a10, null));
                ++n2;
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block4;
            }
            this.t.add(new B(199, h / 2 - 155 + n2 % 2 * 160, w / 6 + 24 * (n2 >> 1), net.minecraft.client.l.f.MAIN_HAND, this.m.ac.c(net.minecraft.client.l.f.MAIN_HAND)));
            ++n2;
        }
        int n3 = n2 % 2;
        if (arrstring != null) {
            if (n3 == 1) {
                ++n2;
            }
            n3 = this.t.add(new s(200, h / 2 - 100, w / 6 + 24 * (n2 >> 1), net.minecraft.client.D.h.a("gui.done", new Object[0]))) ? 1 : 0;
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        String[] arrstring = q.b();
        if (arrstring != null) {
            if (n2 == 1) {
                this.m.ac.e();
            }
            super.a(c10, n2);
        }
    }

    private String a(a a10) {
        String string;
        block3: {
            block2: {
                String[] arrstring = q.b();
                if (!this.m.ac.c().contains((Object)a10)) break block2;
                string = net.minecraft.client.D.h.a("options.on", new Object[0]);
                if (arrstring != null) break block3;
            }
            string = net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
        return a10.d().a() + ": " + string;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.y, h / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f10);
    }
}

