/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.l;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class dt
extends L {
    private static final /* synthetic */ f[] A;
    private final /* synthetic */ c y;
    private final /* synthetic */ L B;
    protected /* synthetic */ String z;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void r() {
        block3: {
            boolean bl2;
            String string = K.d();
            this.z = net.minecraft.client.D.h.a("of.options.animationsTitle", new Object[0]);
            this.t.clear();
            String string2 = string;
            for (int i2 = 0; i2 < A.length; ++i2) {
                f f10 = A[i2];
                int n2 = h / 2 - 155 + i2 % 2 * 160;
                int n3 = w / 6 + 21 * (i2 / 2) - 12;
                bl2 = f10.f();
                if (string2 == null) {
                    if (string2 != null) continue;
                    if (!bl2) {
                        this.t.add(new dH(f10.e(), n2, n3, f10, this.y.c(f10)));
                        if (string2 == null) continue;
                    }
                    this.t.add(new d7(f10.e(), n2, n3, f10));
                    if (string2 == null) continue;
                }
                break block3;
            }
            this.t.add(new s(210, h / 2 - 155, w / 6 + 168 + 11, 70, 20, gl.a("of.options.animation.allOn")));
            this.t.add(new s(211, h / 2 - 155 + 80, w / 6 + 168 + 11, 70, 20, gl.a("of.options.animation.allOff")));
            bl2 = this.t.add(new B(200, h / 2 + 5, w / 6 + 168 + 11, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        }
    }

    public dt(L l2, c c10) {
        this.B = l2;
        this.y = c10;
    }

    @Override
    protected void a(s s2) {
        block10: {
            int n2;
            int n3;
            String string;
            block11: {
                block13: {
                    block12: {
                        block9: {
                            string = K.d();
                            n3 = s2.h;
                            if (string != null) break block9;
                            if (n3 == 0) break block10;
                            n3 = s2.g;
                        }
                        n2 = 200;
                        if (string != null) break block11;
                        if (n3 >= n2) break block12;
                        n3 = s2 instanceof B;
                        if (string != null) break block13;
                        if (n3 != 0) {
                            this.y.b(((B)s2).b(), 1);
                            s2.m = this.y.c(net.minecraft.client.l.f.a(s2.g));
                        }
                    }
                    n3 = s2.g;
                }
                n2 = 200;
            }
            if (string == null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(this.B);
                }
                n3 = s2.g;
                n2 = 210;
            }
            if (string == null) {
                if (n3 == n2) {
                    this.m.ac.a(true);
                }
                n3 = s2.g;
                n2 = 211;
            }
            if (n3 == n2) {
                this.m.ac.a(false);
            }
            l l2 = new l(this.m);
            this.a(this.m, l2.e(), l2.a());
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.z, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    static {
        A = new f[]{net.minecraft.client.l.f.ANIMATED_WATER, net.minecraft.client.l.f.ANIMATED_LAVA, net.minecraft.client.l.f.ANIMATED_FIRE, net.minecraft.client.l.f.ANIMATED_PORTAL, net.minecraft.client.l.f.ANIMATED_REDSTONE, net.minecraft.client.l.f.ANIMATED_EXPLOSION, net.minecraft.client.l.f.ANIMATED_FLAME, net.minecraft.client.l.f.ANIMATED_SMOKE, net.minecraft.client.l.f.VOID_PARTICLES, net.minecraft.client.l.f.WATER_PARTICLES, net.minecraft.client.l.f.RAIN_SPLASH, net.minecraft.client.l.f.PORTAL_PARTICLES, net.minecraft.client.l.f.POTION_PARTICLES, net.minecraft.client.l.f.DRIPPING_WATER_LAVA, net.minecraft.client.l.f.ANIMATED_TERRAIN, net.minecraft.client.l.f.ANIMATED_TEXTURES, net.minecraft.client.l.f.FIREWORK_PARTICLES, net.minecraft.client.l.f.PARTICLES};
    }
}

