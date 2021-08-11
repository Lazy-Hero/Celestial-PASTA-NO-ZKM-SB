/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.f;
import net.minecraft.c.k;
import net.minecraft.c.l;

class b
implements k<String> {
    final /* synthetic */ f a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public String a() {
        String string;
        block5: {
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            List<String> list = runtimeMXBean.getInputArguments();
            String string2 = l.b();
            int n2 = 0;
            StringBuilder stringBuilder = new StringBuilder();
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                block7: {
                    int n3;
                    String string3;
                    block6: {
                        string = string3 = iterator.next();
                        if (string2 != null) break block5;
                        n3 = string.startsWith("-X");
                        if (string2 != null) break block6;
                        if (n3 == 0) break block7;
                        n3 = n2++;
                    }
                    if (n3 > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append(string3);
                }
                if (string2 == null) continue;
            }
            string = String.format("%d total; %s", n2, stringBuilder);
        }
        return string;
    }

    b(f f10) {
        this.a = f10;
    }
}

