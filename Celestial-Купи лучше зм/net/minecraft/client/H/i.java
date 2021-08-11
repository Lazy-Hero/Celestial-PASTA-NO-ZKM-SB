/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.H;

import net.minecraft.ah.s;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.H.d;
import net.minecraft.client.H.e;
import net.minecraft.client.H.f;

public class i
implements e {
    private /* synthetic */ net.minecraft.client.n.i e;
    private /* synthetic */ int a;
    private static final /* synthetic */ k b;
    private static final /* synthetic */ k d;
    private final /* synthetic */ d c;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block4: {
            i i2;
            block6: {
                boolean bl2;
                block5: {
                    block2: {
                        block3: {
                            ++this.a;
                            bl2 = net.minecraft.client.H.d.a();
                            i2 = this;
                            if (!bl2) break block2;
                            if (i2.c.g() == s.SURVIVAL) break block3;
                            this.c.a(f.NONE);
                            if (bl2) break block4;
                        }
                        i2 = this;
                    }
                    if (!bl2) break block5;
                    if (i2.a < 600) break block4;
                    i2 = this;
                }
                if (!bl2) break block6;
                if (i2.e != null) break block4;
                this.e = new net.minecraft.client.n.i(net.minecraft.client.n.d.RECIPE_BOOK, d, b, false);
                i2 = this;
            }
            i2.c.d().ay().a(this.e);
        }
    }

    static {
        d = new h("tutorial.open_inventory.title", new Object[0]);
        b = new h("tutorial.open_inventory.description", net.minecraft.client.H.d.a("inventory"));
    }

    public i(d d10) {
        this.c = d10;
    }

    @Override
    public void c() {
        this.c.a(f.CRAFT_PLANKS);
    }

    @Override
    public void a() {
        block3: {
            net.minecraft.client.n.i i2;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                i2 = this.e;
                if (!bl2) break block2;
                if (i2 == null) break block3;
                i2 = this.e;
            }
            i2.a();
            this.e = null;
        }
    }
}

