/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import net.minecraft.client.I.s;
import net.minecraft.client.a.v;
import net.minecraft.client.b.M;
import net.minecraft.client.l.d;
import org.lwjgl.input.Keyboard;

public class bh
extends bE {
    private static gP b(gP gP2) {
        return gP2;
    }

    public bh() {
        super("InventoryWalk", a5.Player);
    }

    @cL
    public void a(fb fb2) {
        String string;
        d[] arrd;
        block5: {
            block4: {
                boolean bl2;
                block3: {
                    arrd = new d[]{bh.c.ac.aW, bh.c.ac.O, bh.c.ac.C, bh.c.ac.G, bh.c.ac.v, bh.c.ac.cc};
                    string = v.A();
                    bl2 = bh.c.aO instanceof M;
                    if (string == null) break block3;
                    if (bl2) break block4;
                    bl2 = bh.c.aO instanceof s;
                }
                if (!bl2) break block5;
            }
            return;
        }
        d[] arrd2 = arrd;
        int n2 = arrd.length;
        for (int n3 = 0; n3 < n2; n3 = (int)((byte)(n3 + 1))) {
            d d10 = arrd2[n3];
            d10.d = Keyboard.isKeyDown((int)d10.e());
            if (string != null) continue;
        }
    }
}

