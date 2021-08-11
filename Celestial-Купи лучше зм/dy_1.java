/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class dy
extends L {
    private final /* synthetic */ fN y;
    private final /* synthetic */ L C;
    private static final /* synthetic */ f[] z;
    protected /* synthetic */ String B;
    private final /* synthetic */ c A;

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
            this.m.a(this.C);
        }
    }

    @Override
    public void r() {
        block3: {
            boolean bl2;
            this.B = net.minecraft.client.D.h.a("of.options.performanceTitle", new Object[0]);
            this.t.clear();
            String string = K.d();
            for (int i2 = 0; i2 < z.length; ++i2) {
                f f10 = z[i2];
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

    public dy(L l2, c c10) {
        this.y = new fN(this);
        this.C = l2;
        this.A = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        z = new f[]{net.minecraft.client.l.f.SMOOTH_FPS, net.minecraft.client.l.f.SMOOTH_WORLD, net.minecraft.client.l.f.FAST_RENDER, net.minecraft.client.l.f.FAST_MATH, net.minecraft.client.l.f.CHUNK_UPDATES, net.minecraft.client.l.f.CHUNK_UPDATES_DYNAMIC, net.minecraft.client.l.f.LAZY_CHUNK_LOADING};
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.B, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
        this.y.b(n2, n3, this.t);
    }
}

