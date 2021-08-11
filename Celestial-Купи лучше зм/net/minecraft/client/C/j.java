/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.ag.G;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.r.V;
import net.minecraft.client.w.W;

public class j
implements w<G> {
    private static final /* synthetic */ v[] b;
    private final /* synthetic */ V a;
    private final /* synthetic */ W c;

    static {
        b = new v[]{new v("textures/entity/llama/decor/decor_white.png"), new v("textures/entity/llama/decor/decor_orange.png"), new v("textures/entity/llama/decor/decor_magenta.png"), new v("textures/entity/llama/decor/decor_light_blue.png"), new v("textures/entity/llama/decor/decor_yellow.png"), new v("textures/entity/llama/decor/decor_lime.png"), new v("textures/entity/llama/decor/decor_pink.png"), new v("textures/entity/llama/decor/decor_gray.png"), new v("textures/entity/llama/decor/decor_silver.png"), new v("textures/entity/llama/decor/decor_cyan.png"), new v("textures/entity/llama/decor/decor_purple.png"), new v("textures/entity/llama/decor/decor_blue.png"), new v("textures/entity/llama/decor/decor_brown.png"), new v("textures/entity/llama/decor/decor_green.png"), new v("textures/entity/llama/decor/decor_red.png"), new v("textures/entity/llama/decor/decor_black.png")};
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public j(V v2) {
        this.c = new W(0.5f);
        this.a = v2;
    }

    @Override
    public void a(G g10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block3: {
            block2: {
                boolean bl2 = m.c();
                if (!bl2) break block2;
                if (!g10.an()) break block3;
                this.a.b(b[g10.af().e()]);
                this.c.a(this.a.b());
            }
            this.c.b(g10, f10, f11, f13, f14, f15, f16);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

