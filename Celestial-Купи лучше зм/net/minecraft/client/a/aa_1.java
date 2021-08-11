/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 */
package net.minecraft.client.a;

import com.google.common.primitives.Floats;
import java.util.Comparator;
import net.minecraft.client.a.I;

class aa
implements Comparator<Integer> {
    final /* synthetic */ float[] b;
    final /* synthetic */ I a;

    aa(I i2, float[] arrf) {
        this.a = i2;
        this.b = arrf;
    }

    public int a(Integer n2, Integer n3) {
        return Floats.compare((float)this.b[n3], (float)this.b[n2]);
    }
}

