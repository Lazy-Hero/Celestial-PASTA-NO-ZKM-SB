/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import java.util.Set;
import net.minecraft.U.B;
import net.minecraft.client.C.w;
import net.minecraft.client.a.v;
import net.minecraft.client.q.a;
import net.minecraft.client.r.ae;
import net.minecraft.client.w.r;

public class ee
implements w {
    private /* synthetic */ ae a;

    public ee(ae ae2) {
        this.a = null;
        this.a = ae2;
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(B b10, float f10, float f11) {
        block3: {
            B b11;
            block4: {
                boolean bl2;
                block2: {
                    String string = K.d();
                    bl2 = fU.ab();
                    if (string != null) break block2;
                    if (!bl2) break block3;
                    b11 = b10;
                    if (string != null) break block4;
                    bl2 = b11 instanceof a;
                }
                if (!bl2) break block3;
                b11 = b10;
            }
            a a10 = (a)b11;
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            v.u();
            v.c();
            r r2 = this.a.a();
            fB.a(r2, a10, f10, f11);
            v.E();
        }
    }

    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a(b10, f16, f12);
    }

    public static void a(Map map) {
        block6: {
            boolean bl2;
            block3: {
                Set set = map.keySet();
                String string = K.d();
                boolean bl3 = false;
                for (Object k2 : set) {
                    block5: {
                        Object v2;
                        block4: {
                            Object v3;
                            v2 = v3 = map.get(k2);
                            if (string != null) break block4;
                            bl2 = v2 instanceof ae;
                            if (string != null) break block3;
                            if (!bl2) break block5;
                            v2 = v3;
                        }
                        ae ae2 = (ae)v2;
                        ae2.a(new ee(ae2));
                        bl3 = true;
                    }
                    if (string == null) continue;
                }
                bl2 = bl3;
            }
            if (bl2) break block6;
            fU.h("PlayerItemsLayer not registered");
        }
    }
}

