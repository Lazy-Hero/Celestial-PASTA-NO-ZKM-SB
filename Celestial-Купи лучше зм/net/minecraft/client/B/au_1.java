/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a8;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class au
extends L {
    private final /* synthetic */ c y;
    private /* synthetic */ B z;
    private /* synthetic */ a8 D;
    private final /* synthetic */ net.minecraft.client.D.l C;
    protected /* synthetic */ L A;
    private /* synthetic */ B B;

    static B b(au au2) {
        return au2.B;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.D.b(n2, n3, f10);
        this.b(this.v, net.minecraft.client.D.h.a("options.language", new Object[0]), h / 2, 16, 0xFFFFFF);
        this.b(this.v, "(" + net.minecraft.client.D.h.a("options.languageWarning", new Object[0]) + ")", h / 2, w - 56, 0x808080);
        super.a(n2, n3, f10);
    }

    public au(L l2, c c10, net.minecraft.client.D.l l3) {
        this.A = l2;
        this.y = c10;
        this.C = l3;
    }

    @Override
    protected void a(s s2) throws IOException {
        block10: {
            int n2;
            String[] arrstring;
            block9: {
                arrstring = q.b();
                n2 = s2.h;
                if (arrstring == null) break block9;
                if (n2 == 0) break block10;
                n2 = s2.g;
            }
            switch (n2) {
                case 5: {
                    if (arrstring != null) break;
                }
                case 6: {
                    this.m.a(this.A);
                    if (arrstring != null) break;
                }
                case 100: {
                    s s3 = s2;
                    if (arrstring != null) {
                        if (!(s3 instanceof B)) break;
                        this.y.b(((B)s2).b(), 1);
                        s3 = s2;
                    }
                    s3.m = this.y.c(net.minecraft.client.l.f.FORCE_UNICODE_FONT);
                    l l2 = new l(this.m);
                    int n3 = l2.e();
                    int n4 = l2.a();
                    this.a(this.m, n3, n4);
                    if (arrstring != null) break;
                }
                default: {
                    this.D.a(s2);
                    break;
                }
            }
        }
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.D.f();
    }

    static c d(au au2) {
        return au2.y;
    }

    static net.minecraft.client.D.l a(au au2) {
        return au2.C;
    }

    static B c(au au2) {
        return au2.z;
    }

    @Override
    public void r() {
        this.z = this.b(new B(100, h / 2 - 155, w - 38, net.minecraft.client.l.f.FORCE_UNICODE_FONT, this.y.c(net.minecraft.client.l.f.FORCE_UNICODE_FONT)));
        this.B = this.b(new B(6, h / 2 - 155 + 160, w - 38, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.D = new a8(this, this.m);
        this.D.a(7, 8);
    }
}

