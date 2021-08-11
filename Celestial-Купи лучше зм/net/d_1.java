/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.G;
import net.H;
import net.aJ;
import net.e;
import net.h;
import net.i;
import net.l;
import net.r;
import net.x;

public class d {
    private final /* synthetic */ i a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private r b(Deque<G> deque) throws x {
        G g10 = deque.poll();
        int[] arrn = G.c();
        G g11 = g10;
        if (arrn != null) return d.a(g11);
        d.a(g11, "Missing expression");
        switch (g10.a()) {
            case CONSTANT: {
                g11 = g10;
                return d.a(g11);
            }
            case IDENTIFIER: {
                H h2 = this.a(g10, deque);
                if (h2 == null) return this.b(g10);
                return this.a(h2, deque);
            }
            case BRACKET_OPEN: {
                return this.b(g10, deque);
            }
            case OPERATOR: {
                H h3 = H.a(g10.b());
                d.a((Object)h3, "Invalid operator: " + g10);
                H h4 = h3;
                H h5 = H.PLUS;
                if (arrn == null) {
                    if (h4 == h5) {
                        return this.b(deque);
                    }
                    h4 = h3;
                    h5 = H.MINUS;
                }
                if (h4 != h5) throw new x("Invalid expression: " + g10);
                r r2 = this.b(deque);
                return new h(H.NEG, new r[]{r2});
            }
        }
        throw new x("Invalid expression: " + g10);
    }

    private r b(List<r> list, List<H> list2) throws x {
        int n2;
        int n3;
        block14: {
            block15: {
                Object object;
                block21: {
                    int n4;
                    block20: {
                        int n5;
                        int[] arrn;
                        block19: {
                            int n6;
                            int n7;
                            block18: {
                                int n8;
                                block17: {
                                    int n9;
                                    block16: {
                                        arrn = G.c();
                                        n8 = list.size();
                                        n9 = list2.size() + 1;
                                        if (arrn != null) break block16;
                                        if (n8 != n9) {
                                            throw new x("Invalid infix expression, expressions: " + list.size() + ", operators: " + list2.size());
                                        }
                                        n8 = list.size();
                                        if (arrn != null) break block17;
                                        n9 = 1;
                                    }
                                    if (n8 == n9) {
                                        return list.get(0);
                                    }
                                    n8 = Integer.MAX_VALUE;
                                }
                                n3 = n8;
                                n2 = Integer.MIN_VALUE;
                                for (H h2 : list2) {
                                    n3 = Math.min(h2.c(), n3);
                                    n2 = Math.max(h2.c(), n2);
                                    if (arrn == null) {
                                        if (arrn == null) continue;
                                    }
                                    break block14;
                                }
                                n7 = n2;
                                n6 = n3;
                                if (arrn != null) break block18;
                                if (n7 < n6) break block14;
                                n7 = n2 - n3;
                                if (arrn != null) break block19;
                                n6 = 10;
                            }
                            if (n7 > n6) break block14;
                            n7 = n5 = n2;
                        }
                        while (n5 >= n3) {
                            this.a(list, list2, n5);
                            --n5;
                            if (arrn == null) {
                                if (arrn == null) continue;
                            }
                            break block15;
                        }
                        n4 = list.size();
                        if (arrn != null) break block20;
                        if (n4 != 1) break block15;
                        object = list2;
                        if (arrn != null) break block21;
                        n4 = object.size();
                    }
                    if (n4 != 0) break block15;
                    object = list.get(0);
                }
                return (r)object;
            }
            throw new x("Error merging operators, expressions: " + list.size() + ", operators: " + list2.size());
        }
        throw new x("Invalid infix precedence, min: " + n3 + ", max: " + n2);
    }

    public d(i i2) {
        this.a = i2;
    }

    private r a(H h2, Deque<G> deque) throws x {
        int[] arrn = G.c();
        Object object = h2;
        if (arrn == null) {
            if (object.b() == 0) {
                return d.a(h2, new r[0]);
            }
            object = deque.poll();
        }
        G g10 = (G)object;
        Deque<G> deque2 = d.a(deque, e.BRACKET_CLOSE, true);
        r[] arrr = this.a(deque2);
        return d.a(h2, arrr);
    }

    private r a(List<r> list, List<G> list2) throws x {
        LinkedList<H> linkedList = new LinkedList<H>();
        Iterator<G> iterator = list2.iterator();
        int[] arrn = G.c();
        while (iterator.hasNext()) {
            G g10 = iterator.next();
            H h2 = H.a(g10.b());
            d.a((Object)h2, "Invalid operator: " + g10);
            linkedList.add(h2);
            if (arrn == null) continue;
        }
        return this.b(list, linkedList);
    }

    private static r a(H h2, r[] arrr) throws x {
        if (h2.b() != arrr.length) {
            throw new x("Invalid number of arguments: " + arrr.length + ", should be: " + h2.b() + ", function: " + h2.a());
        }
        return new h(h2, arrr);
    }

    private r b(G g10, Deque<G> deque) throws x {
        Deque<G> deque2 = d.a(deque, e.BRACKET_CLOSE, true);
        return this.c(deque2);
    }

    private r[] a(Deque<G> deque) throws x {
        ArrayList<r> arrayList = new ArrayList<r>();
        int[] arrn = G.c();
        while (true) {
            Deque<G> deque2;
            r r2;
            if ((r2 = this.c(deque2 = d.a(deque, e.COMMA, false))) == null) {
                r[] arrr = arrayList.toArray(new r[arrayList.size()]);
                if (arrn != null) continue;
                return arrr;
            }
            arrayList.add(r2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private H a(G var1_1, Deque<G> var2_2) throws x {
        var4_3 = var2_2.peek();
        var3_4 = G.c();
        v0 = var4_3;
        if (var3_4 == null) {
            if (v0 != null) {
                v0 = var4_3;
                if (var3_4 == null) {
                    if (v0.a() == e.BRACKET_OPEN) {
                        var5_5 = H.a(var4_3.b());
                        d.a((Object)var5_5, "Unknown function: " + var4_3);
                        return var5_5;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var4_3;
            }
        }
        v1 = var5_6 = H.a(v0.b());
        if (var3_4 == null) {
            if (v1 == null) {
                return null;
            }
            v1 = var5_6;
        }
        if (var3_4 != null) return v1;
        if (v1.b() > 0) {
            throw new x("Missing arguments: " + (Object)var5_6);
        }
        v1 = var5_6;
        return v1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Deque<G> a(Deque<G> var0, e var1_1, boolean var2_2) throws x {
        block8: {
            var4_3 = new ArrayDeque<G>();
            var3_4 = G.c();
            var5_5 = 0;
            var6_6 = var4_3.iterator();
            while (var6_6.hasNext()) {
                var7_7 = (G)var6_6.next();
                var6_6.remove();
                v0 = var5_5;
                if (var3_4 != null) break block8;
                if (var3_4 != null) ** GOTO lbl20
                if (v0 == 0) {
                    v1 = var7_7.a();
                    v2 = var1_1;
                    if (var3_4 == null) {
                        if (v1 == v2) {
                            return var4_3;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    var4_3.add(var7_7);
lbl20:
                    // 2 sources

                    v1 = var7_7.a();
                    v2 = e.BRACKET_OPEN;
                }
                if (var3_4 == null) {
                    if (v1 == v2) {
                        ++var5_5;
                    }
                    v1 = var7_7.a();
                    v2 = e.BRACKET_CLOSE;
                }
                if (v1 == v2) {
                    --var5_5;
                }
                if (var3_4 == null) continue;
            }
            v0 = var2_2;
        }
        if (v0 == 0) return var4_3;
        throw new x("Missing end token: " + (Object)var1_1);
    }

    private r b(G g10) throws x {
        r r2;
        int[] arrn = G.c();
        i i2 = this.a;
        if (arrn == null) {
            if (i2 == null) {
                throw new x("Model variable not found: " + g10);
            }
            i2 = this.a;
        }
        r r3 = r2 = i2.c(g10.b());
        if (arrn == null) {
            if (r3 == null) {
                throw new x("Model variable not found: " + g10);
            }
            r3 = r2;
        }
        return r3;
    }

    private r c(Deque<G> deque) throws x {
        int[] arrn = G.c();
        if (deque.isEmpty()) {
            return null;
        }
        LinkedList<r> linkedList = new LinkedList<r>();
        LinkedList<G> linkedList2 = new LinkedList<G>();
        r r2 = this.b(deque);
        d.a(r2, "Missing expression");
        linkedList.add(r2);
        while (true) {
            r r3;
            G g10;
            if ((g10 = deque.poll()) == null) {
                r3 = this.a(linkedList, linkedList2);
                if (arrn == null) {
                    return r3;
                }
            } else {
                if (g10.a() != e.OPERATOR) {
                    throw new x("Invalid operator: " + g10);
                }
                r3 = this.b(deque);
            }
            r r4 = r3;
            d.a(r4, "Missing expression");
            linkedList2.add(g10);
            linkedList.add(r4);
        }
    }

    public static void main(String[] arrstring) throws Exception {
        d d10 = new d(null);
        while (true) {
            try {
                while (true) {
                    InputStreamReader inputStreamReader;
                    BufferedReader bufferedReader;
                    String string;
                    if ((string = (bufferedReader = new BufferedReader(inputStreamReader = new InputStreamReader(System.in))).readLine()).length() <= 0) {
                        return;
                    }
                    r r2 = d10.a(string);
                    float f10 = r2.a();
                    fU.b("" + string + " = " + f10);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                continue;
            }
            break;
        }
    }

    private void a(List<r> list, List<H> list2, int n2) {
        int n3 = 0;
        int[] arrn = G.c();
        while (n3 < list2.size()) {
            H h2 = list2.get(n3);
            if (arrn == null) {
                if (h2.c() == n2) {
                    list2.remove(n3);
                    r r2 = list.remove(n3);
                    r r3 = list.remove(n3);
                    h h3 = new h(h2, new r[]{r2, r3});
                    list.add(n3, h3);
                    --n3;
                }
                ++n3;
            }
            if (arrn == null) continue;
        }
    }

    private static r a(G g10) throws x {
        float f10 = fU.a(g10.b(), Float.NaN);
        if (f10 == Float.NaN) {
            throw new x("Invalid float value: " + g10);
        }
        return new l(f10);
    }

    private static void a(Object object, String string) throws x {
        if (object == null) {
            throw new x(string);
        }
    }

    public r a(String string) throws x {
        try {
            G[] arrg = aJ.a(string);
            if (arrg == null) {
                return null;
            }
            ArrayDeque<G> arrayDeque = new ArrayDeque<G>(Arrays.asList(arrg));
            return this.c(arrayDeque);
        }
        catch (IOException iOException) {
            throw new x(iOException.getMessage(), iOException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

