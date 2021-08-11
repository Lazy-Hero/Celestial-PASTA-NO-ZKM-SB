/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import net.minecraft.client.x.P;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class L {
    public static final /* synthetic */ L c;
    public final /* synthetic */ Vector3f a;
    public final /* synthetic */ Vector3f b;
    public final /* synthetic */ Vector3f d;

    static {
        c = new L(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] arrstring = P.o();
        L l2 = this;
        if (arrstring == null) {
            if (l2 == object) {
                return true;
            }
            l2 = this;
        }
        Object object2 = l2.getClass();
        if (arrstring == null) {
            if (object2 != object.getClass()) {
                return false;
            }
            object2 = object;
        }
        L l3 = (L)object2;
        boolean bl2 = this.b.equals((Object)l3.b);
        if (arrstring == null) {
            if (!bl2) return false;
            bl2 = this.d.equals((Object)l3.d);
        }
        if (arrstring == null) {
            if (!bl2) return false;
            bl2 = this.a.equals((Object)l3.a);
        }
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public L(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        this.b = new Vector3f((ReadableVector3f)vector3f);
        this.a = new Vector3f((ReadableVector3f)vector3f2);
        this.d = new Vector3f((ReadableVector3f)vector3f3);
    }
}

