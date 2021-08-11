/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import net.D;
import net.aU;
import net.b;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.client.x.P;
import net.minecraft.k.h;
import net.s;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum g implements s,
D
{
    X0_Y0(0, 0),
    X0_Y90(0, 90),
    X0_Y180(0, 180),
    X0_Y270(0, 270),
    X90_Y0(90, 0),
    X90_Y90(90, 90),
    X90_Y180(90, 180),
    X90_Y270(90, 270),
    X180_Y0(180, 0),
    X180_Y90(180, 90),
    X180_Y180(180, 180),
    X180_Y270(180, 270),
    X270_Y0(270, 0),
    X270_Y90(270, 90),
    X270_Y180(270, 180),
    X270_Y270(270, 270);

    private final /* synthetic */ Matrix4f b;
    private final /* synthetic */ int e;
    private final /* synthetic */ int c;
    private final /* synthetic */ int a;
    private static final /* synthetic */ Map<Integer, g> d;

    @Override
    public Optional<aU> a(Optional<? extends b> optional) {
        return (Optional)cq.d(cq.cY, this.a(), optional);
    }

    static {
        d = Maps.newHashMap();
        for (g g10 : g.values()) {
            d.put(g10.c, g10);
        }
    }

    private static int a(int n2, int n3) {
        return n2 * 360 + n3;
    }

    @Override
    public aA a(aA aA2) {
        return this.b(aA2);
    }

    public static g b(int n2, int n3) {
        return d.get(g.a(h.c(n2, 360), h.c(n3, 360)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aA b(aA aA2) {
        aA aA3;
        aA aA4;
        block4: {
            int n2;
            aA4 = aA2;
            String[] arrstring = P.o();
            for (n2 = 0; n2 < this.e; ++n2) {
                aA4 = aA4.a(Q.X);
                if (arrstring == null) {
                    if (arrstring == null) continue;
                }
                break block4;
            }
            aA3 = aA4;
            if (arrstring != null) return aA3;
            if (aA3.g() != Q.Y) {
                for (n2 = 0; n2 < this.a; ++n2) {
                    aA3 = aA4.a(Q.Y);
                    if (arrstring != null) return aA3;
                    aA4 = aA3;
                    if (arrstring == null) continue;
                }
            }
        }
        aA3 = aA4;
        return aA3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b(aA aA2, int n2) {
        int n3;
        block5: {
            n3 = n2;
            String[] arrstring = P.o();
            aA aA3 = aA2;
            if (arrstring == null) {
                if (aA3.g() == Q.X) {
                    n3 = (n2 + this.e) % 4;
                }
                aA3 = aA2;
            }
            aA aA4 = aA3;
            for (int i2 = 0; i2 < this.e; ++i2) {
                aA4 = aA4.a(Q.X);
                if (arrstring == null) {
                    if (arrstring == null) continue;
                }
                break block5;
            }
            if (aA4.g() == Q.Y) {
                n3 = (n3 + this.a) % 4;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public dU a() {
        dU dU2;
        String[] arrstring = P.o();
        Object object = cq.dC;
        if (arrstring == null) {
            if (!((ak)object).b()) {
                dU2 = new dU();
                return dU2;
            }
            object = cq.d(cq.dC, this);
        }
        dU2 = (dU)object;
        return dU2;
    }

    private g(int n3, int n4) {
        this.c = g.a(n3, n4);
        this.b = new Matrix4f();
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        Matrix4f.rotate((float)((float)(-n3) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
        this.e = h.g(n3 / 90);
        Matrix4f matrix4f2 = new Matrix4f();
        matrix4f2.setIdentity();
        Matrix4f.rotate((float)((float)(-n4) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)matrix4f2, (Matrix4f)matrix4f2);
        this.a = h.g(n4 / 90);
        Matrix4f.mul((Matrix4f)matrix4f2, (Matrix4f)matrix4f, (Matrix4f)this.b);
    }

    @Override
    public int a(aA aA2, int n2) {
        return this.b(aA2, n2);
    }

    public Matrix4f a() {
        return this.b;
    }
}

