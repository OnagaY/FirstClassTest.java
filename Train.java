class Train {
    public static void main (String args[]) {
        int score = Integer.parseInt(args[0]);
        final int a = 50;

        //赤点引き上げ
        a = 55;

        System.out.println(String.format("今回のテストの赤点ラインは%d", a));

        if (score > a ){
            System.out.println("合格です");
        } else if  (score <= a) {
            System.out.println("赤点です");
        }
        
    }
}