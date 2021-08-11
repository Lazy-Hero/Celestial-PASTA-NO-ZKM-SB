/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.r;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.ag.D;
import net.minecraft.ag.F;
import net.minecraft.ag.H;
import net.minecraft.ag.J;
import net.minecraft.ag.K;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.L;

public class v
extends u<D> {
    private static final /* synthetic */ Map<Class<?>, net.minecraft.ar.v> z;
    private final /* synthetic */ float A;

    public v(a4 a42, float f10) {
        super(a42, new L(), 0.75f);
        this.A = f10;
    }

    protected void a(D d10, float f10) {
        net.minecraft.client.a.v.d(this.A, this.A, this.A);
        super.e(d10, f10);
    }

    public v(a4 a42) {
        this(a42, 1.0f);
    }

    static {
        z = Maps.newHashMap();
        z.put(F.class, new net.minecraft.ar.v("textures/entity/horse/donkey.png"));
        z.put(H.class, new net.minecraft.ar.v("textures/entity/horse/mule.png"));
        z.put(K.class, new net.minecraft.ar.v("textures/entity/horse/horse_zombie.png"));
        z.put(J.class, new net.minecraft.ar.v("textures/entity/horse/horse_skeleton.png"));
    }

    protected net.minecraft.ar.v a(D d10) {
        return z.get(d10.getClass());
    }
}

