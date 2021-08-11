/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.D.h;
import net.minecraft.client.b.s;

public class dn
extends s {
    private /* synthetic */ cx s;

    public cx b() {
        return this.s;
    }

    private static String a(cx cx2) {
        String string = net.minecraft.client.D.h.a(cx2.a(), new Object[0]) + ": ";
        switch (cx2) {
            case ANTIALIASING: {
                return string + dm.a(cS.bl);
            }
            case NORMAL_MAP: {
                return string + dm.a(cS.o);
            }
            case SPECULAR_MAP: {
                return string + dm.a(cS.aT);
            }
            case RENDER_RES_MUL: {
                return string + dm.a(cS.cp);
            }
            case SHADOW_RES_MUL: {
                return string + dm.a(cS.dL);
            }
            case HAND_DEPTH_MUL: {
                return string + dm.b(cS.cd);
            }
            case CLOUD_SHADOW: {
                return string + dm.a(cS.bJ);
            }
            case OLD_HAND_LIGHT: {
                return string + cS.bg.c();
            }
            case OLD_LIGHTING: {
                return string + cS.ao.c();
            }
            case SHADOW_CLIP_FRUSTRUM: {
                return string + dm.a(cS.c_);
            }
            case TWEAK_BLOCK_DAMAGE: {
                return string + dm.a(cS.cX);
            }
        }
        return string + cS.a(cx2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public dn(cx cx2, int n2, int n3, int n4, int n5) {
        super(cx2.ordinal(), n2, n3, n4, n5, dn.a(cx2));
        this.s = null;
        this.s = cx2;
    }

    public void a() {
        this.m = dn.a(this.s);
    }
}

