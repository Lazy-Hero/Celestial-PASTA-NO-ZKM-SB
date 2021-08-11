/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ai;

import net.minecraft.C.u;
import net.minecraft.R.b;
import net.minecraft.ai.f;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.f.a;

public class d
implements net.minecraft.F.a {
    private final /* synthetic */ b a;
    private /* synthetic */ boolean b;
    private final /* synthetic */ u d;
    private static final /* synthetic */ k c;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.H.a a10) {
        this.d.a(new a(a10.c()));
        this.d.a(c);
    }

    public d(b b10, u u2) {
        this.a = b10;
        this.d = u2;
    }

    static {
        c = new g("Status request has been handled.");
    }

    @Override
    public void a(k k2) {
    }

    @Override
    public void a(net.minecraft.H.b b10) {
        block4: {
            d d10;
            block2: {
                block3: {
                    boolean bl2 = f.f();
                    d10 = this;
                    if (!bl2) break block2;
                    if (!d10.b) break block3;
                    this.d.a(c);
                    if (bl2) break block4;
                }
                this.b = true;
                d10 = this;
            }
            d10.d.a(new net.minecraft.f.b(this.a.H()));
        }
    }
}

