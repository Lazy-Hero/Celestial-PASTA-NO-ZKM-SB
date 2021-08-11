/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.ag.A;
import net.minecraft.ag.au;
import net.minecraft.k.h;

class s
extends net.minecraft.ak.h {
    private final /* synthetic */ au c;

    @Override
    public void b() {
        block4: {
            Random random;
            block5: {
                au au2;
                block7: {
                    block6: {
                        int n2;
                        String[] arrstring;
                        block2: {
                            block3: {
                                int n3 = this.c.u();
                                arrstring = A.b();
                                n2 = n3;
                                if (arrstring == null) break block2;
                                if (n2 <= 100) break block3;
                                this.c.b(0.0f, 0.0f, 0.0f);
                                if (arrstring != null) break block4;
                            }
                            random = this.c.f();
                            if (arrstring == null) break block5;
                            n2 = random.nextInt(50);
                        }
                        if (n2 == 0) break block6;
                        au2 = this.c;
                        if (arrstring == null) break block7;
                        if (!au.a(au2)) break block6;
                        au2 = this.c;
                        if (arrstring == null) break block7;
                        if (au2.b()) break block4;
                    }
                    au2 = this.c;
                }
                random = au2.f();
            }
            float f10 = random.nextFloat() * ((float)Math.PI * 2);
            float f11 = h.c(f10) * 0.2f;
            float f12 = -0.1f + this.c.f().nextFloat() * 0.2f;
            float f13 = h.g(f10) * 0.2f;
            this.c.b(f11, f12, f13);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        return true;
    }

    public s(au au2) {
        this.c = au2;
    }
}

