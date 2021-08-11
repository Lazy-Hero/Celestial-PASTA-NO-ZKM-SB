/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.R.b;
import net.minecraft.ah.A;
import net.minecraft.ah.n;
import net.minecraft.ah.w;
import net.minecraft.ah.z;
import net.minecraft.aw.x;
import net.minecraft.y.c;

public class C
extends A {
    private final /* synthetic */ A ah;

    @Override
    protected void c() throws w {
    }

    public void a() {
        this.D.q();
    }

    @Override
    public z x() {
        block4: {
            c c10;
            block2: {
                c c11;
                block3: {
                    this.E = this.ah.j();
                    this.A = this.ah.c();
                    String string = z.I();
                    this.M = this.ah.D();
                    this.b = this.ah.r();
                    String string2 = c.a(this.D);
                    c10 = c11 = (c)this.E.a(c.class, string2);
                    if (string == null) break block2;
                    if (c10 != null) break block3;
                    this.g = new c(this);
                    this.E.a(string2, this.g);
                    if (string != null) break block4;
                }
                c10 = this.g = c11;
            }
            c10.a(this);
        }
        return this;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public C(b b10, net.minecraft.aw.b b11, int n2, A a10, net.minecraft.aq.b b12) {
        super(b10, b11, new x(a10.b()), n2, b12);
        this.ah = a10;
        a10.O().a(new n(this));
    }
}

