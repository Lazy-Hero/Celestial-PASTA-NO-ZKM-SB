/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.G;
import net.minecraft.ar.v;
import net.minecraft.client.C.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.W;

public class V
extends u<G> {
    private static final /* synthetic */ v[] z;

    protected v a(G g10) {
        return z[g10.ag()];
    }

    public V(a4 a42) {
        super(a42, new W(0.0f), 0.7f);
        this.a(new j(this));
    }

    static {
        z = new v[]{new v("textures/entity/llama/llama_creamy.png"), new v("textures/entity/llama/llama_white.png"), new v("textures/entity/llama/llama_brown.png"), new v("textures/entity/llama/llama_gray.png")};
    }
}

