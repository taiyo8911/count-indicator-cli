class BaseballCount {
    public static void main(String[] args) {
        String[] bArray = new String[3];
        String[] sArray = new String[2];
        String[] oArray = new String[2];

        int b = 0;
        int s = 0;
        int o = 0;
        boolean isChange = false;

        String eSymbol = "⚪️";
        String bSymbol = "🟢";
        String sSymbol = "🟡";
        String oSymbol = "🔴";

        System.out.println("B " + eSymbol + eSymbol + eSymbol);
        System.out.println("S " + eSymbol + eSymbol);
        System.out.println("O " + eSymbol + eSymbol);

        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (!isChange) {

            System.out.print("ピッチャー投げた!: ");
            String input = sc.nextLine();

            switch (input) {
                case "b":
                    b++;
                    System.out.println("ボール");
                    if (b == 4) {
                        b = 0;
                        s = 0;
                        System.out.println("フォアボール");
                    }
                    break;
                case "s":
                    s++;
                    System.out.println("ストライク");
                    if (s == 3) {
                        b = 0;
                        s = 0;
                        o++;
                        System.out.println("バッターアウト");
                        if (o == 3) {
                            o = 0;
                            System.out.println("スリーアウトチェンジ!");
                            isChange = true;
                            break;
                        }
                    }
                    break;
                case "o":
                    o++;
                    System.out.println("アウト");
                    if (o == 3) {
                        o = 0;
                        System.out.println("スリーアウトチェンジ!");
                        isChange = true;
                        break;
                    }
                    b = 0;
                    s = 0;
                    break;
                default:
                    break;
            }
            for (int i = 0; i < bArray.length; i++) {
                if (i < b) {
                    bArray[i] = bSymbol;
                } else {
                    bArray[i] = eSymbol;
                }
            }
            for (int i = 0; i < sArray.length; i++) {
                if (i < s) {
                    sArray[i] = sSymbol;
                } else {
                    sArray[i] = eSymbol;
                }
            }
            for (int i = 0; i < oArray.length; i++) {
                if (i < o) {
                    oArray[i] = oSymbol;
                } else {
                    oArray[i] = eSymbol;
                }
            }
            System.out.println("B " + bArray[0] + bArray[1] + bArray[2]);
            System.out.println("S " + sArray[0] + sArray[1]);
            System.out.println("O " + oArray[0] + oArray[1]);
        }
    }
}