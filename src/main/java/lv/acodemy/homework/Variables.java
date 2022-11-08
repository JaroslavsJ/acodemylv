package lv.acodemy.homework;

public class Variables {
    public static void main(String[] args) {
        /*
        Homework codes and examples.
         */

        // N1 - byte

        byte byteVariable = 120;
        System.out.println(byteVariable);

        byte y = 50;
        System.out.println(y);


        byte a = 50;
        byte d = 50;
        byte c = (byte) (a + d);
        System.out.println(+ c);

        byte Nov_Monday = 2;
        byte Nov_Tuesday = 3;
        byte Nov_Wednesday = 2;
        byte Nov_Thursday = 1;
        byte Nov_Friday = 4;
        byte Total_lunch = (byte) (Nov_Monday + Nov_Tuesday + Nov_Wednesday + Nov_Thursday + Nov_Friday);
        System.out.println("Total lunches per week = "+ Total_lunch);



        byte Monday = 8;
        byte Tuesday = 8;
        byte Wednesday = 8;
        byte Thursday = 8;
        byte Friday = 8;
        byte Total_hours = (byte) (Monday + Tuesday + Wednesday + Thursday + Friday);
        System.out.println("Total hours per week = "+ Total_hours);

        byte Myage = 40;
        byte Wifeage = 28;
        byte Togetherage = (byte) (Myage + Wifeage);
        System.out.println("Togerher our age is "+ Togetherage);

        byte Linj = 6;
        byte plotva = 33;
        byte lesh = 15;
        byte karp = 2;
        byte Total = (byte) (Linj + plotva+lesh+karp);
        System.out.println("Итого Штук "+ Total);


        byte Grape_Snail_2018_pcs = 2;
        byte Grape_Snail_2019_pcs = 30;
        byte Grape_Snail_2020_pcs = 90;
        byte Grape_Snail_2022_pcs = 98;
        byte StayAtm = (byte) (Grape_Snail_2018_pcs + Grape_Snail_2019_pcs + Grape_Snail_2020_pcs - Grape_Snail_2022_pcs);
        System.out.println("Осталось после приготовления улиток "+ StayAtm);





        // N2 - short
        short salary = 2000;
        System.out.println(salary);

        short num3=12;
        short num4=23;
        System.out.println("num1: "+num3);
        System.out.println("num2: "+num4);

        short num1=100;
        short num2=-100;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        short num='a';
        System.out.println("num: "+80);

        short min=-19555;
        short max=19555;
        System.out.println("min: "+min);
        System.out.println("max: "+max);


        //N2 - char

        char letterA = 'A';
        System.out.println(letterA);

        char char1='b';
        char char2='B';
        System.out.println("char1: "+char1);
        System.out.println("char2: "+char2);

        char char11='M';
        char char12='E';
        System.out.println("char11:"+char11);
        System.out.println("char12:"+char12);

        char char3='P';
        char char4='E';
        char char5='R';
        char char6='F';
        char char7='E';
        char char8='C';
        char char9='T';
        char char10='!';
        System.out.println("char3: "+char3);
        System.out.println("char4: "+char4);
        System.out.println("char5: "+char5);
        System.out.println("char6: "+char6);
        System.out.println("char7: "+char7);
        System.out.println("char8: "+char8);
        System.out.println("char9: "+char9);
        System.out.println("char10:"+char10);

        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        char ch3;
        ch3 = 'F';
        System.out.println("ch3 contains " + ch3);
        ch3++;
        System.out.println("ch3 is now " + ch3);

        //N3 - int


        int populationInLatvia = 2000000;
        System.out.println(populationInLatvia);

        int MyPhoneNumber = 26872007;
        System.out.println("Hello my name is Jaroslavs J. MyPhoneNumber"+MyPhoneNumber);


        int num111=900000;
        int num112=-1200000;
        System.out.println("Minimal Population In Latvia at moment: "+num111);
        System.out.println("Maximal Population In Latvia at moment: "+num112);

        int num11= 10555;
        int num12=-10555;
        System.out.println("Max: "+num11);
        System.out.println("Min: "+num12);

        //N4 - integer min and max values


        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);
        System.out.println(minIntValue);

        // N5 - float

        float stockPrice = 5000.50f;
        System.out.println(stockPrice);

        float num13=36.6f;
        float num14=38f;
        System.out.println("Normal Temperature of body: "+num13);
        System.out.println("Hight  Temperature of body: "+num14);

        float num15=8.8f;
        float num16=8.2f;
        float num17=8.1f;
        float num18=7.8f;
        float num19=7.6f;
        float num20=7.4f;
        System.out.println("Average Temperature in Latvia in 2020: "+num15);
        System.out.println("Average Temperature in Latvia in 2019: "+num16);
        System.out.println("Average Temperature in Latvia in 2018: "+num17);
        System.out.println("Average Temperature in Latvia in 2017: "+num18);
        System.out.println("Average Temperature in Latvia in 2016: "+num19);
        System.out.println("Average Temperature in Latvia in 2015: "+num20);

        // N6 - long


        long coronavirusCases = 63614776L;
        System.out.println(coronavirusCases);

        long num21=6000L;
        System.out.println("How many stars human can watch on the sky: "+num21);

        long min1=-9223372036854775808L;
        long max1=9223372036854775807L;
        System.out.println("min: "+min1);
        System.out.println("max: "+max1);

        // N7 - double


        double twittersPriceInEur = 20659.54;
        System.out.println(twittersPriceInEur);



        double num22=8.58;
        System.out.println("num: "+num22);



        double num23=7;
        double num24=30;
        System.out.println("num1: "+num23);
        System.out.println("num2: "+num24);



        double num25=581216732.323433;
        double num26=7.83684987683688;
        System.out.println("num3: "+num25);
        System.out.println("num4: "+num26);


        //N8 boolean prefix_ is or has

        boolean isSummer = false;
        boolean isAutumn = true;
        boolean hasValue = true;
        System.out.println(isAutumn);



        boolean b7=true;
        boolean b8=false;
        boolean b9=(b7==b8);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);


        boolean isJavaFun = true;
        boolean isJavaNotFun = false;
        System.out.println(isJavaFun);
        System.out.println(isJavaNotFun);

        boolean b10 = false;
        boolean b12 = true;
        boolean b13 = (b10==b12);
        boolean b14 = (b10!=b12);

        // Add comment

    }











}


