/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.a;

import net.minecraft.client.a.I;
import org.lwjgl.opengl.GL11;

class e {
    private final /* synthetic */ int a;
    private /* synthetic */ boolean b;

    public void b() {
        this.a(true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(boolean bl2) {
        block3: {
            int n2;
            block4: {
                block5: {
                    String string;
                    block2: {
                        string = I.j();
                        n2 = bl2;
                        if (string != null) break block2;
                        if (n2 == this.b) break block3;
                        this.b = bl2;
                        n2 = bl2 ? 1 : 0;
                    }
                    if (string != null) break block4;
                    if (n2 == 0) break block5;
                    GL11.glEnable((int)this.a);
                    if (string == null) break block3;
                }
                n2 = this.a;
            }
            GL11.glDisable((int)n2);
        }
    }

    static boolean a(e e10) {
        return e10.b;
    }

    public void a() {
        this.a(false);
    }

    public e(int n2) {
        this.a = n2;
    }
}

