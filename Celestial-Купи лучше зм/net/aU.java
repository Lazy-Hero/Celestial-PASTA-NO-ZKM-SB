/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.NotImplementedException
 */
package net;

import net.minecraft.client.a.Y;
import net.minecraft.k.m;
import org.apache.commons.lang3.NotImplementedException;

public class aU {
    private static /* synthetic */ m[] b;

    public static boolean a(dU dU2) {
        throw new NotImplementedException("Forge dummy class");
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public aU(Y y2) {
        throw new NotImplementedException("Forge dummy class");
    }

    public static m[] b() {
        return b;
    }

    static {
        if (aU.b() == null) {
            aU.b(new m[2]);
        }
    }
}

