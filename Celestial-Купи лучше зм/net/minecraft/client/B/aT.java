/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.C;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;
import net.minecraft.client.t.d;

public class aT
extends L {
    private static final /* synthetic */ f[] y;
    private final /* synthetic */ L B;
    private final /* synthetic */ c A;
    private /* synthetic */ B C;
    private /* synthetic */ String z;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(s s2) throws IOException {
        block5: {
            int n2;
            int n3;
            block6: {
                block8: {
                    block7: {
                        String[] arrstring;
                        block4: {
                            arrstring = q.b();
                            n3 = s2.h;
                            if (arrstring == null) break block4;
                            if (n3 == 0) break block5;
                            n3 = s2.g;
                        }
                        n2 = 100;
                        if (arrstring == null) break block6;
                        if (n3 >= n2) break block7;
                        n3 = s2 instanceof B;
                        if (arrstring == null) break block8;
                        if (n3 != 0) {
                            this.A.b(((B)s2).b(), 1);
                            s2.m = this.A.c(net.minecraft.client.l.f.a(s2.g));
                        }
                    }
                    n3 = s2.g;
                }
                n2 = 200;
            }
            if (n3 != n2) break block5;
            this.m.ac.e();
            this.m.a(this.B);
        }
    }

    @Override
    public void r() {
        block5: {
            boolean bl2;
            this.z = net.minecraft.client.D.h.a("options.chat.title", new Object[0]);
            String[] arrstring = q.b();
            int n2 = 0;
            f[] arrf = y;
            int n3 = arrf.length;
            int n4 = 0;
            while (n4 < n3) {
                block9: {
                    block8: {
                        f f10;
                        block7: {
                            block6: {
                                f10 = arrf[n4];
                                bl2 = f10.f();
                                if (arrstring == null) break block5;
                                if (arrstring == null) break block6;
                                if (!bl2) break block7;
                                this.t.add(new C(f10.e(), h / 2 - 155 + n2 % 2 * 160, w / 6 + 24 * (n2 >> 1), f10));
                            }
                            if (arrstring != null) break block8;
                        }
                        B b10 = new B(f10.e(), h / 2 - 155 + n2 % 2 * 160, w / 6 + 24 * (n2 >> 1), f10, this.A.c(f10));
                        this.t.add(b10);
                        if (arrstring == null) break block9;
                        if (f10 == net.minecraft.client.l.f.NARRATOR) {
                            this.C = b10;
                            b10.h = net.minecraft.client.t.d.c.a();
                        }
                    }
                    ++n2;
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            bl2 = this.t.add(new s(200, h / 2 - 100, w / 6 + 144, net.minecraft.client.D.h.a("gui.done", new Object[0])));
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

    public aT(L l2, c c10) {
        this.B = l2;
        this.A = c10;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.z, h / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    static {
        y = new f[]{net.minecraft.client.l.f.CHAT_VISIBILITY, net.minecraft.client.l.f.CHAT_COLOR, net.minecraft.client.l.f.CHAT_LINKS, net.minecraft.client.l.f.CHAT_OPACITY, net.minecraft.client.l.f.CHAT_LINKS_PROMPT, net.minecraft.client.l.f.CHAT_SCALE, net.minecraft.client.l.f.CHAT_HEIGHT_FOCUSED, net.minecraft.client.l.f.CHAT_HEIGHT_UNFOCUSED, net.minecraft.client.l.f.CHAT_WIDTH, net.minecraft.client.l.f.REDUCED_DEBUG_INFO, net.minecraft.client.l.f.NARRATOR};
    }

    public void a() {
        this.C.m = this.A.c(net.minecraft.client.l.f.a(this.C.g));
    }
}

