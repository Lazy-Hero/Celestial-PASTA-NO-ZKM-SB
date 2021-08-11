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

public class dk
extends L {
    protected /* synthetic */ String A;
    private final /* synthetic */ L B;
    private final /* synthetic */ c z;
    private static final /* synthetic */ f[] y;
    private final /* synthetic */ fN C;

    public dk(L l2, c c10) {
        this.C = new fN(this);
        this.B = l2;
        this.z = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(s s2) {
        block8: {
            int n2;
            int n3;
            String string;
            block9: {
                block11: {
                    block10: {
                        block7: {
                            string = K.d();
                            n3 = s2.h;
                            if (string != null) break block7;
                            if (n3 == 0) break block8;
                            n3 = s2.g;
                        }
                        n2 = 200;
                        if (string != null) break block9;
                        if (n3 >= n2) break block10;
                        n3 = s2 instanceof B;
                        if (string != null) break block11;
                        if (n3 != 0) {
                            this.z.b(((B)s2).b(), 1);
                            s2.m = this.z.c(net.minecraft.client.l.f.a(s2.g));
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
                n2 = net.minecraft.client.l.f.AA_LEVEL.ordinal();
            }
            if (n3 != n2) {
                l l2 = new l(this.m);
                this.a(this.m, l2.e(), l2.a());
            }
        }
    }

    @Override
    public void r() {
        block3: {
            boolean bl2;
            this.A = net.minecraft.client.D.h.a("of.options.qualityTitle", new Object[0]);
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
                        this.t.add(new dH(f10.e(), n2, n3, f10, this.z.c(f10)));
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
        y = new f[]{net.minecraft.client.l.f.MIPMAP_LEVELS, net.minecraft.client.l.f.MIPMAP_TYPE, net.minecraft.client.l.f.AF_LEVEL, net.minecraft.client.l.f.AA_LEVEL, net.minecraft.client.l.f.CLEAR_WATER, net.minecraft.client.l.f.RANDOM_MOBS, net.minecraft.client.l.f.BETTER_GRASS, net.minecraft.client.l.f.BETTER_SNOW, net.minecraft.client.l.f.CUSTOM_FONTS, net.minecraft.client.l.f.CUSTOM_COLORS, net.minecraft.client.l.f.SWAMP_COLORS, net.minecraft.client.l.f.SMOOTH_BIOMES, net.minecraft.client.l.f.CONNECTED_TEXTURES, net.minecraft.client.l.f.NATURAL_TEXTURES, net.minecraft.client.l.f.CUSTOM_SKY, net.minecraft.client.l.f.CUSTOM_ITEMS, net.minecraft.client.l.f.CUSTOM_ENTITY_MODELS, net.minecraft.client.l.f.CUSTOM_GUIS};
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.A, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
        this.C.b(n2, n3, this.t);
    }
}

