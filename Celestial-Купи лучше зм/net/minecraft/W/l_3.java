/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.client.B.o;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class l
extends k {
    private final /* synthetic */ K s;

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        super.a(d10, z2, list, o2);
        this.s.a(d10, z2, list, o2);
    }

    @Override
    public String h() {
        return this.s.k();
    }

    public l(K k2) {
        this.s = k2;
    }

    @Override
    public String d(d d10) {
        return this.s.k();
    }
}

