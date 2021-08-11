/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class dD
extends L {
    private final /* synthetic */ c A;
    protected /* synthetic */ String z;
    private static final /* synthetic */ f[] y;
    private final /* synthetic */ fN C;
    private final /* synthetic */ L B;

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.z, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
        this.C.b(n2, n3, this.t);
    }

    @Override
    protected void a(s s2) {
        block5: {
            int n2;
            int n3;
            block6: {
                block8: {
                    block7: {
                        String string;
                        block4: {
                            string = K.d();
                            n3 = s2.h;
                            if (string != null) break block4;
                            if (n3 == 0) break block5;
                            n3 = s2.g;
                        }
                        n2 = 200;
                        if (string != null) break block6;
                        if (n3 >= n2) break block7;
                        n3 = s2 instanceof B;
                        if (string != null) break block8;
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

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void r() {
        block3: {
            boolean bl2;
            this.z = net.minecraft.client.D.h.a("of.options.detailsTitle", new Object[0]);
            String string = K.d();
            this.t.clear();
            for (int i2 = 0; i2 < y.length; ++i2) {
                f f10 = y[i2];
                int n2 = h / 2 - 155 + i2 % 2 * 160;
                int n3 = w / 6 + 21 * (i2 / 2) - 12;
                bl2 = f10.f();
                if (string == null) {
                    if (string != null) continue;
                    if (!bl2) {
                        this.t.add(new dH(f10.e(), n2, n3, f10, this.A.c(f10)));
                        if (string == null) continue;
                    }
                    this.t.add(new d7(f10.e(), n2, n3, f10));
                    if (string == null) continue;
                }
                break block3;
            }
            bl2 = this.t.add(new s(200, h / 2 - 100, w / 6 + 168 + 11, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        }
    }

    static {
        y = new f[]{net.minecraft.client.l.f.CLOUDS, net.minecraft.client.l.f.CLOUD_HEIGHT, net.minecraft.client.l.f.TREES, net.minecraft.client.l.f.RAIN, net.minecraft.client.l.f.SKY, net.minecraft.client.l.f.STARS, net.minecraft.client.l.f.SUN_MOON, net.minecraft.client.l.f.SHOW_CAPES, net.minecraft.client.l.f.FOG_FANCY, net.minecraft.client.l.f.FOG_START, net.minecraft.client.l.f.TRANSLUCENT_BLOCKS, net.minecraft.client.l.f.HELD_ITEM_TOOLTIPS, net.minecraft.client.l.f.DROPPED_ITEMS, net.minecraft.client.l.f.ENTITY_SHADOWS, net.minecraft.client.l.f.VIGNETTE, net.minecraft.client.l.f.ALTERNATE_BLOCKS};
    }

    public dD(L l2, c c10) {
        this.C = new fN(this);
        this.B = l2;
        this.A = c10;
    }
}

