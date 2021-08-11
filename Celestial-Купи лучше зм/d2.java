/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.util.List;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aW;
import net.minecraft.client.b.s;

public class d2
extends L {
    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block3: {
            s s2;
            s s3;
            block5: {
                String string;
                block4: {
                    d2 d22;
                    block2: {
                        string = K.d();
                        d22 = this;
                        if (string != null) break block2;
                        super.a(n2, n3, n4);
                        if (n4 != 1) break block3;
                        d22 = this;
                    }
                    s2 = s3 = d2.a(d22.t, n2, n3);
                    if (string != null) break block4;
                    if (s2 == null) break block3;
                    s2 = s3;
                }
                if (string != null) break block5;
                if (!s2.h) break block3;
                s2 = s3;
            }
            s2.a(this.m.p());
            this.b(s3);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static s a(List<s> list, int n2, int n3) {
        int n4 = 0;
        String string = K.d();
        while (n4 < list.size()) {
            block5: {
                block6: {
                    int n5;
                    int n6;
                    s s2;
                    block8: {
                        int n7;
                        block7: {
                            s2 = list.get(n4);
                            if (string != null) break block5;
                            if (!s2.l) break block6;
                            int n8 = aW.a(s2);
                            n7 = aW.b(s2);
                            if (string != null) break block5;
                            if (n2 < s2.o) break block6;
                            n6 = n3;
                            n5 = s2.r;
                            if (string != null) break block7;
                            if (n6 < n5) break block6;
                            n6 = n2;
                            n5 = s2.o + n8;
                        }
                        if (string != null) break block8;
                        if (n6 >= n5) break block6;
                        n6 = n3;
                        n5 = s2.r + n7;
                    }
                    if (n6 < n5) {
                        return s2;
                    }
                }
                ++n4;
            }
            if (string == null) continue;
        }
        return null;
    }

    protected void b(s s2) throws IOException {
    }
}

