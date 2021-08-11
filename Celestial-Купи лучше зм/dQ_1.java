/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dQ {
    public static String a(String string, int n2, char c10) {
        StringBuffer stringBuffer;
        block8: {
            String string2;
            block10: {
                String string3;
                block9: {
                    string2 = K.d();
                    string3 = string;
                    if (string2 == null) {
                        if (string3 == null) {
                            string = "";
                        }
                        string3 = string;
                    }
                    if (string2 != null) break block9;
                    if (string3.length() < n2) break block10;
                    string3 = string;
                }
                return string3;
            }
            StringBuffer stringBuffer2 = new StringBuffer(string);
            while (stringBuffer2.length() < n2) {
                stringBuffer = stringBuffer2.append(c10);
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block8;
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    public static int b(String[] arrstring, String string) {
        String string2 = K.d();
        if (arrstring != null && string != null) {
            int n2;
            block5: {
                int n3 = 0;
                while (n3 < arrstring.length) {
                    String string3 = arrstring[n3];
                    if (string2 == null) {
                        n2 = string3.endsWith(string) ? 1 : 0;
                        if (string2 != null) break block5;
                        if (n2 != 0) {
                            return n3;
                        }
                        ++n3;
                    }
                    if (string2 == null) continue;
                }
                n2 = -1;
            }
            return n2;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 != null) return string4;
        if (string4 != null) {
            string4 = string2;
            if (string3 != null) return string4;
            if (string4 != null) {
                String string5 = string;
                if (string3 != null) return string5;
                string5 = string5.endsWith(string2) ? string : string2 + string;
                return string5;
            }
        }
        string4 = string;
        return string4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(String string) {
        String string2;
        int n2 = dQ.a(string, -1);
        String string3 = K.d();
        if (string3 == null) {
            if (n2 == -1) {
                return "";
            }
            ++n2;
        }
        String string4 = string2 = "" + n2;
        if (string3 == null) {
            if (string4.length() > string.length()) {
                return "";
            }
            string4 = "" + n2;
        }
        String string5 = dQ.b(string4, string.length(), '0');
        return string5;
    }

    public static boolean a(String string, String[] arrstring) {
        boolean bl2;
        block6: {
            String string2 = K.d();
            if (string == null) {
                return false;
            }
            if (arrstring == null) {
                return false;
            }
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string3 = arrstring[n2];
                if (string2 == null) {
                    bl2 = string.endsWith(string3);
                    if (string2 != null) break block6;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(Object var0, Object var1_1) {
        var2_2 = K.d();
        v0 = var0;
        if (var2_2 == null) {
            if (v0 == var1_1) {
                return true;
            }
            v0 = var0;
        }
        if (var2_2 == null) {
            if (v0 != null) {
                v0 = var0;
                if (var2_2 == null) {
                    if (v0.equals(var1_1)) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        if (var2_2 == null) {
            if (v0 == null) return false;
            v0 = var1_1;
        }
        v1 = v0.equals(var0);
        if (var2_2 != null) return v1;
        if (v1 == false) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String f(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 != null) return string4;
        if (string4 != null) {
            string4 = string2;
            if (string3 != null) return string4;
            if (string4 != null) {
                String string5 = string;
                if (string3 != null) return string5;
                if (string5.startsWith(string2)) {
                    string = string.substring(string2.length());
                }
                string5 = string;
                return string5;
            }
        }
        string4 = string;
        return string4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d(String string, String string2, String string3) {
        String string4 = K.d();
        String string5 = string;
        if (string4 != null) return string5;
        if (string5 != null) {
            string5 = string2;
            if (string4 != null) return string5;
            if (string5 != null) {
                String string6 = string;
                if (string4 == null) {
                    if (!string6.endsWith(string2)) {
                        return string;
                    }
                    string6 = string3;
                }
                if (string4 != null) return string6;
                if (string6 == null) {
                    string3 = "";
                }
                string = string.substring(0, string.length() - string2.length());
                string6 = string + string3;
                return string6;
            }
        }
        string5 = string;
        return string5;
    }

    public static String b(String string, int n2, char c10) {
        String string2;
        block7: {
            String string3;
            block6: {
                string2 = K.d();
                string3 = string;
                if (string2 == null) {
                    if (string3 == null) {
                        string = "";
                    }
                    string3 = string;
                }
                if (string2 != null) break block6;
                if (string3.length() < n2) break block7;
                string3 = string;
            }
            return string3;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = n2 - string.length();
        while (stringBuffer.length() < n3) {
            stringBuffer.append(c10);
            if (string2 == null) continue;
        }
        return stringBuffer + string;
    }

    public static boolean a(String string) {
        String string2 = K.d();
        boolean bl2 = dQ.c(string);
        if (string2 == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(String string, String string2, char c10, char c11) {
        int n2;
        ArrayList<String> arrayList;
        String string3;
        block28: {
            String string4;
            block22: {
                block23: {
                    String string5;
                    block27: {
                        block21: {
                            block25: {
                                boolean bl2;
                                String string6;
                                block26: {
                                    int n3;
                                    block24: {
                                        string3 = K.d();
                                        string4 = string2;
                                        if (string3 != null) break block22;
                                        if (string4 == null) break block23;
                                        string4 = string;
                                        if (string3 != null) break block22;
                                        if (string4 == null) break block23;
                                        n3 = string2.indexOf(c10);
                                        if (string3 != null) break block24;
                                        if (n3 >= 0) break block25;
                                        string6 = string2;
                                        if (string3 != null) break block26;
                                        n3 = string6.indexOf(c11);
                                    }
                                    if (n3 < 0) {
                                        bl2 = string2.equals(string);
                                        return bl2;
                                    }
                                    string6 = string;
                                }
                                bl2 = dQ.d(string6, string2, c11);
                                return bl2;
                            }
                            arrayList = new ArrayList<String>();
                            String string7 = "" + c10;
                            boolean bl3 = string2.startsWith(string7);
                            if (string3 == null && bl3) {
                                bl3 = arrayList.add("");
                            }
                            StringTokenizer stringTokenizer = new StringTokenizer(string2, string7);
                            while (stringTokenizer.hasMoreElements()) {
                                arrayList.add(stringTokenizer.nextToken());
                                if (string3 == null) {
                                    if (string3 == null) continue;
                                }
                                break block21;
                            }
                            string5 = string2;
                            if (string3 != null) break block27;
                            if (string5.endsWith(string7)) {
                                arrayList.add("");
                            }
                        }
                        string5 = (String)arrayList.get(0);
                    }
                    String string8 = string5;
                    String string9 = string;
                    if (string3 == null) {
                        if (!dQ.c(string9, string8, c11)) {
                            return false;
                        }
                        string9 = (String)arrayList.get(arrayList.size() - 1);
                    }
                    String string10 = string9;
                    n2 = dQ.a(string, string10, c11);
                    if (string3 == null) {
                        if (n2 == 0) {
                            return false;
                        }
                        n2 = 0;
                    }
                    break block28;
                }
                string4 = string2;
            }
            if (string4 != string) return false;
            return true;
        }
        int n4 = n2;
        int n5 = 0;
        do {
            if (n5 >= arrayList.size()) return 1 != 0;
            String string11 = (String)arrayList.get(n5);
            if (string3 != null) continue;
            int n6 = string11.length();
            if (string3 != null) return n6 != 0;
            if (n6 > 0) {
                int n7;
                int n8 = n7 = dQ.a(string, string11, n4, c11);
                if (string3 == null) {
                    if (n8 < 0) {
                        return false;
                    }
                    n8 = n7 + string11.length();
                }
                n4 = n8;
            }
            ++n5;
        } while (string3 == null);
        return 1 != 0;
    }

    public static boolean a(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 == null) {
            if (string4 != null) {
                string = string.trim();
            }
            string4 = string2;
        }
        if (string3 == null) {
            if (string4 != null) {
                string2 = string2.trim();
            }
            string4 = string;
        }
        return dQ.a((Object)string4, (Object)string2);
    }

    public static int a(String[] arrstring, String string) {
        String string2 = K.d();
        if (arrstring != null && string != null) {
            int n2;
            block5: {
                int n3 = 0;
                while (n3 < arrstring.length) {
                    String string3 = arrstring[n3];
                    if (string2 == null) {
                        n2 = string3.startsWith(string) ? 1 : 0;
                        if (string2 != null) break block5;
                        if (n2 != 0) {
                            return n3;
                        }
                        ++n3;
                    }
                    if (string2 == null) continue;
                }
                n2 = -1;
            }
            return n2;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, String string2, String string3) {
        String string4 = K.d();
        String string5 = string;
        if (string4 != null) return string5;
        if (string5 != null) {
            string5 = string2;
            if (string4 != null) return string5;
            if (string5 != null) {
                String string6 = string;
                if (string4 == null) {
                    if (!string6.startsWith(string2)) {
                        return string;
                    }
                    string6 = string3;
                }
                if (string4 != null) return string6;
                if (string6 == null) {
                    string3 = "";
                }
                string = string.substring(string2.length());
                string6 = string3 + string;
                return string6;
            }
        }
        string5 = string;
        return string5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean c(String var0, String var1_1, char var2_2) {
        var3_3 = K.d();
        v0 = var0;
        if (var3_3 == null) {
            if (v0 != null) {
                v0 = var1_1;
                if (var3_3 == null) {
                    if (v0 != null) {
                        v1 = var0;
                        if (var3_3 == null) {
                            if (v1.length() < var1_1.length()) {
                                return false;
                            }
                            v1 = var0.substring(0, var1_1.length());
                        }
                        var4_4 = v1;
                        return dQ.d(var4_4, var1_1, var2_2);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        if (v0 != var1_1) return false;
        return true;
    }

    public static boolean a(String string, String[] arrstring, char c10) {
        boolean bl2;
        block4: {
            int n2 = 0;
            String string2 = K.d();
            while (n2 < arrstring.length) {
                String string3 = arrstring[n2];
                if (string2 == null) {
                    bl2 = dQ.b(string, string3, c10);
                    if (string2 != null) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static String b(String string, String string2) {
        String string3;
        block3: {
            String string4 = K.d();
            for (int i2 = 0; i2 < string2.length(); ++i2) {
                string3 = string;
                if (string4 == null) {
                    String string5;
                    if (string4 == null) {
                        if (string3.indexOf(string2.charAt(i2)) >= 0) continue;
                        string5 = string + string2.charAt(i2);
                    }
                    string = string5;
                    if (string4 == null) continue;
                }
                break block3;
            }
            string3 = string;
        }
        return string3;
    }

    private static boolean d(String string, String string2, char c10) {
        String string3;
        block7: {
            block8: {
                int c11;
                block6: {
                    int n2;
                    String string4 = K.d();
                    string3 = string;
                    if (string4 != null) break block7;
                    if (string3 == null) break block8;
                    string3 = string2;
                    if (string4 != null) break block7;
                    if (string3 == null) break block8;
                    int n3 = string.length();
                    if (string4 == null) {
                        if (n3 != string2.length()) {
                            return false;
                        }
                        n3 = n2 = 0;
                    }
                    while (n2 < string2.length()) {
                        block9: {
                            block10: {
                                int c12;
                                block11: {
                                    int c13 = string2.charAt(n2);
                                    if (string4 != null) break block9;
                                    c11 = c13;
                                    if (string4 != null) break block6;
                                    if (c11 == c10) break block10;
                                    c12 = string.charAt(n2);
                                    if (string4 != null) break block11;
                                    if (c12 == c13) break block10;
                                    c12 = 0;
                                }
                                return c12 != 0;
                            }
                            ++n2;
                        }
                        if (string4 == null) continue;
                    }
                    c11 = 1;
                }
                return c11 != 0;
            }
            string3 = string;
        }
        return string3 == string2;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public static String c(String string, String[] arrstring) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 != null && arrstring != null) {
                String string4;
                block5: {
                    int n2 = string.length();
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        String string5 = arrstring[n3];
                        string = dQ.g(string, string5);
                        if (string2 == null) {
                            string4 = string;
                            if (string2 != null) break block5;
                            if (string4.length() != n2 && string2 == null) break;
                            ++n3;
                        }
                        if (string2 == null) continue;
                    }
                    string4 = string;
                }
                return string4;
            }
            string3 = string;
        }
        return string3;
    }

    private static boolean a(char c10, String string) {
        int c11;
        block3: {
            String string2 = K.d();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                c11 = string.charAt(i2);
                if (string2 == null) {
                    boolean bl2;
                    if (string2 == null) {
                        if (c11 != c10) continue;
                        bl2 = true;
                    }
                    return bl2;
                }
                break block3;
            }
            c11 = 0;
        }
        return c11 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String[] e(String string, String string2) {
        int n2;
        block9: {
            String string3;
            String string4;
            block8: {
                string4 = K.d();
                string3 = string;
                if (string4 != null) break block8;
                if (string3 == null) break block9;
                string3 = string;
            }
            n2 = string3.length();
            if (string4 != null) return new String[n2];
            if (n2 > 0) {
                boolean bl2;
                if (string2 == null) {
                    return new String[]{string};
                }
                ArrayList<String> arrayList = new ArrayList<String>();
                int n3 = 0;
                int n4 = 0;
                while (n4 < string.length()) {
                    char c10 = string.charAt(n4);
                    if (string4 == null) {
                        bl2 = dQ.a(c10, string2);
                        if (string4 != null) return arrayList.toArray(new String[arrayList.size()]);
                        if (bl2) {
                            arrayList.add(string.substring(n3, n4));
                            n3 = n4 + 1;
                        }
                        ++n4;
                    }
                    if (string4 == null) continue;
                }
                bl2 = arrayList.add(string.substring(n3));
                return arrayList.toArray(new String[arrayList.size()]);
            }
        }
        n2 = 0;
        return new String[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static boolean a(String var0, String var1_1, char var2_2) {
        var3_3 = K.d();
        v0 = var0;
        if (var3_3 == null) {
            if (v0 != null) {
                v0 = var1_1;
                if (var3_3 == null) {
                    if (v0 != null) {
                        v1 = var0;
                        if (var3_3 == null) {
                            if (v1.length() < var1_1.length()) {
                                return false;
                            }
                            v1 = var0.substring(var0.length() - var1_1.length());
                        }
                        var4_4 = v1;
                        return dQ.d(var4_4, var1_1, var2_2);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0;
            }
        }
        if (v0 != var1_1) return false;
        return true;
    }

    public static String b(String string, String string2, String string3) {
        return dQ.a(string, new String[]{string2}, new String[]{string3});
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(String string, String string2, int n2, char c10) {
        String string3 = K.d();
        String string4 = string;
        if (string3 == null) {
            if (string4 == null) return -1;
            string4 = string2;
        }
        if (string4 == null) return -1;
        int n3 = n2;
        if (string3 != null) return n3;
        if (n3 < 0) return -1;
        n3 = n2;
        if (string3 != null) return n3;
        if (n3 > string.length()) return -1;
        int n4 = string.length();
        if (string3 == null) {
            if (n4 < n2 + string2.length()) {
                return -1;
            }
            n4 = n2;
        }
        int n5 = n4;
        do {
            if (n5 + string2.length() > string.length()) return -1;
            String string5 = string.substring(n5, n5 + string2.length());
            if (string3 != null) continue;
            int n6 = dQ.d(string5, string2, c10) ? (int)1 : 0;
            if (string3 != null) return n6;
            if (n6 != 0) {
                return n5;
            }
            ++n5;
        } while (string3 == null);
        return -1;
    }

    public static String a(String string, String[] arrstring, String[] arrstring2) {
        string = dQ.d(string, arrstring);
        string = dQ.c(string, arrstring2);
        return string;
    }

    public static boolean c(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return true;
            }
            string3 = string.trim();
        }
        boolean bl2 = string3.length();
        if (string2 == null) {
            bl2 = bl2 <= false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String c(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 != null) return string4;
        if (string4 != null) {
            string4 = string2;
            if (string3 != null) return string4;
            if (string4 != null) {
                String string5 = string;
                if (string3 != null) return string5;
                string5 = string5.endsWith(string2) ? string : string + string2;
                return string5;
            }
        }
        string4 = string;
        return string4;
    }

    public static String[] a(String[] arrstring, int n2, int n3) {
        block13: {
            String[] arrstring2;
            block9: {
                int n4;
                int n5;
                String string;
                block14: {
                    block12: {
                        block11: {
                            String[] arrstring3;
                            block10: {
                                string = K.d();
                                arrstring3 = arrstring;
                                if (string != null) break block10;
                                if (arrstring3 != null) break block11;
                                arrstring3 = arrstring;
                            }
                            return arrstring3;
                        }
                        n5 = n3;
                        if (string != null) break block12;
                        if (n5 <= 0) break block13;
                        n5 = n2;
                    }
                    n4 = arrstring.length;
                    if (string != null) break block14;
                    if (n5 >= n4) break block13;
                    n5 = n2;
                    n4 = n3;
                }
                if (n5 >= n4) {
                    return arrstring;
                }
                ArrayList arrayList = new ArrayList(arrstring.length);
                for (int i2 = 0; i2 < arrstring.length; ++i2) {
                    arrstring2 = arrstring;
                    if (string == null) {
                        String string2 = arrstring2[i2];
                        int n6 = i2;
                        if (string != null) continue;
                        if (n6 >= n2) {
                            n6 = i2;
                            if (string != null || n6 < n3) continue;
                        }
                        n6 = arrayList.add(string2) ? (int)1 : 0;
                        if (string == null) continue;
                    }
                    break block9;
                }
                arrstring2 = arrayList.toArray(new String[arrayList.size()]);
            }
            String[] arrstring4 = arrstring2;
            return arrstring4;
        }
        return arrstring;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string, int n2) {
        String string2 = K.d();
        String string3 = string;
        if (string2 != null) return Integer.parseInt(string3);
        if (string3 == null) {
            return n2;
        }
        try {
            string3 = string;
            return Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public static boolean b(String string, String string2, char c10) {
        String string3;
        block27: {
            block28: {
                int n2;
                block26: {
                    String string4;
                    ArrayList<String> arrayList;
                    String string5;
                    block31: {
                        block25: {
                            block30: {
                                int n3;
                                block29: {
                                    string5 = K.d();
                                    string3 = string2;
                                    if (string5 != null) break block27;
                                    if (string3 == null) break block28;
                                    string3 = string;
                                    if (string5 != null) break block27;
                                    if (string3 == null) break block28;
                                    n3 = string2.indexOf(c10);
                                    if (string5 != null) break block29;
                                    if (n3 >= 0) break block30;
                                    n3 = string2.equals(string) ? 1 : 0;
                                }
                                return n3 != 0;
                            }
                            arrayList = new ArrayList<String>();
                            String string6 = "" + c10;
                            boolean bl2 = string2.startsWith(string6);
                            if (string5 == null && bl2) {
                                bl2 = arrayList.add("");
                            }
                            StringTokenizer stringTokenizer = new StringTokenizer(string2, string6);
                            while (stringTokenizer.hasMoreElements()) {
                                arrayList.add(stringTokenizer.nextToken());
                                if (string5 == null) {
                                    if (string5 == null) continue;
                                }
                                break block25;
                            }
                            string4 = string2;
                            if (string5 != null) break block31;
                            if (string4.endsWith(string6)) {
                                arrayList.add("");
                            }
                        }
                        string4 = (String)arrayList.get(0);
                    }
                    String string7 = string4;
                    String string6 = string;
                    if (string5 == null) {
                        if (!string6.startsWith(string7)) {
                            return false;
                        }
                        string6 = (String)arrayList.get(arrayList.size() - 1);
                    }
                    String string9 = string6;
                    int n4 = string.endsWith(string9);
                    if (string5 == null) {
                        if (n4 == 0) {
                            return false;
                        }
                        n4 = 0;
                    }
                    int n5 = n4;
                    int n6 = 0;
                    while (n6 < arrayList.size()) {
                        String string10 = (String)arrayList.get(n6);
                        if (string5 == null) {
                            n2 = string10.length();
                            if (string5 != null) break block26;
                            if (n2 > 0) {
                                int n7;
                                int n8 = n7 = string.indexOf(string10, n5);
                                if (string5 == null) {
                                    if (n8 < 0) {
                                        return false;
                                    }
                                    n8 = n7 + string10.length();
                                }
                                n5 = n8;
                            }
                            ++n6;
                        }
                        if (string5 == null) continue;
                    }
                    n2 = 1;
                }
                return n2 != 0;
            }
            string3 = string2;
        }
        return string3 == string;
    }

    public static boolean b(String string, String[] arrstring) {
        boolean bl2;
        block6: {
            String string2 = K.d();
            if (string == null) {
                return false;
            }
            if (arrstring == null) {
                return false;
            }
            int n2 = 0;
            while (n2 < arrstring.length) {
                String string3 = arrstring[n2];
                if (string2 == null) {
                    bl2 = string.startsWith(string3);
                    if (string2 != null) break block6;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (string2 == null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String g(String string, String string2) {
        String string3 = K.d();
        String string4 = string;
        if (string3 != null) return string4;
        if (string4 != null) {
            string4 = string2;
            if (string3 != null) return string4;
            if (string4 != null) {
                String string5 = string;
                if (string3 != null) return string5;
                if (string5.endsWith(string2)) {
                    string = string.substring(0, string.length() - string2.length());
                }
                string5 = string;
                return string5;
            }
        }
        string4 = string;
        return string4;
    }

    public static String c(String string, String string2, String string3) {
        block6: {
            int n2;
            int n3;
            String string4;
            String string5;
            block8: {
                block7: {
                    block5: {
                        string5 = K.d();
                        string4 = string;
                        if (string5 != null) break block5;
                        if (string4 == null) break block6;
                        string4 = string2;
                    }
                    if (string5 != null) break block7;
                    if (string4 == null) break block6;
                    string4 = string3;
                }
                if (string5 != null) break block8;
                if (string4 == null) break block6;
                string4 = string;
            }
            int n4 = n3 = string4.indexOf(string2);
            if (string5 == null) {
                if (n4 < 0) {
                    return null;
                }
                n4 = string.indexOf(string3, n3);
            }
            return (n2 = n4) < 0 ? null : string.substring(n3, n2 + string3.length());
        }
        return null;
    }

    public static String d(String string, String[] arrstring) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 != null && arrstring != null) {
                String string4;
                block5: {
                    int n2 = string.length();
                    int n3 = 0;
                    while (n3 < arrstring.length) {
                        String string5 = arrstring[n3];
                        string = dQ.f(string, string5);
                        if (string2 == null) {
                            string4 = string;
                            if (string2 != null) break block5;
                            if (string4.length() != n2 && string2 == null) break;
                            ++n3;
                        }
                        if (string2 == null) continue;
                    }
                    string4 = string;
                }
                return string4;
            }
            string3 = string;
        }
        return string3;
    }
}

