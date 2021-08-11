/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import net.minecraft.c.k;
import net.minecraft.client.u.C;
import net.minecraft.client.u.av;

class q
implements k<String> {
    final /* synthetic */ int a;
    final /* synthetic */ C b;

    q(C c10, int n2) {
        this.b = c10;
        this.a = n2;
    }

    public String a() throws Exception {
        int[] arrn = av.e();
        int n2 = this.a;
        if (arrn != null) {
            if (n2 == 0) {
                return "MISC_TEXTURE";
            }
            n2 = this.a;
        }
        int n3 = 1;
        if (arrn != null) {
            if (n2 == n3) {
                return "TERRAIN_TEXTURE";
            }
            n2 = this.a;
            n3 = 3;
        }
        return n2 == n3 ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + this.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

