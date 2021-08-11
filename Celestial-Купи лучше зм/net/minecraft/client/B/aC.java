/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.ar.ay;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.E;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class aC
extends L {
    private /* synthetic */ String z;
    private final /* synthetic */ c A;
    private final /* synthetic */ L y;
    protected /* synthetic */ String B;

    private static Exception a(Exception exception) {
        return exception;
    }

    protected String a(ay ay2) {
        float f10 = this.A.a(ay2);
        return f10 == 0.0f ? this.z : (int)(f10 * 100.0f) + "%";
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.B, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            block6: {
                s s3;
                int n2;
                int n3;
                block4: {
                    String[] arrstring;
                    block5: {
                        block2: {
                            arrstring = q.b();
                            n3 = s2.h;
                            if (arrstring == null) break block2;
                            if (n3 == 0) break block3;
                            n3 = s2.g;
                        }
                        n2 = 200;
                        if (arrstring == null) break block4;
                        if (n3 != n2) break block5;
                        this.m.ac.e();
                        this.m.a(this.y);
                        if (arrstring != null) break block3;
                    }
                    s3 = s2;
                    if (arrstring == null) break block6;
                    n3 = s3.g;
                    n2 = 201;
                }
                if (n3 != n2) break block3;
                this.m.ac.b(net.minecraft.client.l.f.SHOW_SUBTITLES, 1);
                s3 = s2;
            }
            s3.m = this.m.ac.c(net.minecraft.client.l.f.SHOW_SUBTITLES);
            this.m.ac.e();
        }
    }

    static c a(aC aC2) {
        return aC2.A;
    }

    public aC(L l2, c c10) {
        this.B = "Options";
        this.y = l2;
        this.A = c10;
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

    @Override
    public void r() {
        this.B = net.minecraft.client.D.h.a("options.sounds.title", new Object[0]);
        this.z = net.minecraft.client.D.h.a("options.off", new Object[0]);
        String[] arrstring = q.b();
        int n2 = 0;
        this.t.add(new E(this, ay.MASTER.ordinal(), h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), ay.MASTER, true));
        n2 += 2;
        ay[] array = ay.values();
        int n3 = array.length;
        String[] arrstring2 = arrstring;
        int n4 = 0;
        while (n4 < n3) {
            ay ay2 = array[n4];
            if (arrstring2 != null) {
                if (ay2 != ay.MASTER) {
                    this.t.add(new E(this, ay2.ordinal(), h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), ay2, false));
                    ++n2;
                }
                ++n4;
            }
            if (arrstring2 != null) continue;
        }
        int n5 = h / 2 - 75;
        n3 = w / 6 - 12;
        this.t.add(new B(201, n5, n3 + 24 * (++n2 >> 1), net.minecraft.client.l.f.SHOW_SUBTITLES, this.A.c(net.minecraft.client.l.f.SHOW_SUBTITLES)));
        this.t.add(new s(200, h / 2 - 100, w / 6 + 168, net.minecraft.client.D.h.a("gui.done", new Object[0])));
    }
}

