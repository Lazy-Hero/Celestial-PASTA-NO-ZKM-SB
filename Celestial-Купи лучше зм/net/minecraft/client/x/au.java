/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import javax.annotation.Nullable;
import net.minecraft.client.x.P;

public class au {
    public /* synthetic */ float[] a;
    public final /* synthetic */ int b;

    public int b(int n2) {
        return (n2 + (4 - this.b / 90)) % 4;
    }

    public au(@Nullable float[] arrf, int n2) {
        this.a = arrf;
        this.b = n2;
    }

    public void a(float[] arrf) {
        block3: {
            block2: {
                String[] arrstring = P.o();
                au au2 = this;
                if (arrstring != null) break block2;
                if (au2.a != null) break block3;
                au2 = this;
            }
            au2.a = arrf;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public float c(int n2) {
        float f10;
        block7: {
            int n3;
            block6: {
                int n4;
                String[] arrstring = P.o();
                au au2 = this;
                if (arrstring == null) {
                    if (au2.a == null) {
                        throw new NullPointerException("uvs");
                    }
                    au2 = this;
                }
                n3 = n4 = au2.d(n2);
                if (arrstring != null) break block6;
                if (n3 == 0) break block7;
                n3 = n4;
            }
            if (n3 != 1) {
                f10 = this.a[2];
                return f10;
            }
        }
        f10 = this.a[0];
        return f10;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    private int d(int n2) {
        return (n2 + this.b / 90) % 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float a(int n2) {
        float f10;
        block7: {
            int n3;
            block6: {
                int n4;
                String[] arrstring = P.o();
                au au2 = this;
                if (arrstring == null) {
                    if (au2.a == null) {
                        throw new NullPointerException("uvs");
                    }
                    au2 = this;
                }
                n3 = n4 = au2.d(n2);
                if (arrstring != null) break block6;
                if (n3 == 0) break block7;
                n3 = n4;
            }
            if (n3 != 3) {
                f10 = this.a[3];
                return f10;
            }
        }
        f10 = this.a[1];
        return f10;
    }
}

