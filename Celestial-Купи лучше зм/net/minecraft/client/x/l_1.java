/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.client.x.P;
import net.minecraft.client.x.X;
import net.minecraft.client.x.w;
import net.minecraft.client.x.z;
import org.lwjgl.util.vector.Vector3f;

public class l {
    public final /* synthetic */ w a;
    public final /* synthetic */ Vector3f e;
    public final /* synthetic */ Map<aA, z> c;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Vector3f d;

    private void a() {
        Iterator<Map.Entry<aA, z>> iterator = this.c.entrySet().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            Map.Entry<aA, z> entry = iterator.next();
            float[] arrf = this.a(entry.getKey());
            entry.getValue().e.a(arrf);
            if (arrstring == null) continue;
        }
    }

    private float[] a(aA aA2) {
        String[] arrstring = P.o();
        int n2 = X.a[aA2.ordinal()];
        if (arrstring == null) {
            switch (n2) {
                case 1: {
                    return new float[]{this.e.x, 16.0f - this.d.z, this.d.x, 16.0f - this.e.z};
                }
                case 2: {
                    return new float[]{this.e.x, this.e.z, this.d.x, this.d.z};
                }
                default: {
                    return new float[]{16.0f - this.d.x, 16.0f - this.d.y, 16.0f - this.e.x, 16.0f - this.e.y};
                }
                case 4: {
                    return new float[]{this.e.x, 16.0f - this.d.y, this.d.x, 16.0f - this.e.y};
                }
                case 5: {
                    return new float[]{this.e.z, 16.0f - this.d.y, this.d.z, 16.0f - this.e.y};
                }
                case 6: 
            }
            n2 = 4;
        }
        float[] arrf = new float[n2];
        arrf[0] = 16.0f - this.d.z;
        arrf[1] = 16.0f - this.d.y;
        arrf[2] = 16.0f - this.e.z;
        arrf[3] = 16.0f - this.e.y;
        return arrf;
    }

    public l(Vector3f vector3f, Vector3f vector3f2, Map<aA, z> map, @Nullable w w2, boolean bl2) {
        this.e = vector3f;
        this.d = vector3f2;
        this.c = map;
        this.a = w2;
        this.b = bl2;
        this.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

