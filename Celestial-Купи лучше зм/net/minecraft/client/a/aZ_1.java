/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.glu.GLU
 */
package net.minecraft.client.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.a.I;
import net.minecraft.client.a.v;
import org.lwjgl.util.glu.GLU;

public class aZ {
    public static synchronized int c(int n2) {
        int n3;
        block2: {
            int n4;
            block3: {
                String string;
                int n5;
                block5: {
                    int n6;
                    block4: {
                        n4 = v.k(n2);
                        String string2 = I.j();
                        n3 = n4;
                        if (string2 != null) break block2;
                        if (n3 != 0) break block3;
                        n5 = v.D();
                        string = "No error code reported";
                        n6 = n5;
                        if (string2 != null) break block4;
                        if (n6 == 0) break block5;
                        n6 = n5;
                    }
                    string = GLU.gluErrorString((int)n6);
                }
                throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n2 + ", GL error (" + n5 + "): " + string);
            }
            n3 = n4;
        }
        return n3;
    }

    public static synchronized void a(int n2) {
        aZ.a(n2, 1);
    }

    public static IntBuffer b(int n2) {
        return aZ.d(n2 << 2).asIntBuffer();
    }

    public static synchronized ByteBuffer d(int n2) {
        return ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public static FloatBuffer e(int n2) {
        return aZ.d(n2 << 2).asFloatBuffer();
    }

    public static synchronized void a(int n2, int n3) {
        v.a(n2, n3);
    }
}

